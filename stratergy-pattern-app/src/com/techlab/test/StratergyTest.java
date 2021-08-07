package com.techlab.test;

import java.util.Scanner;
import com.techlab.model.Addition;
import com.techlab.model.Context;
import com.techlab.model.Division;
import com.techlab.model.Multiplication;
import com.techlab.model.Substraction;

public class StratergyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		float a = sc.nextFloat();
		System.out.println("Enter Second Number: ");
		float b = sc.nextFloat();
		Context context = new Context(new Addition());
		System.out.println("Addition is: "+context.executeStratergy(a, b));
		context = new Context(new Substraction());
		System.out.println("Substraction is: "+context.executeStratergy(a, b));
		context = new Context(new Multiplication());
		System.out.println("Multiplication is: "+context.executeStratergy(a, b));
		context = new Context(new Division());
		System.out.println("Division is "+context.executeStratergy(a, b));
		sc.close();
		
	}

}
