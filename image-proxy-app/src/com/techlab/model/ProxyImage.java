package com.techlab.model;

public class ProxyImage implements Image{
	private String fileName;
	private Image realImage;
	
	public ProxyImage(String filename) {
		this.fileName = filename;
	}
	
	@Override
	public void display() {
		if(this.realImage == null) {
			this.realImage = new RealImage(this.fileName);
		}
		realImage.display();
	}

}
