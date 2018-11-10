/*********************************************************************************************
 * 
 * author:aman kumar
 * 
 * purpose:print the twoDarray in file
 * 
 * date:
 **********************************************************************************************/
 package com.bridge;
 

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class twoDArray {
	public static void main(String[] args) throws IOException {
		//here we took scanner to enter row and column from the user
		Scanner scanner = new Scanner(System.in);
		int m, n;
		System.out.println("enter the row and column");
		m = scanner.nextInt();
		n = scanner.nextInt();
		int[][] arr = new int[3][3];
        
		//here we use buffewriter to write the array int file
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/bridgelabz/aman.txt"));
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				bw.write((arr[i][j] = scanner.nextInt()) + "");
			}

			bw.newLine();

		}
		//close the bufferedwriter
		bw.close();

	}
}
