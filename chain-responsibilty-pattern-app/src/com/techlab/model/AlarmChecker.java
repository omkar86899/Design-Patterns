package com.techlab.model;

public class AlarmChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeSecurityDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Alarm");
		if(!dto.alarmOn) {
			throw new Exception("Alarms are Off");
		}
		this.checkNext(dto);
	}

}
