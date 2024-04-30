package com.juliett;

public class App {

	public static void main(String[] args) {
		
		// working nodes
		Node n20 = new Node(20);
		Node n10 = new Node(11);
		Node n30 = new Node(20);
		
        // building binary tree 
		BinaryTree bt = new BinaryTree();
		n20.left = n10;
		n20.right = n30;
		// set root
		bt.root = n20;
		
		// determine if is bst
		boolean rv = checkBinarySearchTree(bt.root, null, null);
		
		// show values
		System.out.println(bt.toString());
		System.out.println(rv);
		
	}
	
//	
//	static boolean checkBinarySearchTree(Node n) {
//		return checkBinarySearchTree(n, null, null);
//	}
	
	static boolean checkBinarySearchTree(Node n, Integer min, Integer max) {
		// base case (reached at end)
		if(n == null) {
			return true;
		} 
		
		// check if current node value is outside min max params
		if ((min != null && n.value <= min) || (max != null && n.value > max)) {
			return false;
		}
		
		// narrow down left to check if node values are valid
		if(!checkBinarySearchTree(n.left, min, n.value)) {
			return false;
		}
		
		// narrow down right to check if node values are valid
		if(!checkBinarySearchTree(n.right, n.value, max)) {
			return false;
		}
		
		// default return
		return true;
	}
}