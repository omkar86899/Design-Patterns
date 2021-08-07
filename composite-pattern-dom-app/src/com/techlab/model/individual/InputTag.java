package com.techlab.model.individual;

import com.techlab.model.HTMLGenerator;

public class InputTag implements HTMLGenerator{
	private String type;
	
	public InputTag(String type) {
		this.type = type;
	}

	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<input type='");
		stringBuilder.append(this.type);
		stringBuilder.append("'>\n");
		return stringBuilder.toString();
	}
	
	
}
