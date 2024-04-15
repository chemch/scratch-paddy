package com.echo;

public abstract class Aircraft {
		
	public abstract void upgradeEngine(int horses);
	
	public void stopAircraft() {
		System.out.println("Shutting Down Sir");
	}

	public void fly() {
		System.out.println("Boring old regular flight.");
	}
}
