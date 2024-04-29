package com.kilo;

public class Applicaiton {
	
	static void printBinary(long n)
	{
		if (n > 1)
	        printBinary(n / 2);
	    System.out.print(n % 2);
	}
	
	static int updateBits(int n, int m, int i, int j) {
	   int clearMask = -1 << (j + 1);
	   int captureMask = (1 << i) - 1;
	   int captured = n & captureMask;
	   n &= clearMask;
	   m = m << i;
	   n |= m |= captured;		
	   return n;
	}

	public static void main(String[] args) {
		System.out.println("create a function to merge m into n from positions i to j");
		printBinary(updateBits(255, 8, 3, 5));
	}
}