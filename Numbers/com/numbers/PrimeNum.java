
package com.numbers;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls eneter the num:");
		int num = sc.nextInt();
		// int num = 3;
		int count = 0;
		int i;
		if (num > 1) {  // given num will be gerater than 1 but the for loop starts from the 1 and end at the num.
			System.out.print("num is divisible by ");
			for (i = 1; i <= num; i++) {

				if (num % i == 0) { // the num is div by"i" and the rem =0 the it is divisible

					count++; // count here reperesent the no of times the given num is divisible
					System.out.print(i + " ");  // to print the divisible num.
				}

			}
			System.out.println();  // to give the statement in the next line
			if (count == 2) { // ==2 mean only have the factor 2 (1 and itself)
				System.out.println("given num is prime num");
			} else {
				System.out.println("given num is not a prime num");

			}
		} else {
			System.out.println("pls provide proper num");
		}

	}
}
