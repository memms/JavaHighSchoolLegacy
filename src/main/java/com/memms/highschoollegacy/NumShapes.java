package com.memms.highschoollegacy;

import java.util.Scanner;

public class NumShapes {
	public static void main(String args []) {
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int num = kb.nextInt();
		char sym = '*';
	/*	
		for(int i = 0; i<num; i++) {
			
			for(int k = 2*(num-1); k>=0; k--) {
				System.out.println(" ");
			}	
				for (int j = 0; j<=i; j++) {
					System.out.println("* ");
				}
	//		System.out.println();

	//		
			System.out.println();
			
		}
	//	System.out.println();
		*/
	
	//	for(int i = num; i>= 0; i--) {
		for (int i= num-1; i>=0 ; i--){
		    for (int j=0; j<=i; j++){
		    	System.out.print("*");
		    }
		    System.out.println();
	    }	
		
		for (int i= 0; i<=num-1 ; i++){
		    for (int j=i; j>=0; j--){
		    	System.out.print("*");
		    }
		    System.out.println();
	    }
		
	    
	    
		
		
	}
}
