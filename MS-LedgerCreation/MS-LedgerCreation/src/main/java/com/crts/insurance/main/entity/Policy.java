package com.crts.insurance.main.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Policy {
	@Id
	private int policyNo;
	private String policyStartDate;
	private String policyExpiryDate;
	private String policyTermsConditionDescription;
	@OneToMany(targetEntity = Payment.class,cascade = CascadeType.ALL)
	@JoinColumn(name="policy_payment",referencedColumnName = "policyNo")
	private Set<Payment> payments;
	private int customerId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public String getPolicyExpiryDate() {
		return policyExpiryDate;
	}
	public void setPolicyExpiryDate(String policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}
	public String getPolicyTermsConditionDescription() {
		return policyTermsConditionDescription;
	}
	public void setPolicyTermsConditionDescription(String policyTermsConditionDescription) {
		this.policyTermsConditionDescription = policyTermsConditionDescription;
	}
	
	
}
