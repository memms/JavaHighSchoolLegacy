package com.memms.highschoollegacy;

import java.util.Scanner;

public class QuizScores {
	//global array hold ints
	static int [] [] quizzes;
	static Scanner kb = new Scanner(System.in);
	public static void main(String args []) {
		int student = getStudent();
		int quiz = getQuizzes();
		quizzes = new int [student][quiz];
		setFillArray();
		setPrintArray();
	}
	public static int getStudent() {
		System.out.println("How many students: ");
		int x = kb.nextInt();
		return x;
	}
	public static int getQuizzes() {
		System.out.println("How many quiz: ");
		int y = kb.nextInt();
		return y;
	}
	public static void setFillArray() {
		for(int row = 0;row<quizzes.length;row++) {
			for(int column = 0; column<quizzes[0].length;column++) {
				System.out.println("What did student " + (row +1) + " get?");
				quizzes[row][column]=kb.nextInt();
			}
		}
	}
	public static void setPrintArray() {
		for(int row = 0;row<quizzes.length;row++) {
			System.out.print("Student " + (row+1) + "\t");
			
			for(int column = 0; column<quizzes[0].length;column++) {
				System.out.print(quizzes[row][column]+"\t");
			}
			System.out.println("******");
		}
	}
	
	
}
