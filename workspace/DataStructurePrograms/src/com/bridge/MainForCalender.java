package com.bridge;

public class MainForCalender {

	public static void dis(int m, int sum) {
		// Scanner s=new Scanner(System.in);
		int cal[][] = new int[6][7];

		int n = 0;
		int d = 1;

		System.out.println("su mo tu we th fi sa");
		for (int k = 0; k < sum; k++) {

			cal[n][m] = d;
			m++;
			if (m == 7) {
				m = 0;
				n++;
			}
			d++;
		}
	

	}

}
