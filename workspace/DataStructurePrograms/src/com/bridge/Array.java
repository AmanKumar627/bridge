/**author:aman kumar
 * 
 * 
 *purpose:display 2D array
 *
 *
 *date:
 * 
 */


package com.bridge;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("enter array elements");
		for (int i = 0; i < 3; i++) {
			//here we take loop for length
			for (int j = 0; j < 3; j++) {
          //here we take loop for breadth
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(arr[i][j]+" ");

			}System.out.println();
		}

	}

}
