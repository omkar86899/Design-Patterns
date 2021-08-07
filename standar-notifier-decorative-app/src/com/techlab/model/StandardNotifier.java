package com.techlab.model;

public class StandardNotifier implements Notifier{
	private Customer customer;
	
	public StandardNotifier(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" send via email id: "+this.customer.getEmail());
		
	}

	@Override
	public String getEmail() {
		return this.customer.getEmail();
	}

	@Override
	public String getFbId() {
		return this.customer.getFbId();
	}

	@Override
	public String getSlackId() {
		return this.customer.getSlackId();
	}

	@Override
	public String getMobileNo() {
		return this.customer.getMobileNo();
	}
	
}
