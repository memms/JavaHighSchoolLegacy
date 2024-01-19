package com.memms.highschoollegacy;

import java.util.Scanner;

public class GuessingGameOne {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		int rand = (int) (Math.random()*100+1);
		
	//	System.out.println(rand);
		
		for (int i = 1; i<=5; i++) {
			
		System.out.println("Guess the number(1-100): ");
		int guess = kb.nextInt();	
		
		if (i==5) {
			System.out.println("You have ran out of guesses, correct answer was " + rand);
			
		}
		else if ( guess > rand)
			System.out.println("Guess is higher than random.");
		else if ( guess < rand)
			System.out.println("Guess is lower than random.");
		else
			{
			System.out.println("Correct Guess");
			break;
			}
		
		}
	}
}
