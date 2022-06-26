package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/* ArrayList declaration  --> it belongs to Java.util package
  ArrayList al = new ArrayList();					// hetrogenious elemente
  ArrayList<String> al = new ArrayList<String>();  // homogeniuos ele--> String
  ArrayList<Integer> al = new ArrayList<Integer>();
  List al = new ArrayList();					// creating with the List ref.
			
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10); // adding without index so the elements will be added in the end of the array
					// list
		al.add("welcome");
		al.add(10.235);
		al.add(true);
		System.out.println(al);

		// size
		System.out.println(al.size());
		// remove
		al.remove("welcome"); // al.remove(1) --> remove as per the index value, index starts form 0 to n-1
		System.out.println("elements after removal: " + al.size());
// add the specific index
		al.add(2, "susheel"); // adds at the 2 index value
		System.out.println("elements after adding with index:" + al);

		// retrive specific element
		// al.get(5); --> exception index out of bounds
		System.out.println(al.get(1)); // het 1 is the index of the the element/ obj

		// change or replac ethe element

		al.set(1, "Python");
		System.out.println("latest list after replacing the element:" + al);

		// contains() - > search the elemnt in the array list
		System.out.println(al.contains("Python")); // true
		System.out.println(al.contains("10.235")); // false

		// isEmpty()
		System.out.println(al.isEmpty()); // false

		//................ for loop
		System.out.println("Reading elements using FOR loop...");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); // al[i] --> will not work

		}

		//............. for each loop
		System.out.println("Reading elements using For-Each loop...");

		for (Object e : al) { // here it is an object datatype
			System.out.println(e);
		}

		//................ iterator()
		Iterator it = al.iterator(); // Iteratore is an interface from java.utils
		System.out.println("Reading elements using Iterator...");

		while (it.hasNext()) { // boolean sends true/false if it has next element, if false then loop will
								// stop.
			System.out.println(it.next()); // returns the element and move to next

		}

	}

}
