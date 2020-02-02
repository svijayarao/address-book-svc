package com.test.addressbook.service;


import static org.junit.Assert.assertNull;

import com.test.addressbook.repository.AddressRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class AddressServiceTest {

  private AddressService addressService;

  @Mock
  private AddressRepository addressRepository;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    addressService = new AddressServiceImpl(addressRepository);
  }

  @Test
  public void findsAddressById() {
    assertNull(addressService.findAddressById(1L));
  }
}
