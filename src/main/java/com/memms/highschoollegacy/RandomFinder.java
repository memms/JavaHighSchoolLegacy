package com.memms.highschoollegacy;

import java.util.Scanner;

public class RandomFinder {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter in the inclusive lowest number: ");
		int low = kb.nextInt();
		
		System.out.println("Enter in the inclusive highest number:");
		int high = kb.nextInt();
		
		int a = ((high - low)+1);
		
		int rand = (int)(Math.random()*a+low);
		
		System.out.println("Random number:  " + rand);
		
		
	}
}
