package com.techlab.model;

public class RibbonedHat extends HatDecorator{
	
	public RibbonedHat(Hat hat) {
		super(hat);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription()+" with ribbon";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 100+hat.getPrice();
	}

}
