package com.test.addressbook.service;


import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.test.addressbook.model.Address;
import com.test.addressbook.repository.AddressRepository;
import java.util.Optional;
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
    when(addressRepository.findById(1L)).thenReturn(Optional.of(new Address()));
    addressService.findAddressById(1L);
    verify(addressRepository).findById(1L);
  }

  @Test
  public void findsNoAddressById() {
    when(addressRepository.findById(1L)).thenReturn(Optional.empty());
    Address address = addressService.findAddressById(1L);
    verify(addressRepository).findById(1L);
    assertNull(address);
  }


}
