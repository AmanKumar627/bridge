
/**author:aman kumar
 * 
 * 
 *purpose:sqrt root
 * 
 * 
 * date:
 * 
 * 
 */



package com.bridge;

import java.io.*;
import static java.lang.Math.*;

class Quadratic {
/*
 * here we built the method for finding squqre roots
 * 
 * 
 */
	void findRoots(int a, int b, int c) {

		if (a == 0) {
			System.out.println("Invalid");
			return;
		}
     //
		int d = b * b - 4 * a * c;
		double sqrt_val = sqrt(abs(d));

		if (d > 0) {
			System.out.println("Roots are real and different \n");
               //formula for finding square root 
			System.out.println((double) (-b + sqrt_val) / (2 * a) + "\n" + (double) (-b - sqrt_val) / (2 * a));
		} else {
			//print the result
			System.out.println("Roots are complex \n");

			System.out.println(
					-(double) b / (2 * a) + " + i" + sqrt_val + "\n" + -(double) b / (2 * a) + " - i" + sqrt_val);
		}
	}
    //Driver code or main code
	public static void main(String args[]) {
		Quadratic obj = new Quadratic();
		int a = 1, b = -7, c = 12;
		obj.findRoots(a, b, c);
	}
}