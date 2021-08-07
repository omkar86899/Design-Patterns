package com.techlab.model;

public class DataService {
	private static DataService bucket;

	private DataService() {
		System.out.println("Objet is created" + this.hashCode());
	}
	
	/* 
	public static synchronized DataService getInstance() {
		 if(bucket == null) {
			 bucket = new DataService();
		 }
		 return bucket;
	 }
	 */

	public static DataService getInstance() {
		if (bucket == null) {
			synchronized(DataService.class) {
				if(bucket == null) {
					bucket = new DataService();
				}
			}
		}
		return bucket;
	}
}
