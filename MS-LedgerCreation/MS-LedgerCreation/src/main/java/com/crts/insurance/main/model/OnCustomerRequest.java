package com.crts.insurance.main.model;

import java.util.Set;

import com.crts.insurance.main.entity.Policy;

public class OnCustomerRequest 
{
	private int customerId;
	private String customerName;
	private Set<Policy> policy;
	
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
	public Set<Policy> getPolicy() {
		return policy;
	}
	public void setPolicy(Set<Policy> policy) {
		this.policy = policy;
	}
	
	
}
