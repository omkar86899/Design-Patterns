package com.techlab.test;

import com.techlab.model.IShape;
import com.techlab.model.RedShapeDecorator;
import com.techlab.model.Square;

public class DecoratorTest {

	public static void main(String[] args) {
		IShape square = new Square();
		IShape redSquare = new RedShapeDecorator(square);
		
		System.out.println("normal square");
		square.draw();
		
		System.out.println("\nred square");
		redSquare.draw();
	}

}
