package com.techlab.model.individual;

import com.techlab.model.HTMLGenerator;

public class ButtonTag implements HTMLGenerator{
	private String buttonName;
	
	public ButtonTag(String buttonName) {
		this.buttonName = buttonName;
	}
	
	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<button>");
		stringBuilder.append(this.buttonName);
		stringBuilder.append("</button>\n");
		return stringBuilder.toString();
	}
	
}
