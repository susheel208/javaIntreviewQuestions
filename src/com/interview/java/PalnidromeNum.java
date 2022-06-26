//panindrome Num:num which remains same even if num is reversed ex: 123321
// Hint : if rev num = original num.

package com.interview.java;

import java.util.Scanner;

public class PalnidromeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
		int org_num = num;
		int rev = 0; 
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
// o/p is the rev num
		}
		if (org_num == rev) {
			System.out.println(org_num + "given num is Palindrome num ");
		} else

		{
			System.out.println(org_num+ "given num is not Palindrome num ");

		}

	}
}
