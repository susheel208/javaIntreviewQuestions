package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		String arr[ ]= {"Cat", "Dog", "Tiger", "Lion" };
		System.out.println(Arrays.toString(arr));
		for(String value: arr) {
			System.out.println(value);
		}
		ArrayList al = new ArrayList(Arrays.asList(arr));  // array to arrayList
		
		System.out.println(al);
		
		
	}

}
