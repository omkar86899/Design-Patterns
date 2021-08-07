package com.techlab.test;

import com.techlab.model.Customer;
import com.techlab.model.FaceBookNotifier;
import com.techlab.model.Notifier;
import com.techlab.model.SlackNotifier;
import com.techlab.model.SmsNotiFier;
import com.techlab.model.StandardNotifier;
import com.techlab.model.WhatsappNotifier;

public class CustomerDecoratorTest {

	public static void main(String[] args) {
		Customer customer = new Customer(0, "omkar", "abc@abc,com", "facebook-account", "slack-account", "7815432468");
		
		Notifier notifier = new SlackNotifier(new FaceBookNotifier(new SmsNotiFier(new WhatsappNotifier(new StandardNotifier(customer)))));
		notifier.sendMessage("Hi");
	}

}
