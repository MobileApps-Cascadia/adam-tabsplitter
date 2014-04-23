package com.adamcharlton.tabsplitter;

import java.util.Scanner;

public class Splitter {

	public static void main(String[] args) 
	{
		System.out.println("Hey how's it going?");
		Scanner user_input = new Scanner(System.in);
		String input = user_input.next();
		System.out.println(input);
		if(input == "good")
		{
			System.out.println("Oh that's just delightful!!!");
		}
		if(input == "bad")
		{
			System.out.println("Oh no I'm so sorry! How tragic!!");
		}
		System.out.println("Anyways... give me a number already.");
		int x = user_input.nextInt();
		int y = calculate(x);
		user_input.close();
		System.out.println(y);
		
	}

	public static int calculate(int x)
	{
		int test = 0;
		test = x;
		test = test/4;
		return test;
	}
}
