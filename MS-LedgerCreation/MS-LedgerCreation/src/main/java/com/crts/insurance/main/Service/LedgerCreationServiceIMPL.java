package com.crts.insurance.main.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.insurance.main.entity.Customer;
import com.crts.insurance.main.entity.Payment;
import com.crts.insurance.main.entity.Policy;
import com.crts.insurance.main.entity.Receipt;
import com.crts.insurance.main.model.OnCustomerRequest;
import com.crts.insurance.main.model.OnPaymentRequest;
import com.crts.insurance.main.model.OnPolicyRequest;
import com.crts.insurance.main.repository.LedgerCreationCustomerRepository;
import com.crts.insurance.main.repository.LedgerCreationPaymentRepository;
import com.crts.insurance.main.repository.LedgerCreationPolicyRepository;
import com.crts.insurance.main.repository.LedgerCreationReceiptRepository;


@Service
public class LedgerCreationServiceIMPL implements LedgerCreationServiceI{
	@Autowired
	LedgerCreationPaymentRepository paymentRepo;
	
	@Autowired
	LedgerCreationReceiptRepository receiptRepo;
	
	
	@Autowired
	LedgerCreationCustomerRepository customerRepo;
	
	@Autowired
	LedgerCreationPolicyRepository policyRepo;
	
	@Override
	public String saveData(Payment payment) {
		
		paymentRepo.save(payment);
		return "Data Saved Successfully...!!!";
	
	}

	@Override
	public Payment getData(int paymentId) {

		Payment c=paymentRepo.findBypaymentId(paymentId);
		return c;
	}
	
	@Override
	public String saveReceiptData(Receipt receipt) {
		
		receiptRepo.save(receipt);
		return "Data Saved Successfully...!!!";
	}
	
	@Override
	public Receipt getDataReceipt(int receiptId) {
		Receipt r=receiptRepo.findByreceiptId(receiptId);
		return r;
	}
	
	
	@Override
	public String saveCustomerData(Customer customer) 
	{
		customerRepo.save(customer);
		return "Data Saved Successfully...!!!";
	}

	@Override
	public Customer getCustomerData(int customerId) 
	{
		Customer c=customerRepo.findBycustomerId(customerId);
		System.out.println(c.getCustomerName());
		return c;
	}

	@Override
	public String savePolicyData(Policy policy) 
	{
		policyRepo.save(policy);
		return "Data Saved Successfully...!!!";
	}

	@Override
	public Policy getPolicyData(int policyNo) 
	{
	Policy p=policyRepo.findBypolicyNo(policyNo);
		return p;
	}

	@Override
	public OnPolicyRequest getPolicyInformation(int policyNo) {
		OnPolicyRequest onRequest=new OnPolicyRequest();
		Policy policy=policyRepo.findBypolicyNo(policyNo);//All policy data will fetch
		onRequest.setCustomerId(policy.getCustomerId());
		onRequest.setCustomerName(customerRepo.findBycustomerId(policy.getCustomerId()).getCustomerName());
		onRequest.setPolicy(policy);
		return onRequest;
	}

	@Override
	public OnCustomerRequest getCustInformation(int customerId) {
		OnCustomerRequest onRequest=new OnCustomerRequest();
		Customer c=customerRepo.findBycustomerId(customerId);
		onRequest.setCustomerId(c.getCustomerId());
		onRequest.setCustomerName(c.getCustomerName());
		onRequest.setPolicy(c.getPolicies());
		return onRequest;
	}

	@Override
	public String savePaymentRequest(OnPaymentRequest paymentRequest) 
	{
		System.out.println("in");
		Payment pay = paymentRepo.findBypaymentId(paymentRequest.getPaymentId());
		
		Payment pay1 = new Payment();
		pay1.setPaymentId(pay.getPaymentId());
		pay1.setPaymentScheduleDate(pay.getPaymentScheduleDate());
		pay1.setPaymentAmount(pay.getPaymentAmount());
	
		List<Receipt> receipt = new ArrayList<Receipt>();
		receipt.add(paymentRequest.getReceipts());
		pay1.setReceipts(receipt);
		paymentRepo.save(pay1);
		
		
		
		return "success";
	}

	@Override
	public List<Customer> getAllCust() {
		List<Customer> l=(List<Customer>) customerRepo.findAll();
		return l;
	}
	
	

}
