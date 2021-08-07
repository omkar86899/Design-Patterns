package com.techlab.model.individual;

import com.techlab.model.HTMLGenerator;

public class LabelTag implements HTMLGenerator{
	private String label;
	
	public LabelTag(String label) {
		this.label = label;
	}
	
	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<label>");
		stringBuilder.append(this.label);
		stringBuilder.append("</label>\n");
		return stringBuilder.toString();
	}

}
