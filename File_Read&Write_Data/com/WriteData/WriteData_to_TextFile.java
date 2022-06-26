package com.WriteData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData_to_TextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("./files//gsk.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("hi");
		bw.write(" this is susheel");
		bw.newLine();
		bw.write("how are you");
		bw.close();                    // without this data will not get added into the file
	 /*		PrintWriter pw = new PrintWriter(fw);
		pw.println("Seleinium with java");
		pw.close();
	*/
	}

}
