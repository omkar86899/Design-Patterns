package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class HttpRequestDTO {
	public String username, password;
	private List<String> cookies;
	
	public HttpRequestDTO() {
		this.username = "admin1";
		this.password = "admin";
		this.cookies = new ArrayList<String>();
	}
}
