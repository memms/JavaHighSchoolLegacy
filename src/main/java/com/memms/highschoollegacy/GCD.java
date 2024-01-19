package com.memms.highschoollegacy;

import javax.swing.JOptionPane;

public class GCD {
	private int num1;
	private int num2;
	private int divisor;
	
	public GCD(){
		System.out.println("Welcome to the GCD Program");
		
	}
	public void setNumbers(int x, int y) {
		num1 = x;
		num2 = y; 
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Welcome to the GCD program, "+name);
	}
	public int getGCD() {
		divisor = 1;
		for(int i = 1; i<=num1; i++) {
			if(num1%i==0 && num2%i ==0) {
				divisor = i;
			}
		}
		return divisor;
	}
	

}
