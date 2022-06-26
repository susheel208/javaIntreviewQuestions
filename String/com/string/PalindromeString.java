//panindrome Sting : String which remains same even if sting is reversed ex: madam
// Hint : if rev num = original num.
package com.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the Sting value: ");
		String str = sc.next(); // "abcd"
		// StringBuilder sbl = new StringBuilder(str); // stringBuilder is class.
		// StringBuilder rev = sbl.reverse();
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		// if (str.equals( rev))   // this will not give the same result
		
	//	if (str.contentEquals(rev)) {
		if (str.contentEquals(rev)) {
			
			System.out.println(str + "   is the Palindrome String ");
		} else

		{
			System.out.println(str + " given  is not Palindrome String ");

		}
	}
}
// difference beteween equals and content equals
