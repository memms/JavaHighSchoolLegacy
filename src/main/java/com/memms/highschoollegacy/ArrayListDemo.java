package com.memms.highschoollegacy;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		
		//array (fixed-length)
		int [] nums = new int [5];
		//holds up to 5 numbers only
		//add five random numbers to an array
		nums[0] = 2;
		nums[1] = 4;
		nums[2]	= 10;
		nums[3]	= 14;
		nums[4] = 22;
		
		
		//array list(variable length)
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		//works with Strings, Booleans, doubles, chars, 
		
		numbers.add(6);
		numbers.add(10);
		numbers.add(22);
		numbers.add(100);
		numbers.add(98);
		System.out.println(numbers);
		//queue
		
		numbers.remove(0);
		numbers.set(1, 42);
		System.out.println(numbers);
		
		numbers.size();
		System.out.println(numbers.size());
		
		int sum = numbers.get(0)+numbers.get(1);
		System.out.println(sum);
		
		numbers.clear();
		System.out.println(numbers);



		
	}
}
