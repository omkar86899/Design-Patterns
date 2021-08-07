package com.techlab.model;

public class PremiumHat implements Hat{
	private String name, description;
	private int price;
	
	public PremiumHat() {
		this.description = "Premium Hat";
		this.name = "Premium Hat";
		this.price = 500;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

}
