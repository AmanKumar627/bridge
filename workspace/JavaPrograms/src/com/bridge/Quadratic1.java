
/**
 * author:aman kumar
 * 
 * purpose:to find the root of the equation
 * 
 * date:
 */



package com.bridge;

public class Quadratic1{
	public static void main(String[] args) {
   //here we take command line argument choice from the user		
	double number1=Double.parseDouble(args[0]);
	double number2=Double.parseDouble(args[1]);
	
   //formula for discriminant
	double discriminant=number1*number1-4.0*number2;
	//here we use math.sqrt to find the square root of the discriminant
	double squareroot=Math.sqrt(discriminant);
	
	double root1=(-number1+squareroot)/2.0;
	double root2=(-number1-squareroot)/2.0;
	
	System.out.println(root1);
	System.out.println(root2);
	}
	

}
