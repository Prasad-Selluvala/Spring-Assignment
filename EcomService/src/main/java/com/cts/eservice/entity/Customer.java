package com.cts.eservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="cust_id")
	private int custId;
	
	private String customerName;
	
	private String emailId;
	
	private long mobileNum;

	public int getCustId() {
		return custId;
	}

	public void setUserId(int custId) {
		this.custId = custId;
	}

	public String getCustomerrName() {
		return customerName;
	}

	public void setUserName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	

}
