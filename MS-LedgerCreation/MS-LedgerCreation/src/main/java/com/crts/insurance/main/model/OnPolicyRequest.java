package com.crts.insurance.main.model;





import com.crts.insurance.main.entity.Policy;

public class OnPolicyRequest 
{
	private int customerId;
	private String customerName;
	private Policy policy;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
}
