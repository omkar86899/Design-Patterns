package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class SmsNotifier implements INotifier {

	@Override
	public void notify(Account acc) {
		// TODO Auto-generated method stub
		System.out.println("Updated Balance is "+acc.getBalance());
		System.out.println("SMS is sent Successfully");
	}

}
