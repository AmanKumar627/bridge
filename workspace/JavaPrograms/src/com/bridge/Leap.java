/**
 
* author:aman kumar
 * 
 * purpose:fing leap year
 * 
 * date:
 */



package com.bridge;


/*
 * 
 * here we use Scanner class to insert the choice from the user
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		//Scanner class for user unput
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year");
		String year = scan.next();
		int size = year.length();
		//convert string to integer
		int year1 = Integer.parseInt(year);
		if (size == 4) {
			//condition for leap yaer
			if (year1 % 400 == 0 && year1 % 4 == 0 && year1 % 100 != 0) {
				//print he result
				System.out.println("it is a leap year");
			} else {
				System.out.println("Not a leap year");

			}
		}

		else {
			System.out.println("enter valid number");
		}
	}
}
