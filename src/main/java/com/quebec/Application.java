package com.quebec;

public class Application {

	public static void main(String[] args) {
		
		String test1 = "test";
		String test2 = "abc";
		
		
		System.out.println(isUniqueChar(test2));
		
	}
	
	static boolean isUniqueChar(String str) {
		int checker = 0;
		
		boolean[] charSet = new boolean[128];
		
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(charSet[val]) {
				return false;
			}
			charSet[val] = true;
		}
		return(true);
	}
}
