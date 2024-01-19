package com.memms.highschoollegacy;

import java.util.Scanner;

public class ThreeMathProblems {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
	/*	System.out.println("I am a groot, please enter in your name.");
		String name = kb.next();
		while(name.equalsIgnoreCase("Wyatt")) {
			
			int first = 0;
			int second = 1;
			String sentence = first + ", " + second;
			
			for ( int i = 0; i<10; i ++) {
				
				first = first + second;
				second = first + second;
				sentence = sentence+", " + first+", "+ second;
				
				
				
			}
	*///		System.out.println(sentence);
			
			
			//42
			//factor 1,2,3,6,7,14,21,42
		System.out.println("Enter a number");
		int i = kb.nextInt();
		int j = 0;
		while ((j<=i)) {
			j++;
			if(i%j==0)
	//			System.out.print(j + " \t");
				System.out.println(j + " is a factor of "+ i);
	//			System.out.println("Factors of "+ i + ":"+ j );
			
		}
			
	//		System.out.println("re-enter in your name to run again");
	//		name = kb.next();
			
			
	//	}
		
	}
}	
