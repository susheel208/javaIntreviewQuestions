package com.interview.java;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
		// let num = 1234
		// using algorithm
		int rev = 0; // reversed num will be stored here //
		while (num != 0) {

			rev = rev * 10 + num % 10; // 0+1234 % 4 = 4, 40 + 123%10 = 43
			num = num / 10; // 123 , 12, 1 , 1/10 = 0

		}
		System.out.println("from calss 1:" + rev);

	}
}

class StringBufferClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
								// rev var is a sting buffer type
		StringBuffer sb = new StringBuffer(String.valueOf(num)); // string buffer is class.
		StringBuffer rev = sb.reverse(); // String .valueOf() will return the int, double, char, object into String
		System.out.println(rev);
	}
}

class StringBuilderClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
								// rev var is a sting buffer type
		StringBuilder sbl = new StringBuilder(); // string buffer is class.
		sbl.append(num); // similar to String .valueOf()
		StringBuilder rev = sbl.reverse(); 
		System.out.println(rev);
	}
}
