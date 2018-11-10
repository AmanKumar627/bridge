/**
 * 
 * 
 */
package com.bridge;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day");
		int day = sc.nextInt();
		System.out.println("enter the month");
		int month = sc.nextInt();
		System.out.println("eneter the year");
		int year = sc.nextInt();
		MainForDay.findday(year, month, day);

	}

}
