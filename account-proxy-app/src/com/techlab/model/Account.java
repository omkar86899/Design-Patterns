package com.techlab.model;

public interface Account {
	public void deposit(double amount);
	public void withdraw(double amount);
	public int getAccNo();
	public String getAccName();
	public double getBalance();
}
