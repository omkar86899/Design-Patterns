package com.techlab.model;

public class TyreRotation extends CarServiceDecorator{
	
	public TyreRotation(CarService carService) {
		super(carService);
		System.out.println("Tyre Rotation Done.");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return  350+carService.getCost();
	}

}
