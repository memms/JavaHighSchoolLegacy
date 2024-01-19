package com.memms.highschoollegacy;

import java.util.Scanner;

public class SBudget {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = kb.nextLine();
		System.out.println("How much are you starting at?");
		int Price = kb.nextInt();
		System.out.println("How many items will you be purchasing?");
		int INum = kb.nextInt();
		
		int p1 = 0;
		String item = "";
		
		int j,k;
		
		for ( j = 1; j<= INum; j++) {
			
			System.out.println(name + ", How much was item " + j);
			p1 = kb.nextInt();
			System.out.println("What was Item " + j);
			item = kb.next();
			
			System.out.println();		
			System.out.println("Start: " + (Price));
			System.out.println(p1 + " " +item);
			Price = Price-p1;
			System.out.println("New: " + Price);
			System.out.println();

			
		}
		
	}
}
