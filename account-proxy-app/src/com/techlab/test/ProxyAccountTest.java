package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.ProxyAccount;

public class ProxyAccountTest {

	public static void main(String[] args) {
		Account acc = new ProxyAccount(11, "omkar", 2000);
		acc.deposit(100);
		printInfo(acc);
		acc.withdraw(200);
		printInfo(acc);
		
	}


	private static void printInfo(Account acc) {
		System.out.println(acc.getAccName());
		System.out.println(acc.getAccNo());
		System.out.println(acc.getBalance());
		
	}

}
