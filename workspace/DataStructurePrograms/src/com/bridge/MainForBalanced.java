/**
 * @
 * 
 * 
 */
  package com.bridge;
 

import java.util.Scanner;

public class MainForBalanced {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String exp;
		System.out.println("enter the expression");
		exp = s.next();
		BalancedParenthesis my = new BalancedParenthesis(10);
		int flag = 0;
		char ch[] = exp.toCharArray();
		for (int i = 0; i < exp.length(); i++) {
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
			{
				my.push(ch[i]);
			}
			
			
			
			else if (((char) my.peek() == '(' && ch[i] == ')') || ((char) my.peek() == '{' && ch[i] == '}')
					|| ((char) my.peek() == '[' && ch[i] == ']')) {
				// System.out.println("so");
				my.pop();
				// System.out.println(my.pop());
			}

		}
		boolean b = my.isEmpty();
		if (b == true) {
			System.out.println("it is balanced");
		} else {
			System.out.println("not");
		}
	}
}
