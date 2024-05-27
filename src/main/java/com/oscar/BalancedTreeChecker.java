package com.oscar;

public class BalancedTreeChecker {

	public static void main(String[] args) {
		// working nodes
		Node n20 = new Node(20);
		Node n10 = new Node(10);
		Node n1 = new Node(1);
		Node n5 = new Node(5);
		Node n30 = new Node(30);
		
        // building binary tree 
		BinaryTree bt = new BinaryTree();
		n20.left = n10;
		n20.right = n30;
		n10.left = n5;
		n5.left = n1;
		// set root
		bt.root = n20;
		
		// determine if is balanced tree
		boolean rv = isBalanced(n20);
		
		// show values
		System.out.println(rv);
	
	}

	static int checkHeight(Node root) {
		if (root == null) return -1;
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE) {return Integer.MIN_VALUE;}
		
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE) {return Integer.MIN_VALUE;}
		
		int heightDiff = leftHeight - rightHeight;
		
		if(Math.abs(heightDiff) > 1) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	static boolean isBalanced(Node root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
}