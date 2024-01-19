package com.memms.highschoollegacy;

import java.util.Scanner;

public class SocSecNumber {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter in your name: ");
		String name = kb.nextLine();
		
		int first = (int)(Math.random()*1000);
		int second = (int)(Math.random()*100);
		int third = (int)(Math.random()*10000);


		
		System.out.println(name + ", your social security number is " + first + "-" + second + "-" + third);
	}

}
