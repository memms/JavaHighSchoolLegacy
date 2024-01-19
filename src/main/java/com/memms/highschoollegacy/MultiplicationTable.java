package com.memms.highschoollegacy;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter in the highest number");
		int high = kb.nextInt();
		
		for(int i = 1 ; i<=high;i++) {
			for (int j =1; j<=high; j++) {
				System.out.print((i*j) + "\t");
			}
			System.out.println("" + "\n");
		}
		
	}
}
