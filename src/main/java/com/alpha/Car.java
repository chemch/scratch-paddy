package com.alpha;

public class Car {
	final static String make = "Chevy";
	String model = "N/A";
	
	public String getModel( ) {
		return this.model;
	}
	
	public String getMake() {
		return Car.make;
	}
	
	public Car(String model) {
		this.model = model;
	}
}