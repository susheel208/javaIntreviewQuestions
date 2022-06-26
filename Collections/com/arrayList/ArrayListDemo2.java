package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* ArrayList declaration  --> it belongs to Java.util package
  ArrayList al = new ArrayList();					// hetrogenious elemente
  ArrayList<String> al = new ArrayList<String>();  // homogeniuos ele--> String
  ArrayList<Integer> al = new ArrayList<Integer>();
  List al = new ArrayList();					// creating with the List ref.
			
 */

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("X"); // adding without index so the elements will be added in the end of the array
					// list
		al.add("Y");
		al.add("Z");
		al.add("A");
		System.out.println(al);

		ArrayList al_dup = new ArrayList();

		al_dup.add("susgheel");
		System.out.println(al_dup);

		al_dup.addAll(al);   // al is the collecton which is 
		System.out.println("before using addAll: "+al_dup);
		al_dup.addAll(al);
		System.out.println("After using addAll: "+al_dup);
		
		al_dup.removeAll(al);
		System.out.println("After using removeAll: "+al_dup);

		
//***************** using the methods from Collections Class***********************
		// if no element is present then the al.size() -- > zero bec it return the int
		
		// sort operations    --> Collections.sort
		
		System.out.println("elemnet befor the sort: "+ al); //  [X, Y, Z, A]
		Collections.sort(al);   // assending order
		System.out.println("elemnet after the sort: "+ al);
		
		// reverse oredr sort
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("elemnet after the reverse sort: "+ al);
		
		Collections.shuffle(al);
		System.out.println("elemnet after shuffling: " + al);
		
		}

	}


