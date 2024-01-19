package com.memms.highschoollegacy;

import java.util.Scanner;

public class CoinFinder {
	public static void main(String args []) {
		Scanner kb =new Scanner(System.in);
		
		System.out.println("How much money do you have?");
		double total = kb.nextDouble();
		
		double quarters = total/.25;
		System.out.println((int)(quarters) + " quarters");
		double quarters2 = total%.25;
//		System.out.println(quarters2);
		
		double dime = quarters2/.1;
		System.out.println((int)(dime) + " dimes");
		double dime2 = quarters2%.1;
		
		double nickel = dime2/.05;
		System.out.println((int)(nickel) + " nickel");
		double nickel2 = dime2%.05;
		
		double pennies = nickel2/.01;
		System.out.println((int)(pennies) + " pennies");
		
		
	}
}
