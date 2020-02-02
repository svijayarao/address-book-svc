package com.test.addressbook.service;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class CustomerServiceTest {

  private CustomerService customerService;

  @Before
  public void setUp() {
    customerService = new CustomerServiceImpl();
  }

  @Test
  public void findsCustomersByLastName() {
    assertNull(customerService.findCustomersByLastName("Root"));
  }
}
