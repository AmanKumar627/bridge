package com.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class OrederedList {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new FileReader("/home/bridgelabz/aman6.txt"));
		MainForOrderedList ow = new MainForOrderedList();
		String st1;
		int ar[];
		while ((st1 = b.readLine()) != null) {
			String w1[] = st1.split(" ");
			ar = new int[w1.length];
			for (int i = 0; i < w1.length; i++) {

				ar[i] = Integer.parseInt(w1[i]);
				ow.add(ar[i]);
			}
		}
		System.out.println(ow);
		Scanner sc=new Scanner(System.in);
		System.out.println("the the number you want to search");
		int number =sc.nextInt();
		 ow.search(number);
		 System.out.println(ow);
	
	}
}
