package com.techlab.model;

public class LocksChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeSecurityDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Locks");
		if(!dto.locksOn) {
			throw new Exception("Locks are Off");
		}
		this.checkNext(dto);
	}

}
