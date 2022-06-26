package com.string;

import java.util.Arrays;
import java.util.Scanner;
//System.out.println(Arrays.toString(words))   // to prin tthe array using the syso
/* logic1:
   get every charater from string with index and 
   i=" " && i+1!=" " means after space there must be the letter but not space,
   then the count will increase.
   
   logic2
   1-use split method with space  --> this will convert String into the words
   2-store the words into the string array.
   3- find the length of that string array.
 */

public class countWords_inString {

	public static void main(String[] args) {
		System.out.println("Enter the strring:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
// logic 1
		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++; // indirectly calculating the no of spaces which actully consists of word after
							// it

			}

		}
		System.out.println("no of words: " + count);
		
// logic 2
		String [] words = s.split(" ");
		System.out.println(Arrays.toString(words));   // get bthe string array printed
		System.out.println("no of words using split function " + words.length);
	}
}
