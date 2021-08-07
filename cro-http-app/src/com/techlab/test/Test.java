package com.techlab.test;

import com.techlab.model.AuthorizationHandler;
import com.techlab.model.CompressionHandler;
import com.techlab.model.CookieHandler;
import com.techlab.model.HttpRequestDTO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CookieHandler cookie = new CookieHandler();
		AuthorizationHandler authorization = new AuthorizationHandler();
		CompressionHandler compression = new CompressionHandler();
		cookie.setNext(authorization);
		authorization.setNext(compression);
		HttpRequestDTO dto = new HttpRequestDTO();
		try {
			cookie.check(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
