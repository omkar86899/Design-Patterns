package com.techlab.model;

public class Tesla implements IAuto {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopped");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Tesla");
	}

}
