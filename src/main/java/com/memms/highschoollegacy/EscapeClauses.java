package com.memms.highschoollegacy;

public class EscapeClauses {
	public static void main(String args []) {
		
		int var1 = Math.abs(-19);
		System.out.println(var1);
		
		double var2 = Math.round(7.891);
		System.out.println(var2);
		
		//casting -> truncate a number
		int var3 = (int)(3.999994);
		System.out.println(var3);
		
		//random number between 6 and 19, inclusive
		
		int var4 = (int)(Math.random()*14+6); //14 = range + 1, 6 = smallest number
		System.out.println(var4);
		
		System.out.println("\"I saw the sine graph\" \n\tMr. Sn\\yder");
		
		
	}
}
