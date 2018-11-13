package com.bridge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long depositmoney = 0;

		long withdrawMoney = 0;
		long totalmoney = 0;

		long wirthdraw = 0;
		CashCounter ct = new CashCounter();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to add cash ");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("enter how much money you want to deposit");
			long deposit = sc.nextLong();
			ct.depositMoney(depositmoney, deposit);
		}
		System.out.println("enter 0 to withdraw cash");
		if (choice == 0) {
			System.out.println("how mich money you want to withdraw");
		  
			long withdraw = sc.nextLong();

			ct.withdrawMoney(withdrawMoney, wirthdraw, depositmoney);

		} 

			System.out.println("the total amount is");
		ct.totalMoney(totalmoney, wirthdraw, depositmoney);

	}

}
