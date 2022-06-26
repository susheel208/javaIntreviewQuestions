package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachWord_String {

	/*
	 * Logic: reverse each word in the string - Split the Complete string into
	 * Words(seperated by space) - reverse words individually -concat the result
	 * with the spaces included.
	 */
	public static void main(String[] args) {
// 1) using + String COnacatenation Operator

		String str = "Hi Abcd";

		String[] words = str.split(" "); // this split string into words when ever the space occure

		System.out.println(Arrays.toString(words)); // get the string array printed
		System.out.println("no of words using split function " + words.length);

		String reverseString = "";
		for (String s : words) 
		{   // extracting each word
			String reverseWord = "";
			
			
			int len = s.length(); // so len =4, but the index will be from 0 to 3(i.e,. len -1 in loop)

			for (int i = len - 1; i >= 0; i--) 
			{
				reverseWord = reverseWord + s.charAt(i); // charAt returns the char at that index of that string.
			}
			reverseString =reverseString+reverseWord +" ";                                                  
			}
			
		System.out.println("Reveresed words :" + reverseString);
		

// -------------------------------------- method using StringBuffer class -------------------------------------

		// reversing the whole sentance
	/*	
		StringBuilder sbl = new StringBuilder(str); // string buffer is class.
		StringBuilder rev2 = sbl.reverse();
		System.out.println("Reveresed String using StringBuffer class :" + rev2);
	*/
		StringBuilder sbl = new StringBuilder(str); // string buffer is class.
		StringBuilder rev2 = sbl.reverse();
		System.out.println("Reveresed String using StringBuffer class :" + rev2);
	
	
	}
}
