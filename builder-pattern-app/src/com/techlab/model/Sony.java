package com.techlab.model;

public class Sony extends Company {

	@Override
	public int price() {
		return 200;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}
}
