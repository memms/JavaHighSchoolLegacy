package com.memms.highschoollegacy;

import java.util.Scanner;

public class forHoursSlept {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		int a = 0;
		
		for (int i = 1; i <=7; i++) {
			int day = 0;
			day = 0+i;
			
			System.out.println("Hours slept day " + day);
			a = a+kb.nextInt();
					
		}
		System.out.println("Average number of sleep is " + (a/7) + " hours.");
		
	}
}
