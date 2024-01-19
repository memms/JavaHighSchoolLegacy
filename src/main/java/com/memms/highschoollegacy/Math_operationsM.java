package com.memms.highschoollegacy;

public class Math_operationsM {
	public static void main (String args[]) {
		//
		String sentence = "My favorite movie is";
		String movie = "Harry Potter";
		
		//Output
		//Way 1
		System.out.println(sentence+" "+movie);
		//Way 2
		System.out.print(sentence);
		System.out.println(" "+movie);
		//
		//
		//integer
		int times = 12;		//How many times have you seen the movie
		System.out.println("I have seen it "+times+" times.");
		
		// If you want output to add put n '()' 
		// eg: "I have seen it "+(3+times)+" times.");
		double rating = 1.3;		//double needed for decimals or error
		System.out.println("The rating of "+movie+" was "+rating);
		
		
		int problem = 8*((2+3)-5);		//() not needed when not applying a string or output.
		System.out.print(problem);
		
		double answer = (36/5.0) + (3/2);
		System.out.println(answer);
		
		//'%' symbol divides and then stores the remainder  //RSA
		//%: modular division, modulo, mod 
		int x = (20)%(11);
		System.out.println(x);
		
		double a = 9+5/2- 3.0/2;
		System.out.println(a);
		
		double b = (5-7)/3+15/6;
		System.out.println(b);
		
		double c = 9%4-17%9+35%8*2.1;
		System.out.println(c);
		
		double d = ((5+11)/5.0)+(22%10)+1;
		System.out.println(d);
		
		int cat = 8;
		System.out.println(cat + " deaths");
		cat = cat+1;
		System.out.println(cat + " deaths");
		cat++;
		System.out.println(cat+ " deaths");
		
	}
	
}
