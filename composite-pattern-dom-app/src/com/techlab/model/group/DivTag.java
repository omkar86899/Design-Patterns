package com.techlab.model.group;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.HTMLGenerator;

public class DivTag implements HTMLGenerator, IGroup{
	private List<HTMLGenerator> tags;
	private static int levelCount = 0;
	
	public DivTag() {
		this.tags = new ArrayList<HTMLGenerator>();
	}
	
	@Override
	public String generateHTML() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		String level = "\t";
		stringBuilder.append(level.repeat(levelCount)+"<div>\n");
		levelCount++;
		for (HTMLGenerator htmlGenerator : tags) {
			stringBuilder.append(level.repeat(levelCount)+htmlGenerator.generateHTML());
		}
		stringBuilder.append("</div>\n");
		return stringBuilder.toString();
	}

	@Override
	public void addChild(HTMLGenerator tag) {
		// TODO Auto-generated method stub
		this.tags.add(tag);
	}

}