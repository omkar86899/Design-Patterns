package com.techlab.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;

public class Test {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("config.properties");
		Properties prop = new Properties();  
	    prop.load(reader);
		@SuppressWarnings("deprecation")
		IAutoFactory autoFactory = (IAutoFactory) Class.forName(prop.getProperty("autoFactory")).newInstance();
		IAuto auto = autoFactory.make();
		auto.start();
		auto.stop();
		auto.getName();
	}

}
