package com.memms.highschoollegacy;

import java.util.Scanner;

public class StringsAndMath {
	public static void main(String args []) {
		
		Scanner kb = new Scanner(System.in);
/*		System.out.println("Please enter in your favorite quote");
		String quote = kb.nextLine();
		System.out.println("Your quote is " + quote);
		System.out.println("Please enter in a number less than " + quote.length());
		int num1 = kb.nextInt();
		System.out.println( "you enter in the number " + num1);
		String sub1 = quote.substring(num1);
		System.out.println(sub1);
		String sub2 = quote.substring(0, num1);
		System.out.println("sub2" + sub2);
*/		
		//Two math constants pi and e
		
/*		System.out.println(Math.PI);
		System.out.println(Math.E);
		final double Hunter = 7.3;			// Nothing can change value due to final
		System.out.println(Hunter);
		System.out.println("Please enter in your favorite number");
		int num2 = kb.nextInt();
		System.out.println(num2*num2*num2*num2*num2);
		System.out.println(Math.pow(num2, .5));
		System.out.println(Math.sqrt(num2));
*/		
		
/*		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println(Math.random()*100);
		//truncating the decimal
		System.out.println((int)(Math.random()*10));
*/		
		
		//random make a phone number ###-###-####
		
		
		int phone = ((int)(Math.random()*1000));
		int phone2 = ((int)(Math.random()*1000));
		int phone3 = ((int)(Math.random()*10000));
//		System.out.print(phone);
//		System.out.print("-");
//		System.out.print(phone2);
//		System.out.print("-");
//		System.out.print(phone3);
		//or
//		System.out.println(phone + "-" + phone2 + "-" + phone3);
		
		// No 0's

//		int firstDigit = (int)(Math.random()*9+1);
//		int secondDigit = (int)(Math.random()*9+1);
		
		//random phone area code is between 100 and 900

//		System.out.println((int)(Math.random()*799+101)+"-");

		
	}
}
