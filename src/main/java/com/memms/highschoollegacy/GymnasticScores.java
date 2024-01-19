package com.memms.highschoollegacy;

import java.text.NumberFormat;
import java.util.Scanner;

public class GymnasticScores {
	static int gymnasts = 0;
	static int judges=0;
	static double [] [] scores;
	static Scanner kb = new Scanner(System.in);
	static NumberFormat format = NumberFormat.getInstance();
	
	public static void main(String args[]) {
		gymnasts = getAmtGymnasts();
		judges = getAmtJudges();
		scores  =  new double[gymnasts][judges];
		
		fillArray();
		printArray();
		findAverages();
	}
	public static int getAmtGymnasts() {
		System.out.println("How many gymnasts?");
		int x  = kb.nextInt();
		return x;
	}
	public static int getAmtJudges() {
		System.out.println("How many Judges?");
		int x  = kb.nextInt();
		return x;
	}
	public static void fillArray() {
		format.setMaximumFractionDigits(3);
		for(int i = 0; i<gymnasts; i++) {
			for(int j = 0; j<judges; j++) {
				scores [i][j] = (Math.random()*9+1);
		//		scores[i][j] = (format.format(scores[i][j]));
			}
		}
	}
	public static void printArray() {
		format.setMaximumFractionDigits(2);

		for(int i = 0; i<gymnasts; i++) {
			System.out.print("Gymnasts " + (i+1) + ": \t");

			for(int j = 0; j<judges; j++) {
				System.out.print(format.format(scores[i][j]) + "\t");
			}
			System.out.println();
			
		}
	}
	public static void findAverages() {
		double lowest = 10;
		double average = 0;
		for(int i = 0; i<gymnasts; i++) {
			System.out.print("Gymnasits " + (i+1) + " Average: ");
			for(int j = 0; j<judges; j++) {
				if(scores[i][j]<lowest) {
					lowest = scores[i][j];
				}
				average = scores[i][j]+average;
			}
			average= ((average-lowest)/(judges-1));
			System.out.println(average);
			average =0;
			lowest=10;
			
		}
	}
}