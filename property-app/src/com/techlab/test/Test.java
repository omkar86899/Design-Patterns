package com.techlab.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("config.properties");
		Properties prop = new Properties();  
	    prop.load(reader);
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));
	}

}
