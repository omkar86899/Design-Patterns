package com.techlab.model;

public class Football extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Football Game Initialized! Start Playing");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football Game is Started.");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football Game is Finished.");
	}

}
