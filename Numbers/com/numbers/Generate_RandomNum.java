package com.numbers;

import java.util.Random;

public class Generate_RandomNum {

	public static void main(String[] args) {
		
	
// Approach 1 --  RandomClass
	
		Random rand = new Random();
		int rand_int = rand.nextInt(10);          // rand.nextInt(2000)   // here 2000 is the max limit. 
		System.out.println(rand_int);			  // nextint returs random integer
		
		double rand_double = rand.nextDouble();          // rand.nextInt(2000)   // here 2000 is the max limit. 
		System.out.println(rand_double);             //    rand.nextDouble will gen decimal range 0.0 and less than 1.0
	
		
		
// Approach 2 ---Math class		--> using this we can only genarate decimal numbers
		System.out.println(Math.random());      // random is a staic method so noi need to crate an object
		
		
// Approach 3 ----------> Apache commons-lang API

		// download the api-jar file and add it to the  -- properties>  java build path  >libraries > add external jarfile
	
//	String randNum = RandomStringUtils.randomNumeric(10);   // 10 digit rand  nnum
//	System.out.println(randNum);
	
		
		//Gen Random String
		
//		String randNum = RandomStringUtils.randomAlphabetic(10);   // 10 alphabetic rand  string
//		System.out.println(randNum);
		
	}
	
	
	
	
}
