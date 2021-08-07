package com.techlab.model;

public interface Notifier {
	public void sendMessage(String message);
	public String getEmail();
	public String getFbId();
	public String getSlackId();
	public String getMobileNo();
	
}
