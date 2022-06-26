package com.interview.java;

import java.util.Scanner;

public class countNumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // to get the user input from console
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); // user defined num is assigned here.
		int count = 0;

		while (num > 0) {

			num = num / 10;
			count++;
		}	
		System.out.println("total num if digits:" + count);
		
	}
}
