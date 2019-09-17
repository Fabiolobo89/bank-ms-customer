package com.itsector.bank.app.customer.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.itsector.bank.app.customer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Optional<Customer> findByProfileId(Long profileId);
}
