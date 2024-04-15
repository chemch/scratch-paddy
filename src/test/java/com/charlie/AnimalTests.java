package com.charlie;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTests {
	
	@Test
	public void shouldBeAlive() {
		Animal animal1 = new Animal("Cat", true);
		
		if(animal1.isAlive()) {
			System.out.println("Omg, this animal is alive");
		} else if(!animal1.isAlive()) {
			System.out.println("Oh no, this is looking so good");
		}
		
		Assertions.assertTrue(animal1.isAlive());
	}
	
	@Test
	public void shouldNotBeAlive() {
		Animal animal2 = new Animal("Dog");
		
		// accident
		animal2.setAlive(false);
		
		boolean isItAlive = (animal2.isAlive() ? true : false );
		
		Assertions.assertFalse(isItAlive);
	}
	
	@Test
	public void shouldBeNamedDanny() {
		Animal animal3 = new Animal("Danny", false);
		
		switch(animal3.getName()) {
			case "Danny":
				System.out.println("It's Danny");
				break;
			case "Charlie":
				System.out.println("It ain't Danny");
				break;
			default:
				System.out.println("Don't know who this is");
		}
	}
	
	@Test
	public void shouldBeLongNamed() {
		Animal animal4 = new Animal("ChesterMcFlufferton");
		animal4.setCreatureType(CreatureType.ANIMAL);
		
		String nameLetters = animal4.getName();
		IntStream nameLettersInd = nameLetters.chars();
		
		nameLettersInd.forEach(value -> System.out.println(value));
		
		Assertions.assertTrue(true);
	}
}