package com.numbers;

public class Remove_WhiteSpace {

	public static void main(String[] args) {
		
		String str = " i am learning JAVA";
		
		//str = str.replace("[^a-zA-Z0_9]", "");   --> this regex experssion dident worked to remove whitespace
		
		String str1 = str.replaceAll("\\s", "");  // "\\s" -->  it is backspace 
	//	System.out.println(str1);
		String str2= str.replaceAll(" ","");
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
