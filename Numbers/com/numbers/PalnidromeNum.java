//panindrome Num:num which remains same even if num is reversed ex: 123321
// Hint : if rev num = original num.

package com.numbers;

import java.util.Scanner;

public class PalnidromeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
		int org_num = num;  // this step is value can change in the further iterations.
		int rev = 0; 
		while (num != 0) {

			rev = rev * 10 + num % 10;     //  this will create the rev--> value
			num = num / 10;
// o/p is the rev num
		}                     //. we need to check the condition after the the rev is completly formed
		if (org_num == rev) {
			System.out.println(org_num + "given num is Palindrome num ");
		} else

		{
			System.out.println(org_num+ "given num is not Palindrome num ");

		}

	}
}
