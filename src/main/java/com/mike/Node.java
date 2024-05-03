package com.mike;

public class Node {
	// node class
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public static void deleteNode(Node n) {
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
	}
}