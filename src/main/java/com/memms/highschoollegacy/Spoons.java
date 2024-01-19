package com.memms.highschoollegacy;

import java.util.Scanner;

public class Spoons {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int i,j,k,p1,p2,add;
		
		int spoons = 21;
			
			System.out.println("Enter the name of Player 1");
			String n1 = kb.next();
			System.out.println("Enter the name of Player 2");
			String n2 = kb.next();
			
		System.out.println("Rules:  Pick 1 or 2 spoons, the player holding the last stick is the loser of the game:");
		
		for(i = 21; i >= 1; i = i - add) {
			System.out.println("Spoons: " + spoons);
			System.out.println(n1 + ", how many spoons do you want to pick up?");
			j = kb.nextInt();
			spoons = spoons-j;
			if (j > 2 || j<1) {
				System.out.println("You have picked up invalid amount of spoons, start again!");
				break;
			}
			if (spoons == 0) {
				System.out.println("Spoons: " + spoons);
				System.out.println(n1+ ", you win!");
				break;
			}
			System.out.println(spoons);
			System.out.println(n2 + ", how many spoons do you want to pick up?");
			k = kb.nextInt();
			spoons = spoons-k;
			if (spoons == 0) {
				System.out.println("Spoons: " + spoons);
				System.out.println(n2+ ", you win!");
				break;
			}
			add = j+k;
		}
		
		
	}
}
