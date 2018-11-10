package com.bridge;

public class MainForDay {

	public static void findday(int day, int month, int year) {
		int y = year - (14 - 1) / 12;
		int y1 = y + (y / 4) - (y / 100) + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + y1 + 31 * m / 12) % 7;
		System.out.println(d);

	}

}
