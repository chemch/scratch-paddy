package com.beta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTests {
	@Test
	public void shouldReturnDefaultAge() throws Exception {
		Person chase = new Person( 34, "Chase");
		
		String chaseName = chase.getName();
		System.out.println("Chase's age is " + chase.getAge());
		
		// confirm values match
		Assertions.assertEquals(chaseName, "Chase");
	}
	
	@Test
	public void shouldConfirmPersonCanVote() throws Exception {
		Person person1 = new Person( 19, "Derek");
		
		// confirm values match
		Assertions.assertEquals(true, person1.isVoterAge());
	}
}