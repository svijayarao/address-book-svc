package com.test.addressbook.service;

import com.test.addressbook.model.Customer;
import java.util.List;

public interface CustomerService {

  List<Customer> findCustomersByLastName(String lastName);
}
