package com.memms.highschoollegacy;

import java.util.Scanner;

public class LeapYear {
	public static void main (String args []) {
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter in a year");
		int year = kb.nextInt();
		
		if(year%400 == 0 || year%4 ==0 && year%100 != 0 )
		{	
			System.out.println(year + " is a leap year.");
//			if(year%4 == 0 && year%100 != 0)
			{
//				System.out.println(year + " is a leap year.");
			}
		}
//			if(year%100 == 0 && year%400 != 0)
//				System.out.println(year +" is not a leap year.");
			
		else
			System.out.println(year + " is not a leap year");
		
	
}
}
