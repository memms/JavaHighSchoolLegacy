package com.memms.highschoollegacy;

import java.util.Scanner;

public class CheckFactors {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		String finish = "no";
		System.out.println("What is your name");
		String name = kb.next();
		
		do {
			System.out.println("Please enter in a number");
			int first = kb.nextInt();
			System.out.println("Please enter in a number");
			int second = kb.nextInt();
			
			if(first%second == 0)
				System.out.println(first + " is a factor of " + second);
			else if(second%first == 0)
				System.out.println(second + " is a factor of " + first);
			else
				System.out.println(second + " and " + first +" are not factors of each other ");
			
			System.out.println("Are you finished?(yes or no)");
			finish = kb.next();
		}while( !(finish.equalsIgnoreCase("yes")));
		System.out.println("Have a great day.");
		
		
	}
}
