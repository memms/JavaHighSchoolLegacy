package com.memms.highschoollegacy;

import java.util.Scanner;

public class DistanceDriver {
	
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		String again = "yes";
		//making an instance of the distance class
		//or making an object from the distance class
		Distance object1 = new Distance();
		do {
			System.out.println("1] add points in \n2] find distance \n3] eliminate a point");
			int choice = kb.nextInt();
			if(choice ==1) {
				object1.setPoints();
			}
			if(choice ==2) {
				object1.setDistance();
			}
			if(choice ==3) {
				object1.eliminatePoints();
			}
			
			System.out.println("Would you like to run again?(yes or no)");
			again = kb.next();
		}while(!again.equalsIgnoreCase("no"));
		System.out.println("Have a great day and play lacrosse");
	}
	
}
