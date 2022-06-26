package com.interview.java;

//s.replaceAll("[^a-zA-Z0_9]", "")  --> replaceAll( regex, replacement)
public class Replace_SplChar {

	public static void main(String[] args) {
		
		String s= "asdf@%#*T*%R)((%$(*)_O_12485lklhhvs";
		String email = "gsusheel208@gmail.com#$%$%^&**(";
		
		s=s.replaceAll("[^a-zA-Z0_9]", "");  // symbol ->  " ^ " represents all charaters... here "" --> empty, " " --> whitespace
		
		email = email.replaceAll("[^a-zA-Z0-9@.]", "");
		System.out.println(email);
		
		
	}

}
