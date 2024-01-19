package com.memms.highschoollegacy;

import java.util.Scanner;

public class Roots {
	public static void main(String args []) {
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter in the constant a value");
		double a = kb.nextInt();
		System.out.println("the value of a entered was " + a);
		System.out.println("Enter in the constant b value");
		double b = kb.nextInt();
		System.out.println("the value of a entered was " + b);
		System.out.println("Enter in the constant c value");
		double c = kb.nextInt();
		System.out.println("the value of a entered was " + c);
		//root 1
		double root1= (int) (Math.sqrt((b*b)-(4.0*(a)*(c))));
		double root12= -b - root1;
		double root123= root12/(2.0*(a));
		System.out.println("Root 1: " + root123);
		
		//root 2
		double root2= (int) (Math.sqrt((b*b)-(4.0*(a)*(c))));
		double root22= -b + root2;
		double root223= root22/(2.0*(a));
		
		System.out.println("Root 2: " + root223);

		
		
	}
}
