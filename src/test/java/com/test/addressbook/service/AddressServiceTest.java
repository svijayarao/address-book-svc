package com.test.addressbook.service;


import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;


public class AddressServiceTest {

  private AddressService addressService;

  @Before
  public void setUp() {
    addressService = new AddressServiceImpl();
  }

  @Test
  public void findsAddressById() {
    assertNull(addressService.findAddressById(1L));
  }
}
