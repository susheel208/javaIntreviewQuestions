package com.array.sort;

import java.util.Arrays;

public class Bubble_Sort_22 {

	/*
	 * Bubble Sort principle: in an array we need to sort the elemements if the
	 * first ele > 2nd ele --> perform swap. 2nd ele > 3rt ele --> perform swap.
	 * else dont swap in pass 1 --> we will recieve the one highest num ie called
	 * "bubble up" pass 1 --> we will recieve the 2 highest numcin bubble up. like
	 * that we will perform (n-1) times of passes.
	 * 
	 * to
	 */

	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 5, 3 };

		System.out.println(" Array before the swaping: " + Arrays.toString(a)); // if we pass "a"instead of this ->
																				// Arrays.toString(a)

		int n = a.length;

		for (int passes = 0; passes < n - 1; passes++) { // loop for passes if initial value for passes = 0 the end is
															// <n-1, or passes = 1 the end is <n,

			for (int j = 0; j < n - 1; j++) { // loop for swpa if
				if (a[j] > a[j + 1]) { // a[j]>a[j+1] the we need to swap these 2 element
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}

		}
		System.out.println(" Array after  swaping: " + Arrays.toString(a));

	}

}
