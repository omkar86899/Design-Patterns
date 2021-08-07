package com.techlab.test;

import com.techlab.model.HTMLGenerator;
import com.techlab.model.group.DivTag;
import com.techlab.model.group.FormTag;
import com.techlab.model.individual.ButtonTag;
import com.techlab.model.individual.InputTag;
import com.techlab.model.individual.LabelTag;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTMLGenerator label1,label2,input1,input2,button;
		FormTag form = new FormTag();
		DivTag div = new DivTag();
		label1 = new LabelTag("Username:");
		input1 = new InputTag("text");
		label2 = new LabelTag("Password:");
		input2 = new InputTag("password");
		button = new ButtonTag("Submit");
		form.addChild(label1);
		form.addChild(input1);
		form.addChild(label2);
		form.addChild(input2);
		form.addChild(button);
		div.addChild(form);
		System.out.println(div.generateHTML());
	}

}
