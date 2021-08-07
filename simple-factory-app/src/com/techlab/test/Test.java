package com.techlab.test;

import com.techlab.model.AutoMobileFactory;
import com.techlab.model.AutoType;
import com.techlab.model.IAuto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoMobileFactory factory = new AutoMobileFactory();
		IAuto auto = factory.make(AutoType.BMW);
		runMethods(auto);
		auto.start();
		auto.stop();
		auto.getName();
	}

	private static void runMethods(IAuto auto) {
		// TODO Auto-generated method stub
		auto.start();
		auto.stop();
		auto.getName();
	}

}
