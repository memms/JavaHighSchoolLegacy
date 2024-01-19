package com.memms.highschoollegacy;

import java.util.Scanner;

public class array2_12 {
	public static void main(String args[]) {
		int[]dave = new int [10];
		Scanner kb = new Scanner(System.in);
		int primeCounter = 0;
		
		do {
			System.out.println("Please enter in a number");
			int num = kb.nextInt();
			int factors = 0;
			for(int i =1; i<=num; i++) {
				if(num%i==0)
					factors++;
				
			}
			
			if(factors==2) {
				dave[primeCounter]=num;
				primeCounter++;
				System.out.println(num);
			}
			
		}while (primeCounter<10);
		//enhanced for loop that prints out the array
		for(int temp: dave) {
			System.out.print(temp + " ");
		}
	}
}
