package com.memms.highschoollegacy;

import java.util.Scanner;

public class Array_Checker {
	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		int i;
	//	System.out.println("How many numbers will you be entering?");
	//	int num = kb.nextInt();
	/*	int [] array = new int [num];
		
		for(i=0;i<num;i++) {
			array[i]=(int)(Math.random()*52+23);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int largest = array[0];
		int min = array[0];
		for(i=0; i<num; i++) {
			if(largest<array[i]) {
				largest = array[i];
			}
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println("Max: "+ largest);
		System.out.println("Min: "+ min);
	*/
		
		//Number 2
		
	/*	double [] array = new double [num];
					
		for(i=0;i<num;i++) {
			array[i]=(Math.random()*1+2);
			System.out.print(array[i] + " ");
			
		}
		double largest = array[0];
		double min = array[0];
		double spotmax = 0;
		double spotmin = 0;

		for(i=0; i<num; i++) {
			if(largest<array[i]) {
				largest = array[i];
				spotmax = i;
			}
			if(min>array[i]) {
				min = array[i];
				spotmin = i;
			}
		}
		System.out.println();
		System.out.println("Max index: " + spotmax);
		System.out.println("Max index: " + spotmin);
	*/	
		//Number 3
	/*	
		String[] array = new String [num];
		
		for (i = 0; i<num; i++) {
			System.out.println("Enter a word for position " + (i+1) + ": ");
			array[i]= kb.next();
			
		}
		for(i=0;i<num;i++) {
			System.out.print(array[i] + " ");
			if(array[i].equalsIgnoreCase("apple")) {
				array[i] = "pear";
			}
		}
		System.out.println();
		int counter = 0;
		for(i=0;i<num;i++) {
			System.out.print(array[i] + " ");
			if(array[i].equalsIgnoreCase("dinosaur")) {
				counter++;
			}
		}
		System.out.println();
		System.out.println("The word dinosaur apeared: " + counter + " times. ");
	*/
		//Number 4
		
		System.out.println("How many times will you be flipping a coin?");
		int num = kb.nextInt();
		boolean [] flip= new boolean [num];
		
		for(i=0;i<num;i++) {
			int k = (int)(Math.random()*2+1);
	//		System.out.println(k);
			if(k == 1) {
				flip[i]=true;
			}
			else if ( k==2) {
				flip[i]=false;
			}
			System.out.print(flip[i]+ " ");
		}
		System.out.println();
		int counterflip=0;
		for(i=0;i<num-3;i++) {
			if (flip[i] == flip[i+1] && flip[i] == flip[i+2] && flip[i+2] == flip[i+1]) {
				counterflip++;
			}
		}
		System.out.println("You had " + counterflip + " three streaks in a row");
		
		
		
		
	}
}
