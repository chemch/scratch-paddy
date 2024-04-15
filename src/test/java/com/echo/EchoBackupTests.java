package com.echo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EchoBackupTests {

	@Test
	public void EchoBackupTests1() {
		File testResults = new File("testResults.txt");
		
		try {
			if(testResults.createNewFile()) {
				System.out.println("created");
			} else {
				System.out.println("file already existed");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Assertions.assertTrue(true);
	}
	
	@Test
	public void EchoBackupTests2() {
		try {
			FileWriter fw = new FileWriter("testResults.txt");
			fw.write("writing to it");
			fw.write("writing to it again again again");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void EchoBackupTests3() {
		try {
			File myFile = new File("testResults.txt");
			System.out.println(myFile.getAbsolutePath());
			try (Scanner myScanner = new Scanner(myFile)) {
				while(myScanner.hasNextLine()) {
					System.out.println(myScanner.nextLine());
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@Test
	public void EchoBackupTests4() {
		String str1 = "echo";
		String reversed = "";
		
		char[] letters = str1.toCharArray();
		int lettersLength = letters.length;
		
		for(int x = 0; x < letters.length; x++) {
			reversed += letters[lettersLength - 1 - x];
		}
		
		System.out.println(reversed.toString());
	}
}