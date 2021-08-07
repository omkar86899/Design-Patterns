package com.techlab.model;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		setBorder();
		decoratedShape.draw();
	}

	private void setBorder() {
		System.out.println("Setting border color red");
	}
	
	
}
