package com.bridge;

import java.util.Scanner;

public class RepalceString {
	public static void main(String[] args) {
		
		String str="hello username how are you";
		System.out.println("the original string is");
		System.out.println(str);
		RepalceString(str);
	}

	private static void RepalceString(String str) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name to replace string");
	    	str=sc.nextLine();
	    	int length=str.length();
	    	while(!(str.length()>=3)){
	    		System.out.println("enter your name to replace string");
		    	str=sc.nextLine();
	    		if(str.length()>=3)
	    	{	
	    	System.out.println("hello "+str+" how are you");
	    	break;
	    	}else
	    	{
	    		System.out.println("String is invalid please inter valid string");
	    	}
	    	}
		// TODO Auto-generated method stub
		
	}

}
