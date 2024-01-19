package com.memms.highschoollegacy;

import java.util.Scanner;

public class TicTacToe {
	static String [] row1 = {"1", "2", "3"};
	static String [] row2 = {"4","5","6"};
	static String [] row3 = {"7","8","9"};
	static int place =  0;
	static boolean pl1 = true;
	static boolean pl2 = false;
	static int [] check = {9};
	static Scanner kb = new Scanner(System.in);
	public static void main(String args[]) {
		for(int i = 1; i<=9;i++) {
			getBoard();
			Checker1();
			getBoard();
		}
	}
	public static void getBoard() {
		System.out.println("*****************");
		//enchanced for loop
		for(String temp:row1) {
			System.out.print(temp+"\t");
		}
		System.out.println("");
		for(String temp:row2) {
			System.out.print(temp+"\t");
		}
		System.out.println("");
		for(String temp:row3) {
			System.out.print(temp+"\t");
		}
		System.out.println("");
		System.out.println("*****************");

	}
	public static void Checker1() {
		for(int i =1;i<=9;i++) {
			
			if(i%2 == 0) {
				pl2 = true;
				pl1 =false;
			}
			
			else if(i%2!=0) {
				pl1 = true;
				pl2=false;
			}
			System.out.println("Where would you like to go?");
			place = kb.nextInt();
			System.out.println("You chose: " + place);
			Checker2();
			getBoard();
			
		}	
	}
	public static void Checker2() {
		if(pl1 == true && pl2==false) {
				if(place >=1 && place <=3) {
					row1[place-1] = "x";
				}
				if(place >=4 && place <=6) {
					row2[place-4] = "x";
				}
				if(place >=7 && place <=9) {
					row3[place-7] = "x";
				}
			}
		else if(pl2 = true && pl1 == false) {
			if(place >=1 && place <=3) {
				row1[place-1] = "o";
			}
			if(place >=4 && place <=6) {
				row2[place-4] = "o";
			}
			if(place >=7 && place <=9) {
				row3[place-7] = "o";
			}
		}
	}
}
