package com.bridge;



	import java.util.Scanner;



	public class Calender {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String day;
			System.out.println("enter the year");
			int year=s.nextInt();
			System.out.println("enter the month");
			String month=s.next();
			
			MainCalender.findday(year,month);
		}

	}

	
