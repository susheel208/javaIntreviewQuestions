package com.array;

public class Max_Min_inArray {

	public static void main(String[] args) {

		int a[] = { 12, 22, 53, 14, 5 };
		int max1 = a[0]; // considering first value in array as max value ,  int max1 = 0; --> means max val is zero
		for(int value:a) {            // here value = a[i]
			if (value>max1) { 
				max1 = value;
			}
		} System.out.println("max value is" + max1);
		
		
		int min1= a[0];   // this like aa initila condition

		for(int value:a) {            // here value = a[i]
			if (value<min1) {
				min1 = value;
			}
		} System.out.println("min value is" + min1);
		
	}
}
		
		
/*		
		// my logic
		int max = 0;
		int min = 0;
		for (int i = 0; i <= a.length-1; i++) {  
			for (int j = 1; j < a.length; j++) {   
				if(a[i]>a[j]) {
					max= a[i];
				}
				if(a[i]<a[j]) {
					min= a[i];
				}
			}
					
}
		System.out.println("max and min values are"+ max + " " + min );
	}
}
	*/