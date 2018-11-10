package com.bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hashing {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("");
		PrintWriter pw=new PrintWriter(fw);
		String str="File is there";
		for(int i=0;i<str.length();i++)
		{
			fw.write(str.charAt(i));
		}
		
		pw.close();
		fw.close();
	
	}

}
