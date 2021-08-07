package com.techlab.test;

import com.techlab.model.CarInspection;
import com.techlab.model.CarService;
import com.techlab.model.OilChange;
import com.techlab.model.TyreRotation;

public class CarServiceDecoratorTest {

	public static void main(String[] args) {
		CarService carInspection = new CarInspection();
		CarService tyreRotationCarService = new TyreRotation(carInspection);
		CarService oilChangeCarService = new OilChange(tyreRotationCarService);
		
		System.out.println(oilChangeCarService.getCost());
	}

}
