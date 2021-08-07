package com.techlab.model;

public abstract class HomeSecurityChecker {
	private HomeSecurityChecker next;
	
	public void setNext(HomeSecurityChecker next) {
		this.next = next;
	}
	
	public abstract void check(HomeSecurityDTO dto) throws Exception;
	
	protected void checkNext(HomeSecurityDTO dto) throws Exception {
		if(next!=null) {
			next.check(dto);
		}
	}
}
