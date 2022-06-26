/*note 
 Array should not have duplicateed
 array no need to be sorted order
 values soud be in range
 *
 */

package com.array;

//import java.util.Scanner;

public class MissingNum_Array {
	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 4 };
		/*logic:
		 { 1, 2, 4, 5 };  --> sum of array elements  1+2+4+5 = 12    --> sum1
		  
		  1, 2,3, 4, 5   --> sum of elements in sequence 1+2+3+4+5 =15  --> sum2
		 sum2-sum1 = 15- 12 = 3 is the missing num
		*/
		
		int sum1 = 0;
		
		for (int i = 0; i <= a.length-1; i++) {   // reteieve the array element by the index
			sum1 = sum1 + a[i];
		}
			System.out.println("sum of elements in an array " + sum1);
		
			int sum2 = 0;
			
			for (int i = 0; i <=5; i++) {   // reteieve the array element by the index
				sum2 = sum2 + i;
			}
				System.out.println("sum of elements  " + sum2);
				
			int	missing_num = sum2 - sum1;
			
			System.out.println("missing num in an array" + missing_num );
			
	}		
	}	
				
			
	