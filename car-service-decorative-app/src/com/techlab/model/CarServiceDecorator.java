package com.techlab.model;

public abstract class CarServiceDecorator implements CarService{
	protected CarService carService;
	
	public CarServiceDecorator(CarService carService) {
		this.carService = carService;
	}
}
