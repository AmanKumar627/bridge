package com.bridge;

import java.util.Scanner;

public class StorePrimeNumberIsAnagarm {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n;
		int count = 0;
		int pp = 0;
		int aa = 0;
		int a[] = new int[10];
		int c[][] = new int[100][25];
		int p[] = new int[200];
		for (int i = 2; i < 1000; i++) {
			int flag = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag++;

					break;
				}

			}
			if (flag == 1) {
				System.out.println(i);
				p[pp] = i;
				pp++;
				count++;

			}
			if (i % 100 == 0 || i % 999 == 0) {
				a[aa] = count;
				count = 0;
				aa++;
			}
		}

		for (int v = 0; v < 168; v++) {

			System.out.println(v + " " + p[v]);
		}
		int[] arr = new int[168];
		for (int k = 0; k < 168; k++) {
			for (int r = k+1; r < 168; r++) {
				if (arr[k] == arr[r]) {
					System.out.println("anagrams numbers are" + arr[k]);
				}
			}
		}
	}
}
