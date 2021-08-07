package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem{
	private String name;
	private List<IStorageItem> children;
	public static int levelCounter = 0;
	
	public Folder(String name) {
		this.name = name;
		children = new ArrayList<IStorageItem>();
	}

	public void addChild(IStorageItem item) {
		children.add(item);
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		String level = "\t";
		stringBuilder.append(level.repeat(levelCounter)+"Folder: "+this.name+"\n");
		levelCounter++;
		for (IStorageItem iStorageItem : children) {
			if(iStorageItem.getClass().getSimpleName().equals("File")) {
				stringBuilder.append(level.repeat(levelCounter)+iStorageItem.display());
			}else {
				stringBuilder.append(iStorageItem.display());
			}
		}
		levelCounter--;
		return stringBuilder.toString();
	}
}
