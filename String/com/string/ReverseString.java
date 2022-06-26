package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
// 1) using + String COnacatenation Operator

		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the Sting value: ");
		String str = sc.next(); // "abcd"
		// String rev =null; //step 13 and 14 are not same
		String rev = "";

//		int len = str.length(); // so len =4, but the index will be from 0 to 3(i.e,. len -1 in loop)
//
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i); // charAt returns the char at that index of that string.
//		}
//		System.out.println("Reveresed String :" + rev);

// --------------------------------------  method  2  using character Array -------------------------------------		
//   2)		
		// converting the sting into an array of charecters

		char a[] = str.toCharArray(); // string to array of char conversion

		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reveresed String using character Array :" + rev);

// -------------------------------------- method using StringBuffer class -------------------------------------

		StringBuilder sbl = new StringBuilder(str); // string buffer is class.
		StringBuilder rev2 = sbl.reverse();
		System.out.println("Reveresed String using StringBuffer class :" + rev2);
	}
}
