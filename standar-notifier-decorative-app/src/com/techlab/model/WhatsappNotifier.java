package com.techlab.model;

public class WhatsappNotifier extends StandarNotifierDecorator{
	
	public WhatsappNotifier(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void sendMessage(String message) {
		notifier.sendMessage(message);
		System.out.println(message+" Send via Whatsapp Number: "+notifier.getMobileNo());
		
	}
}
