package com.india;

import java.util.Stack;

public class StackWithMinimum extends Stack<Integer>{
	/**
	 * Stack with an embedded stack for keeping track of minimum
	 */
	private static final long serialVersionUID = 1L;
	public Stack<Integer> minStack;
	
	// constructor
	public StackWithMinimum() {
		minStack = new Stack<Integer>();
	}
	
	// push
	public void push(int v) {
		if (v <= min()) {
			minStack.push(v);
		}
		super.push(v);
	}
	
	// pop 
	public Integer pop() {
		int value = super.pop();
		// check if as small as the min and update
		if( value == min()) {
			minStack.pop();
		}
		return value;
	}
	
	// min
	public int min() {
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return minStack.peek();
		}
	}
}