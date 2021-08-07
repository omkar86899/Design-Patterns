package com.techlab.test;

import com.techlab.model.DataService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				DataService ds1 = DataService.getInstance();
				System.out.println(ds1.hashCode());
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				DataService ds2 = DataService.getInstance();
				System.out.println(ds2.hashCode());
			}
		});

		t1.start();
		t2.start();
	}

}
