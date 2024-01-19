package com.memms.highschoollegacy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThreeTestAverage {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter in test 1: ");
		double test1 = kb.nextDouble();
		
		System.out.println("Enter in test 2: ");
		double test2 = kb.nextDouble();
		
		System.out.println("Enter in test 3: ");
		double test3 = kb.nextDouble();
		
		double avg = (test1+test2+test3)/3;
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("Your test average is "+fmt.format(avg));
		
	}
}
