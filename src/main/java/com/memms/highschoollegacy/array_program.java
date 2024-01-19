package com.memms.highschoollegacy;

public class array_program {
	public static void main(String args[]) {
		int [] array = new int [1000];
		int i,j;
		int prime =0;
		for(i=0; i<array.length; i++) {
			array[i]=(int)((Math.random()*401)+100);
			System.out.print(array[i]+ " ");
			
			
		}
		for(i=0; i<array.length; i++) {
			if(array[i]%2 != 0 && array[i]%3 != 0 && array[i]%5 != 0&&array[i]%7 != 0 && array[i]%11 != 0) {
				prime++;
			}
		}
		System.out.println();
		System.out.println("Amount of prime numbers: " + prime);
		
		
		int max=100;
		
		int spot = 0;
		int temp = 0;
		
		for(i=999; i>=0; i--) {
			
			for(j=0; j<array.length; j++) {
				if(array[i]>max) {
					temp = array[j];
					max = array[j];
					spot = j;
				}
			}
			temp = array[i];
			array[i] = max;	
		}
		
	}
}
