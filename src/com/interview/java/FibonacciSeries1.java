package com.interview.java;

public class FibonacciSeries1 {
	
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1;
		int sum = 0;
//		int count = 10;
		System.out.println("Fibonaci series: "+ n1 + " " + n2);
		
		for(int i=2; i>=10; i++) 
		{
			
			sum = n1 + n2;    //1 2 
			n1= n2;           //1 
			n2=sum; 		  //1 2 
			System.out.println(" " + sum);

			 
			//			sum = n1 + n2;
//			n1 = sum ;
//			n2 = sum - n1;
//			
		}
//		System.out.println(sum);
//		System.out.println("Fibonaci series: "+ n1 + " " + n2);
	
	}

}

