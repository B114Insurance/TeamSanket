package com.crts.insurance.main.model;



import com.crts.insurance.main.entity.Receipt;

public class OnPaymentRequest 
{
	private int paymentId;
	private Receipt receipts;
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Receipt getReceipts() {
		return receipts;
	}
	public void setReceipts(Receipt receipts) {
		this.receipts = receipts;
	}
	
	
	

}
