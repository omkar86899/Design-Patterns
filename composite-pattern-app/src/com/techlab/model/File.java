package com.techlab.model;

public class File implements IStorageItem{
	private String name;
	private int size;
	private String type;
	
	public File(String name, int size, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("File name: "+this.name+", ");
		stringBuilder.append("File Size: "+this.size+", ");
		stringBuilder.append("File Type: "+this.type+"\n");
		return stringBuilder.toString();
	}
}
