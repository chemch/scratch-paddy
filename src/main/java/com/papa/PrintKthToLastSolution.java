package com.papa;
import java.util.*;

public class PrintKthToLastSolution<E> {

	public static void main(String[] args) {
		System.out.println("testing");	

		

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		// set nexts
		n1.right = n2;
		n2.right = n3;
		n3.right = n4;
		// execute solution
		try {
			int k = printKthToLast(n1, 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
	
	// solution
	static int printKthToLast(Node head, int k) {
		if( head == null)
			return 0;
		
		int index = printKthToLast(head.right, k) + 1;
		
		if ( index == k)
			System.out.println(k + " from end is " + String.valueOf(head.value));
		

		return( index );
	}
}