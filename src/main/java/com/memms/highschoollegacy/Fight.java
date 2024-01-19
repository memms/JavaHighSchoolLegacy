package com.memms.highschoollegacy;

public class Fight {
	private String name;
	private int health;
	private int power;
	public Fight() {
		name = "Hulk Hogan";
		health = (int)(Math.random()*50+50);
		power = (int)(Math.random()*9+1);
	}
	public Fight(String a, int b, int c) {
		name = a;
		health =b;
		power = c;
	}
	public String toString() {
		String data  = "\nName: \t"+name+"\nHealth:"+health+"\nPower:\t"+power;
		return data;
	}
	public int getRoll() {
		int roll=(int)(Math.random()*20+1);
		return roll;
	}
	public int getHealth() {
		return health;
	}
	public int getPower() {
		return power;
	}
	public int newHealth(int num1) {
		health = health-num1;
		return health;
	}
}
