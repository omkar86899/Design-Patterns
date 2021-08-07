package com.techlab.model;

public class SlackNotifier extends StandarNotifierDecorator{
	
	public SlackNotifier(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void sendMessage(String message) {
		notifier.sendMessage(message);
		System.out.println(message+" send via slack account: "+notifier.getSlackId());
	}
}
