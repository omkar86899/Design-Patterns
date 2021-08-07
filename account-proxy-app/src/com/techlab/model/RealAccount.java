package com.techlab.model;

public class RealAccount implements Account{
	private int accNo;
	private String accName;
	private double balance;

	public RealAccount(int accNo,String accName,double balance) {
		this.accName = accName;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	@Override
	public int getAccNo() {
		return this.accNo;
	}

	@Override
	public String getAccName() {
		return this.accName;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		
	}

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
		
	}
	

}
