//note  1234/10 = 123   --> removes the last digit and gives the remaining num 123
//   1234 % 10  -->returns the last digit. 
// total num of even and odd digits in the  given num
package com.interview.java;

import java.util.Scanner;

public class NumOf_EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
		int ecount = 0;
		int ocount = 0;
		int rem = 0; // this will decide how

		while (num > 0) {

			rem = num % 10; // to get the reminder

			if (rem % 2 == 0) { // to check the reminder is even or odd.
				ecount++;

			}

			else {
				ocount++;

			}
			num = num / 10; // this num step is useful to eliminate the last digit

		}
		System.out.println("total num if odds:" + ocount);
		System.out.println("total num if evens" + ecount);
	}
}
