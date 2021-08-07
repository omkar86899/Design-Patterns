package com.techlab.model;

public class AutoMobileFactory {
	
	public IAuto make(AutoType type) {
		if(type == AutoType.AUDI) {
			return new Audi();
		}else if(type == AutoType.BMW) {
			return new BMW();
		}else if(type == AutoType.TESLA) {
			return new Tesla();
		}
		return null;
	}
}
