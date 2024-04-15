package com.foxtrot;

public class Application {
	public static void main(String[] args) {
		
		ClassSingleton classSingleton1 = ClassSingleton.getInstance();

		System.out.println(classSingleton1.getInfo()); //Initial class info

		ClassSingleton classSingleton2 = ClassSingleton.getInstance();
		classSingleton2.setInfo("New class info");

		System.out.println(classSingleton1.getInfo()); //New class info
		System.out.println(classSingleton2.getInfo()); //New class info
		
//		// threading 1
//		Calculation c1 = new Calculation(1);
//		Thread newThread1 = new Thread(c1);
//		
//		
//		// threading 2
//		Calculation c2 = new Calculation(2);
//		Thread newThread2 = new Thread(c2);
//		
//		newThread1.start();
//		while(newThread1.isAlive()) {
//			System.out.println("cant proceed");
//		}
//		
//		newThread2.start();
//		while(newThread2.isAlive()) {
//			System.out.println("cant proceed either");
//		}
//		
//		System.out.println("this is running in the default thread");
	}
}