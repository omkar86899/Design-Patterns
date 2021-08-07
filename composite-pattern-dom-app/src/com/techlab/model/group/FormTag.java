package com.techlab.model.group;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.HTMLGenerator;

public class FormTag implements HTMLGenerator, IGroup{
	private List<HTMLGenerator> tags;
	private static int levelCount = 0;
	
	public FormTag() {
		this.tags = new ArrayList<HTMLGenerator>();
	}
	
	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		String level = "\t";
		stringBuilder.append(level.repeat(levelCount)+"<form>\n");
		levelCount++;
		for (HTMLGenerator htmlGenerator : tags) {
			stringBuilder.append(level.repeat(levelCount)+htmlGenerator.generateHTML());
		}
		stringBuilder.append("</form>\n");
		return stringBuilder.toString();
	}

	@Override
	public void addChild(HTMLGenerator tag) {
		// TODO Auto-generated method stub
		this.tags.add(tag);
	}

}
