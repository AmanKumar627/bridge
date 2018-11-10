package com.bridge;

import java.util.Scanner;

public class BinarySearchTree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of nodes");
		int number=sc.nextInt();
		int arr[]=new int[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("enter the number you want to give");
			arr[i]=sc.nextInt();
			long x=Tree.catalanNumber(arr[i]);
			System.out.println("the poaaaible number of "+arr[i]+"  length "+x);
		}
	}

}
