package com.memms.highschoollegacy;

public class EnglishClass {
	//Two types of methods(void & return)
	//return method - sends data back
	
	public static void main(String [] args) {
			//call a void method
			setEnglishWelcome();
			//invoke a return method, sends back an integer number
			int catcher = getEnglishNumber();
			System.out.println("Your number is: " + catcher);
			//send back teacher name
			String teach = getEnglishTeacher(catcher);
			System.out.println("Your teacher is " + teach);
			//invoke a void method of math and their ratings
			setMathTeacher();
	}
	public static void setEnglishWelcome() {
		System.out.println("Welcome to the english generator");
	}
	public static int getEnglishNumber() {
		int number =(int)(Math.random()*8);
		return number;
		
	}
	public static String getEnglishTeacher(int num) {
		if(num==0)
			return "Ms. Tooze";
		if(num==1)
			return "Mr. Walsh";
		if(num==2)
			return "Ms. Webster";
		if(num ==3)
			return "Dr.Defazio";
		else
			return "Ms. Weston";
	
	}
	public static void setMathTeacher() {
		//Jayson 	Knoke	Okeefe	Smith
		//6			9		-2		8
		String[][]math = {	{"Jayson","Knoke","Okeefe","Smith"}, 
							{"6","9","-2","8"}};
		for(int row=0;row<2;row++) {
			for(int col = 0; col<4;col++) {
				System.out.print(math[row][col]+"\t");
			}
			System.out.println("");
		}
		
	}
}
