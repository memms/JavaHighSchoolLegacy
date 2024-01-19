package com.memms.highschoollegacy;

import java.util.Scanner;

public class TestAverageCheck {
	public static void main(String args[]) {
Scanner kb = new Scanner(System.in);
		
		int i = 0;
		int j;
		int k = 0;
		while (i<=4) {
			
			System.out.println("Enter in a number: ");
			j = kb.nextInt();
			if (j > 0) {
			k = k+j;
			}
			
			if (j < 0) {
				System.out.println("You have entered a negative number!");
				
				System.out.println("Grades Averaged: " + k);
				break;
			}
		}
		
	
	}
}
