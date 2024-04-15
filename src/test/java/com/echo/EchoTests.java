package com.echo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EchoTests {
	@Test
	public void EchoTest1() {
		Aircraft phantom1 = new Phantom();
		// fly away
		phantom1.upgradeEngine(1);
		phantom1.fly();
		
		Assertions.assertTrue(true);
	}
	
	@Test
	public void EchoTest2() {
		try {
			Phantom phantomOmega = new Phantom();
			
			LinkedList<String> newLevels = new LinkedList<String>();
			newLevels.add("rally up");
			newLevels.add("wratchet up");
			newLevels.addFirst("small increase");
			phantomOmega.setTurbulenceLevels(newLevels);
			
			newLevels.forEach(t -> System.out.println(t.toString()));
			
			HashMap<String, Integer> pilotRanking = new HashMap<String, Integer>();
			pilotRanking.put("Tom", 1);
			
			if( pilotRanking.get("Tom").equals(2)) {
				throw new MyException();
			}
			
			Assertions.assertEquals(1, pilotRanking.size());
			
			for(String name : pilotRanking.keySet()) {
				System.out.println(name);
			}
			
			for(Integer ranking : pilotRanking.values()) {
				System.out.println(ranking);
			}
			
			HashSet<Integer> newRankings = new HashSet<Integer>();
			newRankings.add(1);
			newRankings.add(2);
			newRankings.add(1);
			newRankings.add(3);
			
			System.out.println(newRankings.toString());
			
			Iterator<Integer> rankingsIter = newRankings.iterator();
			
			System.out.println(rankingsIter.hasNext());
			
			while( rankingsIter.hasNext()) {
				if(rankingsIter.next().equals(1)) {
					rankingsIter.remove();
				}
			}
			
			System.out.println(newRankings.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("finally");
		}
	}
	
	@Test
	public void shouldUseLambda() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i < 10; i++) {
			numbers.add(i);
		}
		
		Consumer<Integer> myFn = (x) -> {System.out.println(x + 2);};
		numbers.forEach(myFn);
		Assertions.assertTrue(true);
	}
}
