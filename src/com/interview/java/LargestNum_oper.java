/*note 
  --> 1234/10 = 123   --> removes the last digit and gives the remaining num 123
  -->  1234 % 10  -->returns the last digit. 
   total num of even and odd digits in the  given num
*/

package com.interview.java;

import java.util.Scanner;

public class LargestNum_oper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // to get the user input from console
		int a = sc.nextInt(); // user defined num is assigned here.
		System.out.println("Enter the First num: ");

		int b = sc.nextInt();
		System.out.println("Enter the Second num: ");

		int c = sc.nextInt();
		System.out.println("Enter the Third num: ");

		if (a > b && a > c) {
			System.out.println(a + " is largest num");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest num");
		} else {               // there should be no condition in-front of else
			System.out.println(c + " is largest num");
		}
	}
}
