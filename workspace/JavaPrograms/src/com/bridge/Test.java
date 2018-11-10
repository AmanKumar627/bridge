/******************************************************************************
 * author:aman kumar 
 *  
 * purpose:replace String
 *  
 *  @version 1.0
 *
 ****************************************************************************/

package com.bridge;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// scanner class to user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your name");
		String userName = scanner.nextLine();
		// finding the length of the name
		int length = userName.length();

		System.out.println(length);
		// here we rsetrict the length that it should be greater than 3

		if (length >= 3) {
			System.out.println("hello <<" + userName + ">> how are you");
		} else {
			System.out.println("username contains lessa than three characters");
		}

	}

}
