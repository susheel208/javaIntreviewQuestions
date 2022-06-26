//Linea r search the given element in the array.
// linear search means, it will search the element one by one,
package com.array.search;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int search = 30;
		boolean flag = true;
		for (int value : a) {
			if (search == value) {
				System.out.println(" element found");
				flag = true;                 // if we use the flag concept the the loop will not continue
			}
		}
		if (flag = false) {            //after the loop ing also the still the flag = false
			System.out.println(" element not found");

		}
	}

}
