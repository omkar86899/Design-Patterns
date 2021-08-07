package com.techlab.test;

import com.techlab.model.Internet;
import com.techlab.model.ProxyInternet;

public class ProxyTest {

	public static void main(String[] args) {
		Internet proxyInternet = new ProxyInternet();
		proxyInternet.connectTo("google.com");
		proxyInternet.connectTo("abc.com");
	}

}
