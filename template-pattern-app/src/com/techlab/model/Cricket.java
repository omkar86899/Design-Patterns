package com.techlab.model;

public class Cricket extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game is Iniatialized! Start Playing");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game Started.");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game Finished.");
	}

}
