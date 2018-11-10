package com.bridge;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
public static void main(String[] args) {
	String Suits[]={"club","diamomd","heart","spade"};
	String Ranks[]={"2","3","4","5","6","7","8","9","10","jack","king","queen","ace"};
	
	int total= (int) (Suits.length*Ranks.length);
	int l=0;
	 String deck[]=new String[total];
	for(int i=0;i<Suits.length;i++)
	{
		for(int j=0;j<Ranks.length;j++)
		{
			deck[l]=Ranks[i]+ "of"+Suits[j];
			l++;
		}
	}
	
	//shuffle
	for(int i=0;i<total;i++)
	{
		int random=i+(int)Math.random()*(total-i);
		String temp=deck[random];
		deck[random]=deck[l];
		deck[l]=temp;
	}
	for(int i=0;i<total;i++)
	{
		System.out.println(deck[l]);
	}
	
}
}

