/**
 * 
 */
package com.echo;

import java.util.LinkedList;

/**
 * 
 */
public class Phantom extends Aircraft implements Machine {
	// attributes
	private Engine engine = new Engine();
	private LinkedList<String> turbulenceLevels = new LinkedList<String>();
	
	/**
	 * Constructor
	 */
	public Phantom() {
		System.out.println(this.engine.getHorsePower());
	}
	
	public Phantom(int engineHorses) {
		this.engine.setHorsePower(engineHorses);
	}
	
	private class Engine {
		private int horsePower = 0;

		public int getHorsePower() {
			return horsePower;
		}

		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}
	}

	@Override
	public void fly() {
		if( engine.getHorsePower() == 0) {
		System.out.println("Phantom Zoomies.");
		} else {
			System.out.println("Phantom Super Zoomies!");
		}
	}
	
	@Override
	public void upgradeEngine(int horses) {
		this.engine.setHorsePower(horses);
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public LinkedList<String> getTurbulenceLevels() {
		return turbulenceLevels;
	}

	public void setTurbulenceLevels(LinkedList<String> turbulenceLevels) {
		this.turbulenceLevels = turbulenceLevels;
	}
}
