package com.memms.highschoollegacy;

import java.util.Scanner;

public class Methods {
	// two types of methods(void and returns)
	static String name = null; 		// name is a global string with no value
	
	public static void main(String args[]) {
		for(int i =0; i<=8;i++) {
			setName();
			String temp = getNameFirstLetter();
			System.out.println(temp);
		}
			
	}
	public static void setName() {
		Scanner kb= new Scanner(System.in);
		System.out.println("What is your name?");
		name = kb.next();
		System.out.println("Hello, " + name);
	}
	public static String getNameFirstLetter() {
		char letter = name.charAt(0);
		String sentence = "Your first letter is " + letter;
		return sentence;
	}
}
