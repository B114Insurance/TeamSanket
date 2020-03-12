package com.crts.insurance.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.entity.Customer;
import com.crts.insurance.main.entity.Payment;


@Repository
public interface LedgerCreationPaymentRepository extends CrudRepository<Payment, Integer>
{

	Payment findBypaymentId(int paymentId);
	
	

}

