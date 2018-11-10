package com.bridge;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/o.txt"));
		Test1 ow = new Test1();
		String st1;
		int ar[];
		while ((st1 = b.readLine()) != null) {
			String w1[] = st1.split(",");
			ar = new int[w1.length];
			for (int i = 0; i < w1.length; i++) {

				ar[i] = Integer.parseInt(w1[i]);
				ow.add(ar[i]);
			}
		}
		System.out.println(ow);
		ow.search(5);
		System.out.println(ow);
		ow.search(3);
		System.out.println(ow);
		ow.search(1);
		System.out.println(ow);
	}
}
