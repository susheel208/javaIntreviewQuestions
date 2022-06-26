/*note 
  --> 1234/10 = 123   --> removes the last digit and gives the remaining num 123
  -->  1234 % 10  -->returns the last digit. 
   total num of even and odd digits in the  given num
*/

package com.array;

//import java.util.Scanner;

public class SumOf_ele_inArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i <= a.length-1; i++) {   // reteieve the array element by the index
			sum = sum + a[i];
		}
			System.out.println("sum of elements in an array " + sum);
		
	
	for(int value:a) {                     //  for(dataType var : array)
		//  int sum2 = 0;
		sum2 = sum2 + value;
	}
		System.out.println("sum of elements in an array " + sum2);   // if u declare inside the loop then we cannot read here
	
}
}