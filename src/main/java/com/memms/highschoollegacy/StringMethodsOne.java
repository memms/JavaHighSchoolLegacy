package com.memms.highschoollegacy;

import java.util.Scanner;

public class StringMethodsOne {
	public static void main(String args []) {
		
		System.out.println("Please enter in your name");
		
		//Scans for input from keyboard
		Scanner kb = new Scanner(System.in);
		//saves the line
		String name = kb.nextLine();
		System.out.println("You entered the name: " + name);
		
		System.out.println("Please enter in your favorite movies");
		String movies = kb.nextLine();
		System.out.println("Favorie Movies: " + movies);
		
		//String Methods:
		//Change all letters to capitals
		movies = movies.toUpperCase();
		System.out.println(movies);
//		name = name.toUpperCase();
//		System.out.println(name);
		
		movies=movies.toLowerCase();
		System.out.println(movies);
		
		movies=movies.replace('u', 'X');
		System.out.println(movies);
		
		int letters = name.length();
		System.out.println("My name has "+letters+" letters.");
		
		char firstLetter= name.charAt(0);
		System.out.println("The first letter is " + firstLetter);
		
		char lastLetter= name.charAt(letters-1); 
		System.out.println("The last letter is "+lastLetter);
		
		System.out.println(name.substring(2,5));
		
		
		
	}
}
