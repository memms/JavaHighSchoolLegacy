package com.memms.highschoollegacy;

import java.util.Scanner;

public class RunningAverage {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter in the amount of miles run on day 1: ");
		double d1 = kb.nextDouble();
		System.out.println("Enter in the amount of miles run on day 2: ");
		double d2 = kb.nextDouble();
		System.out.println("Enter in the amount of miles run on day 3: ");
		double d3 = kb.nextDouble();
		
		double average = (d1+d2+d3)/3.0;
		System.out.println("Average over the three days is: " + average + " miles per day");
		
		if(average >3.5 && average < 6)
			System.out.println("Perfect amount of miles");
		else if(average < 3.5)
			System.out.println("Too few miles for your training");
		else
			System.out.println("Too many miles for your knees");
			
	}
}
