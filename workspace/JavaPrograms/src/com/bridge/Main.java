/**
 * author:aman kumar
 * 
 * purpose:stopwatch
 * 
 * date:
 * 
 */ 
  package com.bridge;
 

import java.util.Scanner;

public class Main{
	
	//here we used main mthod
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("enter 1 to start the watch");
		if(choice==1)
		{
			sw.start();
		}
		System.out.println("enter 0 to stop the watch");
		if(choice==0)
		{
			 sw.stop();
		}
		System.out.println(sw.eclipsed());
	}
}


