package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	private Internet realInternet;
	private List<String> bannedSites;
	
	public ProxyInternet() {
		this.realInternet = new RealInternet();
		this.bannedSites = new ArrayList<String>();
		bannedSites.add("abc.com");
		bannedSites.add("xyz.com");
	}
	
	@Override
	public void connectTo(String url) {
		if(bannedSites.contains(url)) {
			System.out.println("Access Denied");
		}else {
			realInternet.connectTo(url);
		}
	}
	
	
}
