package com.crts.insurance.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.entity.Customer;

@Repository
public interface LedgerCreationCustomerRepository extends CrudRepository<Customer, Integer>
{


	Customer findBycustomerId(int customerId);

}
