package com.memms.highschoollegacy;

import java.util.Scanner;

public class Craps_Gambling {
	public static void main (String args[]) {
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Name:");
		String name = kb.next();
		System.out.println("Starting amount:");
		int start = kb.nextInt();
		System.out.println("Craps Game has begun.");
		String i = "yes";
		int fpoint =0;
		int spoint = 0;
		int froll,sroll,sum;
		
		while(!(i.equalsIgnoreCase("no"))) {
			System.out.println("Bet amount:");
			int bet = kb.nextInt();
			froll = (int)(Math.random()*6+1);
			sroll = (int)(Math.random()*6+1);
			sum = froll + sroll;
			System.out.println("Roll is: " + froll + " and " + sroll);
			if(sum == 7 || sum == 11) {
				System.out.println("The round roll is a " + sum + '.');
				System.out.println("You Win!");
				start = start+bet;
			}
			else if ( sum == 2 || sum == 3 || sum == 12) {
				System.out.println("The round roll is a " + sum + '.');
				System.out.println("You Lose!");
				start = start-bet;
			}
			else {
				System.out.println("The point is: " + sum);
				while((!(fpoint + spoint == sum)) && (!(fpoint + spoint == 7))) {
					System.out.println("Rolling Again.");
					fpoint = (int)(Math.random()*6+1);
					spoint = (int)(Math.random()*6+1);
					System.out.println("You rolled a " + fpoint + " and " + spoint);
					if (spoint+fpoint == 7) {
						System.out.println("You Lose.");
						start = start-bet;
					}
					else if(fpoint + spoint == sum) {
						System.out.println("You Win");
						start = start+bet;
					}
					
				}
			}
			
			System.out.println("Amount of money left($): " + start);
			
			System.out.println("Bet Again? (Yes or No)");
			i = kb.next();
		}
		System.out.println("Thanks for playing!");
	}
}
