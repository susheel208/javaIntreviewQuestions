package com.interview.java;
public class Swap2Nums {

	public static void main(String[] args) {

		int a = 10, b = 20;
//		System.out.println("swapping the number" + a + " " + b);
//
//		// logic1: using 3rd variBLE
//		int c = a; // here c= 10
//		a = b; // here b = 10
//		b = c;

//		// logic2: no extra variBLE
//		// using addition and substaction
//		a = a + b; // here a =30; but b =20;
//		b = a - b;// b = 10
//		a = a - b;

//		// logic3: no extra variBLE, conditioin to be SATISFIED IS a,b <>0
//		// using multiplication and Division
//		a = a * b; // here a =200; but b =20;
//		b = a / b;// b = 10
//		a = a / b;
//		
//		// logic4: bitwise XOR (^)
//
//		a = a ^ b; // 10 ^ 20 =30
//		b = a ^ b;// 30 ^ 20 =10
		a = a ^ b; // 30^ 10 = 20
	
		
		// logic 5: Single statement
		
		b= a+b - (a=b);  // 30 - (20); // here 10+20 -( 20)
		
		System.out.println("swapping the number" + a + " " + b);

	}
}
