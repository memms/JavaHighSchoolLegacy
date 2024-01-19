package com.memms.highschoollegacy;

public class ArraysThree {
	public static void main(String args[]) {
		int [] claire = new int [10];
		int i;
		for ( i = 0; i < claire.length; i++) {
			int a = (int)(Math.random()*100+1);
			claire [i] = a;
			
		}
		for ( i = claire.length-1; i >= 0; i--) {
			
			System.out.println(claire[i]);
			
		}

		
	}
}
