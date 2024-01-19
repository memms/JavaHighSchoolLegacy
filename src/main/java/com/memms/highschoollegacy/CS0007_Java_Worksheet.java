package com.memms.highschoollegacy;

import java.util.Scanner;

public class CS0007_Java_Worksheet {
	public static void main(String args[]){
		Scanner kb = new Scanner (System.in);
		
		//Problem 16
		int k;
		int a = 0;
		/*
		while(a>=0) {
			for(k = 1; k<=1; k++) {
			System.out.println("Enter in a number");
			a = kb.nextInt();
			
			}
		if(a>=0)	
			System.out.println("The number you entered was positive.");
		else
			System.out.println("The number is negative.");
		}
		
		*/
		
		//Problem 17
		
		while(a%2==0) {
			for(k = 1; k<=1; k++) {
			System.out.println("Enter in a number");
			a = kb.nextInt();
			
			}
		if(a%2==0)	
			System.out.println("The number you entered was Even.");
		else
			System.out.println("The number is Odd.");
		}
		
	}
}
