package com.bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class unList {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new FileReader("/home/bridgelabz/aman5.txt"));
		MainForUnOrderedList ow = new MainForUnOrderedList();
		String st1;
		while ((st1 = b.readLine()) != null) {
			String w1[] = st1.split(" ");
			for (int i = 0; i < w1.length; i++) {
				ow.add(w1[i]);
			}
		}
		System.out.println(ow);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word you want to search");
		String str=sc.nextLine();
		ow.search(str);

		//ow.search("hello");
		System.out.println(ow);
		

	}
}
