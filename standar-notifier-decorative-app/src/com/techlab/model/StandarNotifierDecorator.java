package com.techlab.model;

public abstract class StandarNotifierDecorator implements Notifier{
	protected Notifier notifier;
	
	public StandarNotifierDecorator(Notifier notifier) {
		this.notifier = notifier;
	}
	
	@Override
	public String getEmail() {
		return this.notifier.getEmail();
	}

	@Override
	public String getFbId() {
		return this.notifier.getFbId();
	}

	@Override
	public String getSlackId() {
		return this.notifier.getSlackId();
	}

	@Override
	public String getMobileNo() {
		return this.notifier.getMobileNo();
	}
}