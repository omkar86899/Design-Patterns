package com.techlab.model;

public class SmsNotiFier extends StandarNotifierDecorator{
	
	public SmsNotiFier(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void sendMessage(String message) {
		notifier.sendMessage(message);
		System.out.println(message+" send via Mobile Number: "+notifier.getMobileNo());
	}
}
