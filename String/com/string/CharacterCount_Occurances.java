package com.string;

public class CharacterCount_Occurances {

	public static void main(String[] args) {
		// find all total no of "s".

		String str = "Hi This is Susheel";
		// even the whitespace is considered as the string and gets counted
		String str1 = str.replaceAll("s", "");

		int TotalCount = str.length();
		int TotalCountWithout_s = str1.length();

		int count = TotalCount - TotalCountWithout_s;
		System.out.println("s occurenc is  " + count);

	}

}
