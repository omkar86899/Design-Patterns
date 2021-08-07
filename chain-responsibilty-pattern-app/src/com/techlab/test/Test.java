package com.techlab.test;

import com.techlab.model.AlarmChecker;
import com.techlab.model.HomeSecurityDTO;
import com.techlab.model.LightChecker;
import com.techlab.model.LocksChecker;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LightChecker light = new LightChecker();
		AlarmChecker alarm = new AlarmChecker();
		LocksChecker locks = new LocksChecker();
		light.setNext(alarm);
		alarm.setNext(locks);
		HomeSecurityDTO dto = new HomeSecurityDTO();
		dto.ligthsOff = true;
		dto.alarmOn = false;
		dto.locksOn = true;
		try {
			light.check(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
