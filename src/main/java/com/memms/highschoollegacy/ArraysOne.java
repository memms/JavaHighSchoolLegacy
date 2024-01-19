package com.memms.highschoollegacy;

public class ArraysOne {
	public static void main (String args[]) {
		
		String student0= "Evan";
		String student1 = "Ethan";
		String student2 = "Rose";
		System.out.println(student0 + student1 + student2);
		
		//make 1 array that holds all students
		String [] students = {"Evan","Ethan","Rose"};
		System.out.println(students[0]+", "+students[1]+ " , "+ students[2]);
		
		int classSize = students.length;
		System.out.println(classSize);
		
		int [ ] quizzes = {103,91,99,98,203,95};
		System.out.println(quizzes);
		for (int i =0; i<=5 ; i++)
		{
			System.out.println(quizzes[i]);
		}
		boolean [ ] choices = {true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false,true,false};
		int trueCounter =0;
		int falseCounter = 0;
		for (int a=0; a<choices.length; a++)
		{
			System.out.println(choices[a]);
			if (choices[a] ==true)
				trueCounter++;
			else 
				falseCounter++;
		}
		System.out.println("True(S):"+trueCounter+"False(S)"+trueCounter);
	}

}

