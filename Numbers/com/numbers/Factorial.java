package com.numbers;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the num1: ");
	System.out.println("enter the num2: ");
	int num1 = sc.nextInt(); // incremental approch
	int num2 = sc.nextInt(); // decremental approch
	long fact1=1, fact2 = 1;
	
	
// approch 1 ------i in increasing order
	for (int i = 1; i <=num1; i++) {
		fact1 = fact1 * i;
	}
		System.out.println("factorial of" +  num1+" is " +fact1);
		
//approch 2 ------"i" in decreasing order
	for (int j = num2; j>=1; j--) {
		fact2 = fact2 * j;
	} 
		System.out.println("factorial of" +  num2+" is " +fact2);
		
}
	
}
