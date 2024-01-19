package com.memms.highschoollegacy;

import java.util.Scanner;

public class Arrays_Sorter {
	public static void main (String args []) {
		
		Scanner kb = new Scanner (System.in);
		int i;
		int max = 0;
		int min = 100;
		int counter = 0;
		
		int [] array = new int [100];
		
		for ( i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*100+1);
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
		for ( i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
			
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		int range = ((max+min)/2);
		System.out.println("Range: " + range);
		for ( i=0; i<array.length; i++) {
			if(array[i] == range) {
				counter++;
			}
		}
		System.out.println(range + " was in the array " + counter + " times.");
	}
}
