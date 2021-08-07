package com.techlab.model;

public class LightChecker extends HomeSecurityChecker {

	@Override
	public void check(HomeSecurityDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Lights");
		if(!dto.ligthsOff) {
			throw new Exception("Lights are On");
		}
		this.checkNext(dto);
	}
	
}
