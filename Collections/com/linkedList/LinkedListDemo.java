package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * Declare Linked List LinkedList l = new LinkedList(); 
	 * LinkedList<Integer> l = new LinkedList<Integer>(); 
	 * LinkedList<String> l = new LinkedList<String>();
	 * 
	 * 
	 */
	public static void main(String[] args) {

		LinkedList l = new LinkedList(); // LinkedList from Java.util

		// Add Elements into Linked List
		l.add(10);
		l.add(100); 
		l.add("welcome");
		l.add(10.235);   // inserts at the end.
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());

		// remove
				l.remove("welcome"); // al.remove(1) --> remove as per the index value, index starts form 0 to n-1
				l.remove(3);
				System.out.println("elements after removal: " + l.size());

				// add the specific index
				l.add(2, "susheel"); // adds at the 2 index value
				System.out.println("elements after adding with index:" + l);

				// retrive specific element
				// al.get(5); --> exception index out of bounds 
				System.out.println(l.get(1)); // het 1 is the index of the the element/ obj

				// change or replace the element

				l.set(1, "Python");
				System.out.println("latest list after replacing the element:" + l);

				// contains() - > search the elemnt in the array list
				System.out.println(l.contains("Python")); // true
				System.out.println(l.contains("10.235")); // false

				// isEmpty()
				System.out.println(l.isEmpty()); // false

		//................Reading elements using FOR loop
				System.out.println("Reading elements using FOR loop...");

				for (int i = 0; i < l.size(); i++) {
					System.out.println(l.get(i)); // l[i] --> will not work

				}

		//.............Reading elements using for each loop
				System.out.println("Reading elements using For-Each loop...");

				for (Object e : l) { // here it is an object datatype
					System.out.println(e);
				}

				//................ iterator()
				Iterator it = l.iterator(); // Iteratore is an interface from java.utils
				System.out.println("Reading elements using Iterator...");

				while (it.hasNext()) { // boolean sends true/false if it has next element, if false then loop will
										// stop.
					System.out.println(it.next()); // returns the element and move to next


		
		
	}

}
}
