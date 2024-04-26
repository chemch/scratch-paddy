package com.india;

public class Application {

	public static void main(String[] args) {
		System.out.println("3.2 - design stack w/ push, pop and min\n");
		// all operations should be O(1)
		
		StackWithMinimum swm1 = new StackWithMinimum();
		swm1.push(5);
		
		System.out.println(swm1.toString());
		
		swm1.push(9);
		
		System.out.println(swm1);
		
		swm1.push(1);
		
		swm1.push(2);
		
		swm1.min();
		
		swm1.pop();
		
		swm1.pop();
		System.out.println(swm1);
	}
}