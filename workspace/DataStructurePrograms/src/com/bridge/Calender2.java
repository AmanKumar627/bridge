package com.bridge;

import java.util.Scanner;

public class Calender2{

	

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the year");
			String day;
			int year=s.nextInt();
			System.out.println("enter the month");
			String month=s.next();
			
			Calender2Logic.findday(year,month);
	}
	}


