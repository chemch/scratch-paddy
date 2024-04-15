/**
 * 
 */
package com.delta;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * You know, mailbox tests, duh
 */
public class MailboxTests {
	@Test
	public void test1() {
		Assertions.assertTrue(true);
	}
	
	@Test
	public void test2() {
		
		// basic loop
		ArrayList<String> letterList = new ArrayList<String>();
		letterList.add("to foxy");
		letterList.add("from peru w/ love");
		letterList.add("dont return home");
		letterList.remove(0);
		
		letterList.forEach(letter -> System.out.println(letter.toString()));
	
		Mailbox myMailbox = new Mailbox(100, letterList);
		
		// loop 1
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		// loop 2
		int x = 8;
		do {
			++x;
			System.out.println(x);
		}
		while (x < 10);
		
		// loop 3
		for(int y = 0; y <= 20; y+=2 ) {
			System.out.println(y);
		}
		
		// loop 4
		for(String u: myMailbox.getLetters()) {
			if(u.toString().equals("dont return home")) {
				break;
			}
			System.out.println(u.toString());
		}
	}
	
	@Test
	public void test3() {
		String[] loveLetters = { "hey there", "why, hello" };
		System.out.println(loveLetters[0]);
		
		int[][] houseLayout = { {0,5,10}, {7,3,4,5} };
		//System.out.println(houseLayout[1][0]);
		
		for(int r = 0; r < houseLayout.length; r++) {
			//System.out.println(houseLayout[0][r]);
			//System.out.println(r);
			for(int s = 0; s < houseLayout[r].length; s++ ) {
				System.out.println(houseLayout[r][s]);
			}
		}
		
		// dummy test
		Assertions.assertTrue(true);
	}
	
	@Test
	public void test4() {
		
		Mailbox myMailbox = new Mailbox(1, null);
		//int boxCount = myMailbox.getIdSum(myMailbox.getId());
		int boxCount = myMailbox.getIdSumToMax(myMailbox.getId(), 3);
		System.out.println(boxCount);		
		
		Assertions.assertTrue(true);
	}
}