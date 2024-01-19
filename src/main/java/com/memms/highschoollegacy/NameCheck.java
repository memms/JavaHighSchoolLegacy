package com.memms.highschoollegacy;

import java.util.Scanner;

public class NameCheck {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		String j = "";
		
		while ( !(j.equalsIgnoreCase("END"))  ) {
			System.out.println("Enter in a name: ");
			j = kb.next();
			System.out.println("Name entered: " + j);
			
		}
		
		System.out.println("I'm Done.");
		
	}
}
