package com.memms.highschoollegacy;

import java.util.Scanner;

public class RPD {
	public static void main(String args []) {
		Scanner kb= new Scanner(System.in);
/*		
 *  	//Test 1
		int rand = (int)(Math.random()*3+1);
//		1 = "Rock";
//		2 = "Paper";
//		3 = "Scissor";
		System.out.println(rand);
		
		System.out.println("Enter in your name:");
		String name = kb.nextLine();
		
		System.out.println("Rock? Paper? Scissor? Shoot!");
		String ans = kb.next();
		
		if(rand == '1' && ans == "Paper" || rand == 2 && ans == "Scissor" || rand == 3 && ans == "Rock")
			System.out.println(name+ ", You win!");
		else if (rand == 1 && ans == "Rock")
			System.out.println("Tie!");
		else
			System.out.println(name + ", You lose!");
		//Constant you lose.
		// || rand == 2 && ans == "Scissor" || rand == 3 && ans == "Rock" */
		
		
//		Test 2		
		
/*		
		double rand = (int)(Math.random()*3+1);
//		1 = "Rock";
//		2 = "Paper";
//		3 = "Scissor";
		System.out.println(rand);
		
//		int test = (int)rand;
//		System.out.println(test);
		
		
		System.out.println("Enter in your name:");
		String name = kb.nextLine();
		
		System.out.println("Rock? Paper? Scissor? Shoot!");
		String ans = kb.next();
		ans = ans.toUpperCase();
		
		if(test == '1' && ans.equals("PAPER") || rand == 2 && ans.equals("SCISSOR") || rand == 3 && ans.contentEquals("ROCK"))
			System.out.println(name+ ", You win!");
		else if (rand == 1 && ans == "Rock")
			System.out.println("Tie!");
		else
			System.out.println(name + ", You lose!");
		//Constant you lose.
		// || rand == 2 && ans == "Scissor" || rand == 3 && ans == "Rock"
//		kjhalkajsash;lajslkjfhashjaiuf;ohawlkjhashljdahslkdkaljshdjlaksjd;lajhsd;ijdkajh
*/		
		
//		Test 3		
		
		int rand = (int)(Math.random()*3+1);
//		1 = "Rock";
//		2 = "Paper";
//		3 = "Scissor";
		System.out.println(rand);
		
		String Comp = ""; //To be able to manipulate String later
		
		if (rand == 1)
			Comp = "Rock";
		else if (rand == 2)
			Comp = "Paper";
		else if (rand == 3)
			Comp = "Scissor";
			
		Comp = Comp.toUpperCase();
		System.out.println(Comp);
		
		System.out.println("Enter in your name:");
		String name = kb.nextLine();
		
		System.out.println("Rock? Paper? Scissor? Shoot!");
		String ans = kb.next();
		
		ans = ans.toUpperCase();
		
		System.out.println("The Computer chooses: " + Comp);
		
		if (ans.equals(Comp))
			System.out.println(name + ", it's a tie. Try Again!");
//		else if(ans.equals("Rock") && Comp.equals("Scissor"))
//			System.out.println(name+ ", You win!");
		else if(ans.equals("ROCK") && Comp.equals("SCISSOR") || ans.equals("PAPER") && Comp.equals("ROCK") || ans.equals("SCISSOR") && Comp.equals("PAPER"))
			System.out.println(name+ ", You win!");
//		else if ()
	
		else
			System.out.println(name + ", You lose!");
		
		
	}
}
