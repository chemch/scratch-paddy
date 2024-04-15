package com.foxtrot;

public class Calculation implements Runnable {
	private int rv = 0;

	public Calculation(int rv) {
		this.setRv(rv);
	}

	@Override
	public void run() {
		int mySum = 0;
		int[] individualValues = {1, 1, 1};
		
		for (int i : individualValues) {
			mySum += i;
		}
		
		// update rv
		rv = mySum;
		
		// show me the money
		System.out.println(rv);
	}

	public int getRv() {
		return rv;
	}

	public void setRv(int rv) {
		this.rv = rv;
	}
}