/**
 * 
 */
package com.gulf;

/**
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortList sList = new SortList();
		 
        // Adds data to the list
        sList.addNode(8);
        sList.addNode(3);
        sList.addNode(7);
        sList.addNode(2);
 
        // Displaying original list
        System.out.println("Original list: ");
        sList.display();
 
        // Sorting list
        sList.sortList();
 
        // Displaying sorted list
        System.out.println("Sorted list: ");
        sList.display();
	}
}