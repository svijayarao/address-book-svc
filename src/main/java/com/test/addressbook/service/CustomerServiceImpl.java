package com.test.addressbook.service;

import com.test.addressbook.model.Customer;
import com.test.addressbook.repository.CustomerRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

  private CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> findCustomersByLastName(String lastName) {
    return customerRepository
        .findByLastNameIgnoreCase(lastName)
        .orElse(Arrays.asList());
  }
}
