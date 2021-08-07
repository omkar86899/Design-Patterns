package com.techlab.model;

public class AuthorizationHandler extends HttpRequestChecker{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Chceking Authoriztion");
		if(!(dto.username.equals("admin") && dto.password.equals("admin"))) {
			throw new Exception("Username and Password is incorrect");
		}
		this.checkNext(dto);
	}

}
