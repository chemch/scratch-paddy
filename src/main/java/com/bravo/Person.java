package com.bravo;

public class Person {
	// attributes
	private int age;
	private final String name;

	// constructor
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//getters setters
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isVoterAge() {
		if( this.age < 18 ) {
			return false;
		} else return true;
	}
}