package com.techlab.model;

public class Customer{
	private int id;
	private String name, email, fbId, slackId, mobileNo;
	
	public Customer(int id, String name, String email, String fbId, String slackId, String mobileNo) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.fbId = fbId;
		this.slackId = slackId;
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return this.email;
	}

	public String getFbId() {
		return this.fbId;
	}

	public String getSlackId() {
		return this.slackId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
}
