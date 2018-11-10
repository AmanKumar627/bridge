/**
 * @author:aman kumar
 * 
 * @purpose:find the prime factorization of the number
 * 
 * date:
 */




package com.bridge;

import java.util.Scanner;
//here we use scanner to take input from user

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to factorize");
		int number = sc.nextInt();
		//method for primefactorization
		MainForPrime.primeFactorNum(number);

	}

}
