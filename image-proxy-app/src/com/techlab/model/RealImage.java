package com.techlab.model;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		System.out.println("Loading "+this.fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying "+this.fileName);
		
	}

}
