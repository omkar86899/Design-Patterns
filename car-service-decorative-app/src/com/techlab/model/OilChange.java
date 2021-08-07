package com.techlab.model;

public class OilChange extends CarServiceDecorator {

	public OilChange(CarService carService) {
		super(carService);
		System.out.println("Oil Change Done.");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1200+carService.getCost();
	}

}
