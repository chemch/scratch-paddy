package com.alpha;

public class App {

	public static void main(String[] args) {
		System.out.println("Alpha Test");
		
		// create new car
		Car myCar = new Car("RX8");
		System.out.println(myCar.getModel());
	}
}