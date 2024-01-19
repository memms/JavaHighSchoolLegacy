package com.memms.highschoollegacy;

import java.util.Scanner;

public class evenadd {
	public static void main(String args []) {
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Enter in a number: ");
	int num = kb.nextInt();
	int a = 0;
	
	if(num > 2) {
	
	for (int i = 2; i <= num; i = i+2) {
		
		a = a+i;
		
	}
	System.out.println("The sum of the evens between 2 and " + num + " is " + a);
	
	}
	else
		System.out.println("Number is less than 2.");
	}
}
