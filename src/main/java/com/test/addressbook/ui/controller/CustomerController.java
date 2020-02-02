package com.test.addressbook.ui.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import com.test.addressbook.model.Address;
import com.test.addressbook.model.Customer;
import com.test.addressbook.service.CustomerService;
import java.util.List;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  private CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping(value = "/{lastName}", produces = {"application/hal+json"})
  public ResponseEntity<Resources<Customer>> getCustomerByLastName(@PathVariable String lastName) {
    List<Customer> customers = customerService.findCustomersByLastName(lastName);

    if (customers == null || customers.size() == 0) {
      return ResponseEntity.notFound().build();
    }

    customers.forEach(customer -> {
      List<Address> addressList = customer.getAddresses();
      addressList.stream()
          .map(Address::getAddressId)
          .map(addressId ->
              linkTo(methodOn(AddressController.class).getAddressById(addressId))
                  .withRel("address")
          ).forEach(customer::add);
    });

    return ResponseEntity.ok(new Resources<>(customers));
  }

}
