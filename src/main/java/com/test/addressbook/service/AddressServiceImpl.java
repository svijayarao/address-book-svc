package com.test.addressbook.service;

import com.test.addressbook.model.Address;
import com.test.addressbook.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

  private AddressRepository addressRepository;

  public AddressServiceImpl(AddressRepository addressRepository) {
    this.addressRepository = addressRepository;
  }

  @Override
  public Address findAddressById(Long id) {
    return null;
  }
}
