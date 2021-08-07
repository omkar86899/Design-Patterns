package com.techlab.model;

public abstract class HatDecorator implements Hat{
	protected Hat hat;
	
	public HatDecorator(Hat hat) {
		this.hat = hat;
	}
	
	@Override
	public String getName() {
		return this.hat.getName();
	}
}
