package com.techlab.test;

import com.techlab.model.CDBuilder;
import com.techlab.model.CDSetPacker;

public class CDBuilderTest {

	public static void main(String[] args) {
		CDBuilder builder = new CDBuilder();
		CDSetPacker sonyset = builder.buildSonyCD();
		System.out.println(sonyset.showItems());

		CDSetPacker samsungSet = builder.buildSamsungCD();
		System.out.println(samsungSet.showItems());
	}

}
