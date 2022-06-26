package com.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {

		String arr[] = { "Cat", "Dog", "Tiger", "Lion" };
		System.out.println(Arrays.toString(arr));
		for (String value : arr) {
			System.out.println(value);
		}
		LinkedList l = new LinkedList(); // LinkedList from Java.util
		l.add("Cat");
		l.add("Dog");
		l.add("Tiger");
		l.add("Lion");
		System.out.println(l);
//*****************  performing Operations on "first and last element without using the Index"**********8a
		
// methods from The Queue Interface
		l.addFirst("Tiger");
		l.addLast("Elephant");

		System.out.println(l);
// geting first and last values without using the index in linked list

		System.out.println(l.getFirst()); // geting first and last values without using the index in linked list
		System.out.println(l.getLast());

		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing the first and last elemnts: " + l);

	}

}
