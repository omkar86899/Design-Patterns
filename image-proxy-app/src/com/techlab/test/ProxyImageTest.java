package com.techlab.test;

import com.techlab.model.Image;
import com.techlab.model.ProxyImage;

public class ProxyImageTest {

	public static void main(String[] args) {
		Image proxyImage = new ProxyImage("rain.png");
		proxyImage.display();
	}

}
