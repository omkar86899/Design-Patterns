package com.techlab.model;

public class GoldenHat extends HatDecorator{
	
	public GoldenHat(Hat hat) {
		super(hat);
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+" with golden color";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 200 + hat.getPrice();
	}

}
