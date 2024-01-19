package com.memms.highschoollegacy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Buying711 {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("Welcome to 7-11 " + name + "!");
		System.out.println("What is the price of the thing you're buying?");
		double item1 = kb.nextDouble();
		System.out.println("How many are you buying?");
		int amt = kb.nextInt();
		
		double cost = amt * item1;
		System.out.println("Total Cost: " + cost);
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.println(fmt.format(cost));
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println(money.format(cost));
		
		
	}
}
