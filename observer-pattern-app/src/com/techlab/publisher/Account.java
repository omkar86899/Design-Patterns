package com.techlab.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balanace;
	private List<INotifier> notifiers;
	
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balanace = balance;
		this.notifiers = new ArrayList<INotifier>();
	}
	
	public double getBalance() {
		return this.balanace;
	}
	public String getName() {
		return this.name;
	}
	public int getAccNo() {
		return this.accNo;
	}
	
	public void deposit(double amount) {
		this.balanace += amount;
	}
	
	public void withdraw(double amount) {
		if(this.balanace > amount) {
			this.balanace -= amount;
		}
	}
	
	public void addNotifier(INotifier notifier) {
		this.notifiers.add(notifier);
	}
	
	public void sendNotification(Account a) {
		for (INotifier iNotifier : notifiers) {
			iNotifier.notify(a);
		}
	}
}
