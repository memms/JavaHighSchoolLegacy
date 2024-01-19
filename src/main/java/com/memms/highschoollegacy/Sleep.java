package com.memms.highschoollegacy;

import java.util.Scanner;

public class Sleep {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter in your last name.");
		String lastN = kb.next();
		if(lastN.equalsIgnoreCase("Langan"))
			System.out.println("You're not welcome here!");
		else if(lastN.equalsIgnoreCase("Kay"))
			System.out.println("You're not welcome here!");
		else
			System.out.println("Welcome to the study");
		
		System.out.println("Please enter in your age");
		int age = kb.nextInt();
/*		if (age == 25)
			System.out.println("We don't want you");
		else if (age >= 21)
			System.out.println("You are the right age for this study");
		else
			System.out.println("You are too young/older for the study");
*/		
		//everyone but 36 year olds
		
		if (age == 36)
			System.out.println("Nah");
		else 
			System.out.println("Okay!");
		
		if (age != 36)
			System.out.println("Welcome");
		else
			System.out.println("No");
		
		
		
	}
}
