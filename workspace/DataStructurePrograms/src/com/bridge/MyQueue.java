package com.bridge;

public class MyQueue {
	int cap = 0;
	int front = -1;
	int rear = -1;
	int size;
	char ch1[];

	public MyQueue(int capacity) {
		this.cap = capacity;

		rear = capacity - 1;
		ch1 = new char[cap];
	}

	boolean addfront(char ch) {
		if (front == cap - 1) {
			System.out.println("deqe");
			return true;
		}

		ch1[++front] = ch;
		System.out.println(ch1[front]);
		return true;
		// TODO Auto-generated method st
		// TODO Auto-generated method stub

	}

	boolean addrear(char ch) {
		if (rear == front) {
			System.out.println("f");
			return true;
		}

		ch1[rear--] = ch;
		System.out.println(ch1[rear] + "" + rear);
		return true;
	}

	public char removefront() {
		if (front == -1) {
		}
		return ch1[front--];

	}

	public char removerear() {
		return ch1[++rear];
	}
}
