package com.memms.highschoollegacy;

import java.util.Scanner;

public class SleepCounter {
	public static void main (String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How much did you sleep on Monday?");
		int Mon = kb.nextInt();
		System.out.println("How much did you sleep on Tuesday?");
		int Tues = kb.nextInt();
		System.out.println("How much did you sleep on Wednesday?");
		int Wed = kb.nextInt();
		System.out.println("How much did you sleep on Thursday?");
		int Thurs = kb.nextInt();
		System.out.println("How much did you sleep on Friday?");
		int Fri = kb.nextInt();
		
		double Average = ((Mon + Tues + Wed + Thurs + Fri)/5.0);
		System.out.println("Average: " + Average);
		
		if (Average == 8)
			System.out.println("You slept perfectly this week!");
		else
			System.out.println("You slept bad!");
		
		//1-10 Guess
		
		System.out.println("Guess a number between 1-10");
		int Guess = kb.nextInt();
		int rand = (int)(Math.random()*10+1);
		if (Guess == rand)
			System.out.println("Winner");
		else 
			System.out.println("Nope!");
		
	}
}
