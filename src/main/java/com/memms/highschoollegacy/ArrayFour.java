package com.memms.highschoollegacy;

import java.util.Scanner;

public class ArrayFour {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		String [] name = new String [5];
		int a;
		double i = 0.0;
		for ( a = 0; a<5; a++) {
			System.out.println("Name " + (a+1));
			name[a]=kb.next();
		}
		
		int [] score = new int [5];
		for(a=0; a<5; a++) {
			score[a] = (int)(Math.random()*9+2);
			System.out.println(score[a]);
		}
		
		System.out.println("Scores:");
		
		for(a=0;a<5;a++) {
			System.out.println(name[a]+" : "+score[a]);
			i = i+score[a];
		}
		
		System.out.println("The average is: " + (i/score.length));
	
	}
}
