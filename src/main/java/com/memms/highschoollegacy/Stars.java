package com.memms.highschoollegacy;

public class Stars {
	public static void main(String args[]) {
		int [] num = new int [100];
		int stars =0;
		int stars1= 0;
		int stars2 = 0;
		for (int i = 0; i<num.length; i++) {
			num [i]=(int)(Math.random()*51+50);
			System.out.print(num[i] + " ");
			
			if(num[i]>=90 && num[i]<100) {
				stars++;
			}
			if(num[i]>=80 && num[i]<90) {
				stars1++;
			}	
			if(num[i]>=70 && num[i]<80) {
				stars2++;
			}	
		}
		System.out.println();
		
		
			
		System.out.print("Seventies: ");
		for(int i=0;i<stars2;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Eighties: ");
		for(int i=0;i<stars1;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Nineties: ");
		for(int i=0;i<stars;i++) {
			System.out.print("*");
		}
	}
}
