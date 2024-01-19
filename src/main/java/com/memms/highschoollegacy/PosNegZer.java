package com.memms.highschoollegacy;

import java.util.Scanner;

public class PosNegZer {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter in your name:");
		String name = kb.nextLine();
		
		System.out.println("Enter in a whole number");
		int num = kb.nextInt();
		
		int last = num%10;
		
//		System.out.println(last);
		
		if (num == 0)
			System.out.println(name + ", It's a 0!");
		else if (last == 0 || last == 2 || last == 4 || last== 6 || last == 8)
			System.out.println(name + ", It's an even!");
		else
			System.out.println(name + ", It's an odd!");
		
		
	}
}
