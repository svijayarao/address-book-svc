package com.test.addressbook.ui.controller;

import com.test.addressbook.model.Address;
import com.test.addressbook.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

  private AddressService addressService;

  public AddressController(AddressService addressService) {
    this.addressService = addressService;
  }

  @GetMapping(value = "/{id}", produces = {"application/hal+json"})
  public Address getAddressById(@PathVariable Long id) {
    return addressService.findAddressById(id);
  }

}
