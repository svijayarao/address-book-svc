package com.test.addressbook.service;

import com.test.addressbook.model.Customer;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public List<Customer> findCustomersByLastName(String lastName) {
    return null;
  }
}
