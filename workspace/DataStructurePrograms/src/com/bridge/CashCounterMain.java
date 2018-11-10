package com.bridge;

import java.util.Scanner;

public class CashCounterMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MyQueueForCashCounter q = new MyQueueForCashCounter(5);
		int ch;
		int n;
		System.out.println("enter the no. of people in queue");
		n = s.nextInt();
		System.out.println("enter the name");
		String accname[] = new String[n];
		
		
		int l = accname.length;
		System.out.println(l);
		for (int i = 0; i < l; i++) {
			accname[i] = s.next();
			q.enqueue(accname[i]);
		}
		int d = n;
		do {

			System.out.println("enter ur choice");
			System.out.println("1.deposit \n2.withdraw \n3.No of people \n 4.exit");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter the amount to deposit");
				int depositAmount = s.nextInt();
				int depamount = q.bankacc(depositAmount, ch);
				System.out.println(depamount);
				d = n--;
				q.dequeue();
				break;
			case 2:
				System.out.println("enter the amount to withdraw");
				int withdraw = s.nextInt();

				int balance = q.bankacc(withdraw, ch);
				System.out.println("remaining balance is "+balance+"  and your withdrawal money is" +withdraw);
				d = n--;
				q.dequeue();
				break;
			case 3:
				System.out.println("no of people in queue is " + q.issize());
				break;
			case 4:
				System.exit(0);
			}
		} while (ch < 4);
	}

}







