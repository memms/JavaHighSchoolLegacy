package com.memms.highschoollegacy;

import java.util.Scanner;

public class NegativeCheck {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
	//	int i = 0;
		int j = 0;
		int k = 0;
		while ( !(j<0)) {
			
			System.out.println("Enter in a number: ");
			j = kb.nextInt();
			if (j > 0) {
			k = k+j;
			}
			
		//	if (j < 0) {
		//		System.out.println("You have entered a negative number!");
		//		
		//		System.out.println("All numbers added up: " + k);
		//		break;
		//	}
			
		}
		System.out.println("You have entered a negative number!");
			
			System.out.println("All numbers added up: " + k);
	}
}
