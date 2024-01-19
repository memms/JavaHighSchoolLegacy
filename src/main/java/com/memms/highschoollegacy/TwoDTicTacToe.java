package com.memms.highschoollegacy;

import java.util.Scanner;

public class TwoDTicTacToe {
	static Scanner kb = new Scanner (System.in);
	static String[][] board;
	static int count = 1;
	static int rows,columns,round;
	public static void main(String args[]) {
		rows  = setRows();
		columns = setColumns();
		board=new String[rows][columns];
		fillBoard();

		for(count=1;count<=9;count++) {
			printBoard();
			setMove();
			winner();
		}
		
	}
	public static int setRows() {
		System.out.println("How many rows would you like to have?");
		int x = kb.nextInt();
		return x;
	}
	public static int setColumns() {
		System.out.println("How many columns would you like to have?");
		int y = kb.nextInt();
		return y;
	}
	public static void fillBoard() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				board[i][j] = (i+1)+","+(j+1);
				
			}
		}
	}
	public static void printBoard() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
				System.out.print(board[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	public static void setMove() {
		System.out.println("Which row would you like to go?");
		int moverow = kb.nextInt();
		System.out.println("Which column would you like to go?");
		int movecolumn = kb.nextInt();
		
		if(count%2!=0 && board[moverow-1][movecolumn-1] !="X" &&board[moverow-1][movecolumn-1] !="O") {
			board[moverow-1][movecolumn-1] = "X";
		}
		if(count%2==0 && board[moverow-1][movecolumn-1] !="X" &&board[moverow-1][movecolumn-1] !="O") {
			board[moverow-1][movecolumn-1] = "O";
		}
	}
	public static void winner() {
		int counter = 0;
		
			for(int j=0;j<columns;j++) {
				if(board[0][j] == "X")
					counter++;
			}
		if(counter == board.length) {
			System.out.println("You Win!");
		}
	}
}

