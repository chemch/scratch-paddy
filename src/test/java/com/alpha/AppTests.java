package com.alpha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.alfa.Car;

public class AppTests {

	@Test
	public void shouldReturnStaticMake() throws Exception {
		Car myTestCar = new Car("Grand Cherokee");
		
		Assertions.assertEquals(myTestCar.getMake(), "Chevyk");
	}
}