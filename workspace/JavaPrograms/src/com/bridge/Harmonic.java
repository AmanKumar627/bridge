/************************************************************************

 * author:aman kumar
 * 
 * purpose:harmonic number series
 * 
 * 
 * date:
 ************************************************************************/


package com.bridge;

public class Harmonic {

		public static void main(String args[]){
			//here we have taken the command line line argument of 0
			int num = Integer.parseInt(args[0]);
			double result = 0.0;
			while(num > 0){
				result = result + (double) 1 / num;
				num--;
			}
			//here we print the result
			System.out.println("Output of Harmonic Series is "+result);
			

}
}
