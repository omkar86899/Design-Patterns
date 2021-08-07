package com.techlab.model;

public class Context {
	private Stratergy stratergy;
	
	public Context(Stratergy stratergy) {
		this.stratergy = stratergy;
	}
	
	public float executeStratergy(float a, float b) {
		return stratergy.calculation(a, b);
	}

}
