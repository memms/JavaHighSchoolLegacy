package com.memms.highschoollegacy;

import java.text.NumberFormat;
import java.util.Scanner;

public class TotalMoney {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many pennies:");
		int pennies = kb.nextInt();
		double pennies1 = pennies * .01;
		
		System.out.println("How many nickels: ");
		int nickels = kb.nextInt();
		double nickels1 = nickels * .05;
		
		System.out.println("How many dimes: ");
		int dimes = kb.nextInt();
		double dimes1 = dimes * .10;
		
		System.out.println("How many quarters:");
		int quarters = kb.nextInt();
		double quarters1 = quarters * .25;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		double total = quarters1 + dimes1 + nickels1 + pennies1;
		System.out.println("Total is " + money.format(total));
		
	}
}
