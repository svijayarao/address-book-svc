package com.test.addressbook.service;

import static org.junit.Assert.assertNull;

import com.test.addressbook.repository.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CustomerServiceTest {

  private CustomerService customerService;

  @Mock
  private CustomerRepository customerRepository;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    customerService = new CustomerServiceImpl(customerRepository);
  }

  @Test
  public void findsCustomersByLastName() {
    assertNull(customerService.findCustomersByLastName("Root"));
  }
}
