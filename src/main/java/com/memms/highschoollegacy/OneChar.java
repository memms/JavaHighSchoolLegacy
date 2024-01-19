package com.memms.highschoollegacy;

import java.util.Scanner;

public class OneChar {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter in your name");
		String name = kb.next();
		int length = name.length();
		
		for(int i = 0; i<length; i++) {
			int a = 0+i;
			System.out.println(name.charAt(a));
		}
	//	System.out.println(name.charAt(0));
	}

}
