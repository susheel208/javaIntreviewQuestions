/*
 What is binary search 
 setp1) alway the elemets in the array must be in sorted ( asending or decending order)
 note mid, l, h are the index positions.
 case1:  KEY == MID  where MID = (l+h)/2, change to the integer if mid is decimal.
 Case2 : KEY > MID then L = MID + 1   ---> that means we search the element on the right side of mid
 Case3 : KEY < MID then H = MID - 1   ---> that means we search the element on the left side of mid
  
   not the looping or search will stop when l>h that means the elemenet is not found in the array.
 */

package com.array.search;

import java.util.Arrays;

public class BinarySearc {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // element must be in the sorted form
		int key = 10; // element we hAVE TO SEARCH
		
		// -----------> Arrays.binarSearch(array, ele)   -- <------------------
		
  System.out.println(Arrays.binarySearch(a, 8));   //( array, eelement we need to search) --> it will
  //return the position of the elemenet in ann array


/*		
		int l = 0; // l = a[0]; --> not true it will give the value at the index
		int h = a.length - 1; // l , h , mid are the index positions

	//	System.out.println(a[mid]);
		boolean flag = false;

		while (l <= h) { // loop will run until h>l,
			
			int mid = (l + h) / 2;


			if (key == a[mid]) { // checking the values
				System.out.println(" element found.." + a[mid] +"+ ");
				flag = true;
				break;
			}

			if (key > a[mid]) { // checking the values

				l = mid + 1; // moving to the upper bound

			}
			if (key < a[mid]) {
				h = mid - 1; // moving to the upper bound
			}

		}
		if (flag = false) {
			System.out.println(" element no found");
		}
		*/

	}

}
