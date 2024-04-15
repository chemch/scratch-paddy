package com.charlie;

public class Animal extends Creature {
	
	// constructor
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, boolean isAlive) {
		this.name = name;
		this.isAlive = isAlive;
	}
	
	// attributes
	final String type = "N/A";
	private String name;
	private boolean isAlive = true;
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}