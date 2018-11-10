/**
 * author:aman kumar
 * 
 * @version:1.2
 * 
 * 
 * 
 */




package com.bridge;
/*
 * in this method we use number and find the factorization for that
 * 
 * 
 * 
 */


public class MainForPrime {
	/*
	 * mehod for prime number
	 * 
	 */
	public static void primeFactorNum(int number) {
    
		for (int i = 2; i * i < number; i++) {
          
			while (number % i == 0) {
				System.out.println(i);
				number = number / i;
			}
			if (number > 1) {
			
				System.out.println(number);
			}
		}

	}

}
