/**
 * @author:aman kumar
 * 
 * purpose:find whether the string is anagarm or not using dequeue
 * 
 * dae:
 */ 
  package com.bridge;
 

import java.util.Scanner;

public class PallindromeChecker {
	public static void main(String[] args) {

		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		MyDeque q = new MyDeque(word.length() * 2);
		char ch[] = word.toCharArray();
		char chk[] = new char[word.length()];
		char chk1[] = new char[word.length()];
		int flag = 0;
		for (int i = 0; i < ch.length; i++) {
			q.addRear(ch[i]);
		}

		for (int i = ch.length - 1; i >= 0; i--) {
			q.addFront(ch[i]);
		}

	
		for (int i = 0; i < ch.length; i++) {
			chk[i] = (char) q.removeRear();
		}

		
		for (int i = 0; i < ch.length; i++) {
			chk1[i] = (char) q.removeFront();
		}

		for (int i = 0; i < chk1.length; i++) {
			System.out.println();
		}

		for (int i = 0; i < chk1.length; i++) {
			System.out.println(chk[i] + " " + chk1[i]);
			if (chk[i] != chk1[i]) {
				flag = 1;
				System.out.println("not pallindrome");
				break;
			}
		}

		if (flag == 0) {
			System.out.println("String is pallindrome");
		}

	}

}
