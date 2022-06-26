package com.interview.java;

import java.util.Scanner;

public class lagestNum_Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // to get the user input from console
		int a = sc.nextInt(); // user defined num is assigned here.
		System.out.println("Enter the First num: ");

		int b = sc.nextInt();
		System.out.println("Enter the Second num: ");

		int c = sc.nextInt();
		System.out.println("Enter the Third num: ");

		int largest1 = a>b?a:b;
		int largest2 = c>largest1 ? c:largest1;
		System.out.println("largest Num is " + largest2);

	}

}
