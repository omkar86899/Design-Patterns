package com.techlab.model.individual;

import com.techlab.model.HTMLGenerator;

public class PTag implements HTMLGenerator{
	private String data;
	
	public PTag(String data) {
		this.data = data;
	}
	
	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<p>");
		stringBuilder.append(this.data);
		stringBuilder.append("</p>\n");
		return stringBuilder.toString();
	}
	
}
