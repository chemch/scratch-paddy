package com.mike;

public class App {
	
	// implement algo to remove arb node in middle of singly linked list

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		n1.next = n2;
		n2.next = n3;
		
		Node.deleteNode(n2);
		System.out.println(n1.toString());
	}
}