package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		Integer[] intArr = {1, 2, 3, 3};
		
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		
		for( int i = 0; i < intArr.length; i++) {
			// check if int is already store
			if( intMap.containsKey(intArr[i])) {
				//System.out.println("exists");
				
				// get current value for given int
				int currentValue = intMap.get(intArr[i]);
				currentValue += 1;
				
				// store again the value incremented
				intMap.put(intArr[i], currentValue);
			} else {
				intMap.put(intArr[i], 1);
			}
		}
		
		int maxCount = 0;	
		ArrayList<Integer> rv = new ArrayList<Integer>();
		
		for (Entry<Integer, Integer> mapEntry: intMap.entrySet()) {
			if(mapEntry.getValue() >= maxCount) {
				rv.clear();
				rv.add(mapEntry.getKey());
				maxCount = mapEntry.getValue();
			}
		};
	
		// print corresponding key
		System.out.println(rv.toString());
	}
}