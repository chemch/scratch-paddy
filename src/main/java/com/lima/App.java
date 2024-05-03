package com.lima;

public class App {
	
	static class Node {
		Node next = null;
		int data;
		
		public Node(int d) {
			data = d;
		}
	}
	
	static void removeDupes(Node head) {
		// start with head node
		Node current = head;
		// go down tail
		while(current != null) {
			// runner to traverse down tail
			Node runner = current;
			
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else { 
					runner = runner.next; 
					}
			}
			current = current.next;
		}
		
		System.out.println(head.data); // nA
		System.out.println(head.next.data); //nB
		System.out.println(head.next.next.data); //nC
		//System.out.println(head.next.next.next.data); //nD
	}

	public static void main(String[] args) {
		// implement algo to remove dupes from singly linked list

		Node nA = new Node(1);
		Node nB = new Node(2);
		Node nC = new Node(2);
		Node nD = new Node(3);
		
		nA.next = nB;
		nB.next = nC;
		nC.next = nD;
		
		removeDupes(nA);
//		
//		System.out.println(nA.data);
//		System.out.println(nB.data);
//		System.out.println(nC.data);
//		System.out.println(nD.data);
	}
}