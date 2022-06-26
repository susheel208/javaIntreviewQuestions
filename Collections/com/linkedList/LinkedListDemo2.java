package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	/*
	 * Declare Linked List LinkedList l = new LinkedList(); 
	 * LinkedList<Integer> l = new LinkedList<Integer>(); 
	 * LinkedList<String> l = new LinkedList<String>();
	 * 
	 * 
	 */
	public static void main(String[] args) {
		LinkedList l = new LinkedList(); // LinkedList from Java.util

		l.add("X"); // adding without index so the elements will be added in the end of the array
					// list
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println(l);

		LinkedList l_dup = new LinkedList();

		l_dup.add("susgheel");
		System.out.println(l_dup);

		l_dup.addAll(l);   // al is the collecton which is 
		System.out.println("before using addAll: "+l_dup);
		l_dup.addAll(l);
		System.out.println("After using addAll: "+l_dup);
		
		l_dup.removeAll(l);
		System.out.println("After using removeAll: "+l_dup);

		
//***************** using the methods from Collections Class***********************
		// if no element is present then the al.size() -- > zero bec it return the int
		
		// sort operations    --> Collections.sort
		
		System.out.println("elemnet befor the sort: "+ l); //  [X, Y, Z, A]
		Collections.sort(l);   // assending order
		System.out.println("elemnet after the sort: "+ l);
		
		// reverse order sort
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("elemnet after the reverse sort: "+ l);
		
		Collections.shuffle(l);
		System.out.println("elemnet after shuffling: " + l);
		
		}

	}


