package com.crts.insurance.main.Service;

import java.util.List;

import com.crts.insurance.main.entity.Customer;
import com.crts.insurance.main.entity.Payment;
import com.crts.insurance.main.entity.Policy;
import com.crts.insurance.main.entity.Receipt;
import com.crts.insurance.main.model.OnCustomerRequest;
import com.crts.insurance.main.model.OnPaymentRequest;
import com.crts.insurance.main.model.OnPolicyRequest;

public interface LedgerCreationServiceI 
{
	public String saveData(Payment payment);
	public Payment getData(int paymentId);
	public Receipt getDataReceipt(int receiptId);
	public String saveReceiptData(Receipt receipt);
	public String saveCustomerData(Customer customer);
	public Customer getCustomerData(int customerId);
	public String savePolicyData(Policy policy);
	public Policy getPolicyData(int policyNo);
	public OnPolicyRequest getPolicyInformation(int policyNo);
	public OnCustomerRequest getCustInformation(int customerId);
	public String savePaymentRequest(OnPaymentRequest paymentRequest);
	public List<Customer> getAllCust();

}
