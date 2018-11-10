package com.bridge;

import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double times;
		double head=0;
		double tail=0;
		System.out.println("enter the no of time ");
		times=s.nextInt();
		for(int i=0;i<times;i++) {
			if(Math.random()<0.5) {
				head++;
			}else {
				tail++;
			}
		}
		System.out.println(head);
		System.out.println(tail);
		double pt;
		double ph;
		pt=(tail/times)*100;
		ph=(head/times)*100;
		System.out.println("perfectage of tail "+pt);
		System.out.println("perfectage of head "+ph);
	}
	}

