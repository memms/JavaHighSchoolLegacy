package com.memms.highschoollegacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Distance {
	//this is where all the methods will be stored and created
	//this is where logic takes place
	
	//the constructor method
	Scanner kb = new Scanner(System.in);
	ArrayList <Integer> points = new ArrayList<Integer>();
	
	public Distance() {
		System.out.println("Welcome to the Points Program");
		setPoints();
	}
	public void setPoints() {
		System.out.println("Please enter in x1");
		int x1 = kb.nextInt();
		System.out.println("Please enter in y1");
		int y1 = kb.nextInt();
		
		points.add(x1);
		points.add(y1);
		System.out.println(points);
		
	}
	public void setDistance() {
		System.out.println("What is the first point");
		int p1 = kb.nextInt();
		System.out.println("What is the second point");
		int p2 = kb.nextInt();
		double y1 = (p1*2-1);
		double y2 = (p2*2-1);
		double x1 = (y1-1);
		double x2 = (y2-1);
		
		double d = (Math.sqrt((Math.pow((x2-x1), 2))+ (Math.pow((y2-y1), 2))));
		
		System.out.println("The distance between point " + p1 + " and point " + p2+ " is: " +d);
		System.out.println(points);
	}
	public void eliminatePoints() {
		System.out.println("Which point would you like to remove?");
		int remove = kb.nextInt();
		int y1 = (remove*2-1);
		int x1 = (y1-1);
		points.remove(y1);
		points.remove(x1);
		System.out.println(points);

	}
}
