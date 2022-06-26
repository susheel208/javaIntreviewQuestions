package com.ReadData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData_from_TextFile {

	/*
	 1 : FileReader and BufferReader
	 2 : using scanner and file and using loop
	 3 : using scanner and file and using deLimiter
	 */
	
	
	public static void main(String[] args) throws IOException {
		// Approech 1 : FileReader and BufferReader

		FileReader fr = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Interview\\files\\textFile.txt");

		BufferedReader br = new BufferedReader(fr);

		String str;                      
		// dont know how many line are present in the file
		
		while ((str = br.readLine())!=null) {     //br.readLine() will read the line and will store it into the "str" variable
													// br.readLine() = null means there is no line
			System.out.println(str);
			
		}
		br.close();
		
		
		// approach 2: using scanner and file
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Interview\\files\\textFile.txt");
			
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())              // hasNextLine() returns true if there is a next line
		{
			System.out.println(sc.nextLine());  //  reads the next line
			
		}
		
		// approach 3: using scanner and file +  without using loop (userDelimeiter)
				
				File file1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Interview\\files\\textFile.txt");
					
				Scanner sc1 = new Scanner(file1);
				sc1.useDelimiter("//Z");
				System.out.println(sc1.next());
		
		
	}

}
