/******************************************************************

 * author:aman kumar
 * 
 * 
 * purpose:toss the coin and print percentage of head and tail
 * 
 * 
 * date: 
 * 
 ******************************************************************/



package com.bridge;
 

import java.util.Random;
/******************************************************************
 * here we use random function for randomly for tossing the coin
 * 
 *****************************************************************/
import java.util.Scanner;
/*
 * here we have taken scanner for user unput
 * 
 */



public class Coin {
	//we use coin class
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter choice 1 to play or 0 to quit");
		int choice = scanner.nextInt();
		//here we inter the choice the to toss the coin
		if (choice == 1) {
			play();
		}
		if (choice == 0) {
			System.out.println("game quited");
		}

	}
     /*
      * here we use play method 
      * 
      * it returns the ramdom head and tail 
      */
	private static void play() {
		Random random = new Random();
		// use random function here to flip the coin
		int number = random.nextInt(2);
		if (number == 0) {
			System.out.println("head occurs " + number);

		} else {
			System.out.println("tail occurs  " + number);
		}

		// TODO Auto-generated method stub

	}

}