package com.golf;

public class SortList {

	// node class
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// set head and tail to null
	public Node head = null;
	public Node tail = null;
	
	// display method
	public void display() {
		
		Node current = head;
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	// add node method
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	// sort list method 
	public void sortList() {
		Node current = head, index = null;
		
		int temp;
		
		if(head == null) {
			return;
		} else {
			// 
			while(current != null) {
				index = current.next;
				while(index != null) {
					if(current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
			//
		}
	}
}