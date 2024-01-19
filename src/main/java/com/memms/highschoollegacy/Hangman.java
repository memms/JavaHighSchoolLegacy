package com.memms.highschoollegacy;

import java.util.Scanner;

public class Hangman {
	public static void main (String args[]) {
		int i,j;
		Scanner kb = new Scanner (System.in);
		System.out.println("Type in a word");
		String temp = kb.nextLine();
		
		String [] word = new String [temp.length()];
	//	String [] rando = new String [100];
		String [] stars = new String [temp.length()];
		for ( i=0;i<word.length;i++) {
			word[i]= temp.charAt(i)+"";
			System.out.print(word[i]);
			stars[i] = "*";
		}
	//	for(String rando2:rando) {
	//		System.out.println();
	//	}
		for(i = 0; i<100;i++) {
			System.out.println();
		}
		for ( i=0;i<word.length;i++) {
			System.out.print(stars[i]);
		}
		String input = "";
	//	String temp3 = "";
		int lives = 5; //*word.length();
		System.out.println();
		for (i=0;lives>0;i++) {
			System.out.println("Whats your guess: ");
			input=kb.next();
			int correct=0;
			for(j=0;j<word.length;j++) {
				if(word[j].equals(input)) {
	//				temp3 = word[j];
					stars[j]= word[j];
					System.out.println("Correct!");
					for(int k =0; k<stars.length;k++)
						System.out.print(stars[k]);
					System.out.println();
					correct++;
						
				}
				
				if(correct==0&&j==word.length-1){
					lives--;
						
				}	
				
		/*		else  {
					lives--;
				}
				if(lives == 0) {
					System.out.println("You Lost!");
					break;
				}
		*/	}
		/*	for(j=0;j<word.length;j++) {
				if(!word[j].equals((input))) {
					System.out.println();
				}
			}
		*/	
			System.out.println("Lives: " + (lives/word.length));
		}
		
		
	}
}
