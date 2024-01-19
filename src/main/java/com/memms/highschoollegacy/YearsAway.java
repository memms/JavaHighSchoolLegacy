package com.memms.highschoollegacy;

import java.util.Scanner;

public class YearsAway {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many days away from today?");
		int days = kb.nextInt();
		int days2 = Math.abs(days);
		double days3 = days2/365.0;
		
		double years = (Math.round(days3));
		
		System.out.println("That is approximately " + (int)years +" year(s) away from today.");
		
		System.out.println("\"Roses are red \n\tViolets are blue \nI have smelly shoes\" - Tony Green");
		
	}
	
}
