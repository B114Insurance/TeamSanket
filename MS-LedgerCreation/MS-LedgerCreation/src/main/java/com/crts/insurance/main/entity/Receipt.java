package com.crts.insurance.main.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Receipt {
@Id

private int receiptId;
private double cost;
private String time;
public int getReceiptId() {
	return receiptId;
}
public void setReceiptId(int receiptId) {
	this.receiptId = receiptId;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
	
	
}
