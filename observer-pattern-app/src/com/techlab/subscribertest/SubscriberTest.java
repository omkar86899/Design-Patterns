package com.techlab.subscribertest;

import com.techlab.publisher.Account;
import com.techlab.subscriber.EmailNotifier;
import com.techlab.subscriber.SmsNotifier;

public class SubscriberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(11,"omkar",5000);
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		acc1.deposit(1000);
		acc1.sendNotification(acc1);
	}

}
