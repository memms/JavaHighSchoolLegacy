package com.memms.highschoollegacy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HeronFormula {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the length of side 1: ");
		Double a = kb.nextDouble();
		System.out.println("What is the length of side 2: ");
		Double b = kb.nextDouble();
		System.out.println("What is the length of side 3: ");
		Double c = kb.nextDouble();
		
		// 
		
		Double K = a + b + c;
		System.out.println("Perimeter is " + K);
		
		// A = skrt(k(k-a)(k-b)(k-c)
		
		Double k = K/2;
		Double A = (k)*(k-a)*(k-b)*(k-c);
		Double Area = Math.sqrt(A);
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.println("Area is " + fmt.format(Area));
		
		
		
	}
	
}
