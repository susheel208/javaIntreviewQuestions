package com.array;

import java.util.HashSet;

public class DuplicateEle_Array {

	public static void main(String[] args) {

		int a[] = { 12, 22, 5, 14, 5 };
		boolean flag = false;
		for (int i = 1; i <= a.length - 1; i++) { // here value = a[i]
			for (int j = i + 1; j <= a.length - 1; j++) { // here value = a[i]
				{
					if (a[i] == a[j]) {
						System.out.println("duplicate element found " + a[i]);
						flag = true;
					}
				}

			}

		}
		if (flag == false) {
			System.out.println(" No duplicate element found");

		}

		// Approach 2 HashSet
// HashSet is one of the collections in JAVA which will store the unique element, but not dublicate

		String Str[] = { "java", "c", "c++", "python", "java", "Java" };

		HashSet<String> langs = new HashSet(); // crate an object of the hasste with the datatype to store string

//		System.out.println(langs.add("cam"));        // when ever duplicate elements are given it will give false as o/p.
//		System.out.println(langs.add("cam"));

		boolean flags = false;
		for (String l : Str) 
		{ // transfering the "str --> l"
			
			if (langs.add(l) == false)
				 // this false is from HashSet inherent property // now adding the l to langs, so
					// that any dublicate is there it will give false as o/p
			{
				System.out.println("duplicate found" + l);

				flags = true; // this making the initial cond true;
			}
		}

		if (flags == false) {
			System.out.println("No duplicate found");
		}

	}
}