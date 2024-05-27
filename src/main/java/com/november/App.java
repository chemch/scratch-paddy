package com.november;

public class App {

	public static void main(String[] args) {
		double scale2 = 0;
		double scale1 = 90000000000000.0;
		
		int i = 1;
		
		while (scale2 != scale1) {
			// move 10 kg
			scale2 += 10;
			scale1 -= 10;
			
			i++; 
			
			double delta = scale2 - scale1;
			System.out.println("Delta: " + delta );
		}
		
		// they must match, show i
		System.out.println("Turn: " + i);
	}
}