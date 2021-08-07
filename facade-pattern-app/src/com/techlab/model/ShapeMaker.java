package com.techlab.model;

public class ShapeMaker {
	private IShape circle, rectangle, square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCicle() {
		this.circle.draw();
	}
	public void drawSquare() {
		this.square.draw();
	}
	public void drawRectangle() {
		this.rectangle.draw();
	}
}
