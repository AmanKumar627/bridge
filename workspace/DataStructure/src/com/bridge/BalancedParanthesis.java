package com.bridge;

public class BalancedParanthesis {
	
	static class Stack{
		
		int top=-1;
		char items[]=new char[100];
		
		
		void push(char x)
		{
			if(top==99)
			{
			System.out.println("stack is full");
			}
			else
			{
			  items[++top]=x;
			}
			
			
		}
	}

}
