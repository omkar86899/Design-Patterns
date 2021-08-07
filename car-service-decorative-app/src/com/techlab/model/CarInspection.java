package com.techlab.model;

public class CarInspection implements CarService {

	public CarInspection() {
		System.out.println("Car Inspection Done.");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 250;
	}
}
