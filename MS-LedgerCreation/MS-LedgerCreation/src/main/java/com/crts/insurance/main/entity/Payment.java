package com.crts.insurance.main.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Payment {
	@Id
	private int paymentId;
	private String paymentScheduleDate;
	private double paymentAmount;


	@OneToMany(targetEntity = Receipt.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "receipt_payment", referencedColumnName = "paymentId")
	private List<Receipt> receipts;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentScheduleDate() {
		return paymentScheduleDate;
	}

	public void setPaymentScheduleDate(String paymentScheduleDate) {
		this.paymentScheduleDate = paymentScheduleDate;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public List<Receipt> getReceipts() {
		return receipts;
	}

	public void setReceipts(List<Receipt> receipts) {
		this.receipts = receipts;
	}

	
}
