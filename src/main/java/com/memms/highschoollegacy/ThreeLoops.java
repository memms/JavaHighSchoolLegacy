package com.memms.highschoollegacy;

import java.util.Scanner;

public class ThreeLoops {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		//Three types of loops
		//1st loop - for -loop (Start, ending, increment)
		
		System.out.println("Please enter in your name");
		String name = kb.next();
	//	for(int k =1;k<=10; k++) {
	//		System.out.println(k+ " " + name);
	//	}
		
		//2nd loop - while loop
		int count = 1;
//		while(count<=10) {
//			System.out.println( count + " "+ name);
//			count++;	
//		}
		
		// 3rd loop - do-while loop
		int counter = 100;
		do {
			System.out.println(counter + " " + name);
			counter = counter-5;
		}while (counter>=0);
	}
}
