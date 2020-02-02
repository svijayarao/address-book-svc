package com.test.addressbook.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.test.addressbook.model.Customer;
import com.test.addressbook.repository.CustomerRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
  public void givenLastName_WhenFound_ReturnsCustomers() {
    when(customerRepository.findByLastNameIgnoreCase("root")).thenReturn(Optional.of(Arrays.asList(new Customer())));
    List<Customer> customers = customerService.findCustomersByLastName("root");
    verify(customerRepository).findByLastNameIgnoreCase("root");
    assertThat(customers.size(), is(1));
  }

  @Test
  public void givenLastName_WhenNotFound_ReturnEmptyList() {
    when(customerRepository.findByLastNameIgnoreCase("root")).thenReturn(Optional.of(Arrays.asList()));
    List<Customer> customers = customerService.findCustomersByLastName("root");
    verify(customerRepository).findByLastNameIgnoreCase("root");
    assertThat(customers.size(), is(0));
  }

}
