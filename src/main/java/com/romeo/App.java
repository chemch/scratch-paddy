package com.romeo;

public class App {

	public static void main(String[] args) {
		
	System.out.println("test");
	
	boolean ans = isPerm("test", "tet");
	
	System.out.println(ans);
	}
	
	private static boolean isPerm(String s1, String s2) {
		if(s1.length() != s2.length())
			return(false);
		
		int[] letters = new int[128];
		
		for(int i = 0; i < s1.length(); i++) {
			letters[s1.charAt(i)]++;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			letters[s2.charAt(i)]--;
			
			if(letters[s2.charAt(i)] < 0)
				return false;
		}
		
		return(true);
	}
}