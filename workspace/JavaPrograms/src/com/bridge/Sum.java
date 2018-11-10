/********************************************************************
 *

 author:aman kumar
 * 
 * 
 * purpose:sum of three integers adds to zero
 * 
 * 
 * date:
 * 
 *****************************************************************/
	package com.bridge;

	import java.util.Scanner;

	public class Sum {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter he length of array");
			int length = sc.nextInt();
			System.out.println("eneter " + length + " elements");
			int arr[] = new int[length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			checkNumber(arr);

		}

		private static void checkNumber(int[] arr) {
			//here we wre taking three loops for comparing the array elements 
			for (int i = 0; i < arr.length - 2; i++) {
				for (int j = i + 1; j < arr.length - 1; j++) {
					for (int k = j + 1; k < arr.length; k++) {
						if (arr[i] + arr[j] + arr[k] == 0) {
							//printing the elements
							System.out.println(arr[i]);
							System.out.println(arr[j]);
							System.out.println(arr[k]);
						} 
							
						}
					}
				}
			//if it is not available print the message
			System.out.println("does not exist");
			}

		}
		// TODO Auto-generated method stub



