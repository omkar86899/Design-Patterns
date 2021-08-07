package com.techlab.model;

import java.time.LocalTime;

public class ProxyAccount implements Account {
	private int accNo;
	private String accName;
	private double balance;
	private Account realAccount;

	public ProxyAccount(int accNo, String accName, double balance) {
		this.accName = accName;
		this.accNo = accNo;
		this.balance = balance;
		System.out.println("Time before Deposit: "+LocalTime.now());
	}

	@Override
	public void deposit(double amount) {
		if (this.realAccount == null) {
			this.realAccount = new RealAccount(this.accNo, this.accName, this.balance);
		}
		this.realAccount.deposit(amount);
		System.out.println("Time after Deposit: "+LocalTime.now());
	}

	@Override
	public int getAccNo() {
		if(this.realAccount == null) {
			return this.accNo;
		}
		return this.realAccount.getAccNo();
	}

	@Override
	public String getAccName() {
		if(this.realAccount == null) {
			return this.accName;
		}
		return this.realAccount.getAccName();
	}

	@Override
	public double getBalance() {
		if(this.realAccount == null) {
			return this.balance;
		}
		return this.realAccount.getBalance();
	}

	@Override
	public void withdraw(double amount) {
		if (this.realAccount == null) {
			this.realAccount = new RealAccount(this.accNo, this.accName, this.balance);
		}
		this.realAccount.withdraw(amount);
		System.out.println("Time after Withdraw: "+LocalTime.now());
		
	}

}
