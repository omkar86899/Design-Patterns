package com.techlab.model;

public class AutoMobileFactory {
	private static BMW bmw;
	private static Audi audi;
	private static Tesla tesla;
	
	public IAuto make(AutoType type) {
		
		if(type == AutoType.AUDI) {
			if(audi == null) {
				audi = new Audi();
			}
			return audi;
		}else if(type == AutoType.BMW) {
			if(bmw == null) {
				bmw = new BMW();
			}
			return bmw;
		}else if(type == AutoType.TESLA) {
			if(tesla == null) {
				tesla  = new Tesla();
			}
			return tesla;
		}
		return null;
	}
}
