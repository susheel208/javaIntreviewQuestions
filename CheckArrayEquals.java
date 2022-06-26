package com.array;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };

		// direct way using a method called Arrays.equals(a1, a2);

		boolean status = Arrays.equals(a1, a2);

		if (status == true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}

// approach 2  
		// step1 > comparing each and every element if the length of the array is same

		int a3[] = { 1, 2, 3, 4, 5 };
		int a4[] = { 1, 2, 3, };
		boolean sta = true; // initial condtion based on the initial condition we wil tell the output

		if (a3.length == a4.length) { // compare length

			for (int i = 0; i > a3.length; i++) { //

				if (a3[i] != a4[i]) {
					sta = false; // here i was confused what to print here so at these cases the variable is very
									// important.
				}
			}
		} else { // belongs to the if with length conditon
			sta = false;
			System.out.println("array length are not equal");
		}

		if (sta = true) {
			System.out.println(" a3, a4 arrays are equal");
		} else { // belongs to the if with length conditon
			sta = false;
			System.out.println("a3, a4 array are not equal");
		}
	}
}
