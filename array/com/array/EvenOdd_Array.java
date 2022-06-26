/*note 
  --> 1234/10 = 123   --> removes the last digit and gives the remaining num 123
  -->  1234 % 10  -->returns the last digit. 
   total num of even and odd digits in the  given num
*/

package com.array;

//import java.util.Scanner;

public class EvenOdd_Array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		
		System.out.println("Even num in an array----->");

		for (int value : a) {

			if (value % 2 == 0) {
				System.out.println(value);
			}
		}
		System.out.println("Even num in an array----->");

		for (int value : a) {
			if (value % 2 != 0) {
				System.out.println(value);
			}

		}
	}
}