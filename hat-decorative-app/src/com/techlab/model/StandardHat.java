package com.techlab.model;

public class StandardHat implements Hat{
	private String name, description;
	private int price;
	
	public StandardHat() {
		this.description = "Standard Hat";
		this.name = "Standard Hat";
		this.price = 200;
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
