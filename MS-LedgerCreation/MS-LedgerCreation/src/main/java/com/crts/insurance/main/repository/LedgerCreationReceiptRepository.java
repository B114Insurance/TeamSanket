package com.crts.insurance.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.entity.Payment;
import com.crts.insurance.main.entity.Receipt;


@Repository
public interface LedgerCreationReceiptRepository extends CrudRepository<Receipt, Integer>
{

	Receipt findByreceiptId(int receiptId);

	void save(Payment paymentId);
	
}
