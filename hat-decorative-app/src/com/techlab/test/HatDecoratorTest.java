package com.techlab.test;

import com.techlab.model.GoldenHat;
import com.techlab.model.Hat;
import com.techlab.model.PremiumHat;
import com.techlab.model.RibbonedHat;
import com.techlab.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		Hat standardHat, premiumHat, ribboneGoldenPremiumHat, ribboneGoldenStandardHat;
		standardHat = new StandardHat();
		premiumHat = new PremiumHat();
		
		ribboneGoldenStandardHat = new RibbonedHat(new GoldenHat(standardHat));
		ribboneGoldenPremiumHat = new RibbonedHat(new GoldenHat(premiumHat));
		
		printInfo(standardHat);
		printInfo(ribboneGoldenStandardHat);
		printInfo(premiumHat);
		printInfo(ribboneGoldenPremiumHat);
	}

	private static void printInfo(Hat hat) {
		System.out.println("Name: "+hat.getName());
		System.out.println("Description: "+hat.getDescription());
		System.out.println("Price: "+hat.getPrice()+"\n");
	}

}
