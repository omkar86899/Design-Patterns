package com.techlab.model;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String url) {
		System.out.println("Connecting to "+url);
	}

}
