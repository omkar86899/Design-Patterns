package com.techlab.model;

public class CookieHandler extends HttpRequestChecker{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking cookies");
		this.checkNext(dto);
	}

}
