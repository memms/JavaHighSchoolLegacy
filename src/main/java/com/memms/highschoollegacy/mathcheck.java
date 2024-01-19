package com.memms.highschoollegacy;

import java.util.Scanner;

public class mathcheck {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);

		//Number 1
/*	
		System.out.println("Enter a number: ");
		int a = kb.nextInt();
		System.out.println("Enter a another number: ");
		int b = kb.nextInt();
		System.out.println("Enter a third number: ");
		int c = kb.nextInt();
		
		int answer1 = a+b;
		int answer2 = b+c;
		int answer3 = a+c;
		
		if(c == answer1)
			System.out.println(a + "+" + b + " = " + c);
		else if(a == answer2)
			System.out.println(b + "+" + c + " = " + a);
		else if(b == answer3)
			System.out.println(a + "+" + c + " = " + b);
		else
			System.out.println("None work");
		*/
		
		// Number 2
/*		
		System.out.println("Enter a number: ");
		int a = kb.nextInt();
		System.out.println("Enter a another number: ");
		int b = kb.nextInt();
		System.out.println("Enter a third number: ");
		int c = kb.nextInt();
		
		a = (int)(a%10);
		b = (int)(b%10);
		c = (int)(c%10);
		
		
		
		
		if(a==b && b==c)
			System.out.println("They all have the same right most digit " + a);
		else
			System.out.println("The right most digits are not same");
		
		*/
		 
/*		//Number 3
		System.out.println("Enter a number: ");
		int a = kb.nextInt();
		System.out.println("Enter a another number: ");
		int b = kb.nextInt();
		System.out.println("Enter a third number: ");
		int c = kb.nextInt();
*/		
		
		final int MAX = 25;
		int LIMIT = 100;
		int num1 = 12;
		int num2 = 25;
		int num3 = 87;
		
		if ( num1 <MAX )
			if(LIMIT >= num2)
				System.out.println("apple");
		System.out.println("orange");
	//	else
	//		System.out.println("pear");
		
		
	}
}
