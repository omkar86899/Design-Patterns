package com.techlab.model.group;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.HTMLGenerator;

public class BodyTag implements HTMLGenerator, IGroup{
	private List<HTMLGenerator> tags;
	
	public BodyTag() {
		this.tags = new ArrayList<HTMLGenerator>();
	}

	@Override
	public void addChild(HTMLGenerator tag) {
		// TODO Auto-generated method stub
		this.tags.add(tag);
	}

	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<body>");
		for (HTMLGenerator htmlGenerator : tags) {
			stringBuilder.append(htmlGenerator.generateHTML());
		}
		stringBuilder.append("</body");
		return stringBuilder.toString();
	}
}
