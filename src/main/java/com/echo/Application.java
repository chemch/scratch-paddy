package com.echo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Application {
	public static void main(String[] args) {
		try (Scanner myInputReader = new Scanner(System.in)) {
			System.out.println("Enter horse power of new craft:");
			Aircraft phantom2 = new Phantom(myInputReader.nextInt());
			phantom2.fly();
			LocalDateTime ldt = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
			String convDate = ldt.format(dtf);
			System.out.println("Craft built on: " + convDate);
		}
	}
}