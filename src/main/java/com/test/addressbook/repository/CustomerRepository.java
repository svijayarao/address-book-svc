package com.test.addressbook.repository;

import com.test.addressbook.model.Customer;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  Optional<List<Customer>> findByLastNameIgnoreCase(String lastName);
}
