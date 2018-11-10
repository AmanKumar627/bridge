/**
 * author:aman kumar
 * 
 * purpose:print the prime numbers between 0 to 100
 * 
 * date:
 */



package com.bridge;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number from 0 to 1000");
		int number=sc.nextInt();
		if(number>1000)
		{
			System.out.println("invalid no");
		}
		else
		{
			Prime.checkPrime(number);
		}
		
	}

}
