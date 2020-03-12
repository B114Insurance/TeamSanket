package com.crts.insurance.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crts.insurance.main.Service.LedgerCreationServiceI;
import com.crts.insurance.main.entity.Customer;
import com.crts.insurance.main.entity.Payment;
import com.crts.insurance.main.entity.Policy;
import com.crts.insurance.main.entity.Receipt;
import com.crts.insurance.main.model.OnCustomerRequest;
import com.crts.insurance.main.model.OnPaymentRequest;
import com.crts.insurance.main.model.OnPolicyRequest;


@CrossOrigin("*")
@RestController
public class LedgerCreationController 
{
	@Autowired
	LedgerCreationServiceI serv;

//For customer 	
	@PostMapping("/insertCustomerData")
	public String saveCustomer(@RequestBody(required = false)Customer customer)
	{
		String response="Data is Invalid...!!";
		if(customer!=null)
		{
			response=serv.saveCustomerData(customer);
			System.out.println(response);
		}
		return response;
	}
	
	@GetMapping(value="/getCustomerData/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int customerNo)
	{	
		Customer c=(Customer)serv.getCustomerData(customerNo);
		return c;
	}
	
	//For Policy 	
	@PostMapping("/insertPolicyData")
	public String savePolicy(@RequestBody(required = false)Policy policy)
	{
		String response="Data is Invalid...!!";
		if(policy!=null)
		{
			response=serv.savePolicyData(policy);
		}
		return response;
	}

	@GetMapping("/getPolicyData/{policyNo}")
	public Policy getPolicy(@PathVariable("policyNo") int policyNo)
	{	
		Policy p=(Policy)serv.getPolicyData(policyNo);
		return p;
	}

	//For Payment 		
	@PostMapping("/insertPaymentData")
	public String savePayment(@RequestBody(required = false) Payment payment)
	{	
		String response="Data is Invalid...!!";
		if(payment!=null)
		{
			response=serv.saveData(payment);
		}
		return response;
	}

	
	@GetMapping("/getPaymentData/{paymentId}")
	public Payment getPayment(@PathVariable("paymentId") int paymentId)
	{	
		Payment p=(Payment)serv.getData(paymentId);
		return p;
	}
	
	//For Receipt 		
	@PostMapping("/insertRecieptData")
	public String saveReceipt(@RequestBody(required = false) Receipt receipt)
	{	
		String response="Data is Invalid...!!";
		if(receipt!=null)
		{
			response=serv.saveReceiptData(receipt);
		}
		return response;
	}	
	
	@GetMapping("/getReceiptData/{receiptId}")
	public Receipt getReciept(@PathVariable("receiptId") int receiptId)
	{	
		Receipt r=(Receipt)serv.getDataReceipt(receiptId);
		return r;
	}

	
	
	//For ReceiptModel 	class
	
	@PostMapping("/insertPayReceiptData")
	public String savePayReceipt(@RequestBody OnPaymentRequest paymentRequest)
	{	
		
		System.out.println(paymentRequest.getPaymentId()+"\t"+paymentRequest.getReceipts().getReceiptId());
		String success = serv.savePaymentRequest(paymentRequest);
		return success;
		
		
		
	}
		
	//For PolicyModel 	class
	@GetMapping("/getOnRequestPolicy/{policyNo}")
	public OnPolicyRequest getInfo(@PathVariable("policyNo") int policyNo)
	{
		OnPolicyRequest onRequest=serv.getPolicyInformation(policyNo);
		return onRequest;
	}
	
	//For CustomerModel 	class
	@GetMapping("/getOnCustomerRequest/{customerId}")
	public OnCustomerRequest getInfoCustomer(@PathVariable("customerId") int customerId)
	{
		OnCustomerRequest onRequest=serv.getCustInformation(customerId);
		return onRequest;
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAll()
	{
		
		List<Customer> l=serv.getAllCust();
		return l;
	}
	
}
