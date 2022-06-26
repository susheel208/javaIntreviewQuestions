package com.array.sort;

import java.util.Arrays;
import java.util.Collections;

public class Methods_sort {

	/*Sorting in ascending order:
	 * approach 1: PARALLEL sort --> syntax: Arrays.parallelSort(a); 
	 * approach 2: sort --> syntax: Arrays.sort(a);
	 * 
	 * 
	 * Sorting in descending order:
	 * Arrays.sort(a, Collections.reverseOrder());  --> when we use Collections.reverseOrder(), 
	 * it dosen't support the premitive data type so --> convert into Integer
	 */

	public static void main(String[] args) {

		int a[] = { 1, 5, 358, 185, 579 };
		int [] b = { 1, 75, 3, 15, 79 };
		Integer[] c  = { 8,9,11,72,184, 358, 185, 579 };   
		// Integer Data type bec of the Collections.reverseOrder()
		
		System.out.println(" Array - a  before the swaping: " + Arrays.toString(a)); // if we pass "a"instead of this ->
		Arrays.parallelSort(a);
		System.out.println(" Array -a after the swaping: " + Arrays.toString(a)); // if we pass "a"instead of this ->

		System.out.println(" Array - b  before the swaping: " + Arrays.toString(b)); 
		Arrays.sort(b);
		System.out.println(" Array -b after the swaping: " + Arrays.toString(b));
		
		System.out.println(" Array - c  before the swaping: " + Arrays.toString(c)); // if we pass "a"instead of this ->
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println(" Array -c after the swaping: " + Arrays.toString(c)); // if we pass "a"instead of this ->

		
		
		
		
		
	}

}
