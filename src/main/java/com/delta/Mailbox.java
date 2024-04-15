package com.delta;

import java.util.ArrayList;

public class Mailbox {
	/**
	 * @param id
	 * @param letters
	 */
	public Mailbox(int id, ArrayList<String> letters) {
		this.id = id;
		this.letters = letters;
	}

	private int id;
	private final String state = "CT";
	private ArrayList<String> letters = new ArrayList<String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public ArrayList<String> getLetters() {
		return letters;
	}

	public void setLetters(ArrayList<String> letters) {
		this.letters = letters;
	}	
	
	public int getIdSum(int i) {
		if( i > 0 ) {
			return i + getIdSum( i - 1);
		} else return 0;
	}
	
	public int getIdSumToMax(int start, int end) {
		if( end < start ) {
			return 0;
		} else {
			return( start + getIdSumToMax( start + 1, end) );
		}
	}
}