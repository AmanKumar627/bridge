/**
 * 



 * purpose:coupn number
 * 
 * author: aman kumar
 * 
 * date:
 * 
 */




package com.bridge;
/*
 * here we use  scanner function for taking the input from user
 * 
 * 
 */

import java.util.Scanner;



public class Coupon1 {
	public static void main(String[] args) {
		// hew we use scanner function o take the user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter choice 1 to play or 0 to quit");
		int choice = scan.nextInt();
		if (choice == 1) {
			play();
       //given choice to user play or quit game
		}
		if (choice == 0) {
			System.out.println("game quited");
		} else {
			System.out.println("enter valid number");
		}

	}
/*
 *here we use play method for playing the coupon 
 *here we use random fuction for randomly taking a number
 * it return randim nuber inh the form of string
 */
	private static void play() {
		char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdegghijklmnopqrstuvwxyz123456789".toCharArray();
		int max = 10000;
		int random = (int) (Math.random() * max);
			StringBuilder sb = new StringBuilder();
			sb.append(random % ch.length);
			random = random / ch.length;

			String st = new String(sb);
			System.out.println(st);

			// TODO Auto-generated method stub

		}

	}

