package com.techlab.model;

public class FaceBookNotifier extends StandarNotifierDecorator{
	
	public FaceBookNotifier(Notifier notifier) {
		super(notifier);
	}

	@Override
	public void sendMessage(String message) {
		notifier.sendMessage(message);
		System.out.println(message+" send via Facebook account: "+notifier.getFbId());
		
	}
	

}
