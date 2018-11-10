package com.bridge;

public class MyQueueForCashCounter {

	
	static int front=-1,rear=-1,cap=0;
	String namee[];
	int bal=2000;
	public MyQueueForCashCounter(int capp) {
		this.cap=capp;
		
		namee=new String [cap];
	}
	boolean enqueue(String name) {
		namee[++front]=name;
		return true;
	}
	int bankacc(int amount,int op) {
	    if(op==1)
		{bal=bal+amount;
		
		return bal;
		}
	    else if(op==2) {
	    	if(amount<bal) {
	    		bal=bal-amount;
	    		return bal;
	    	}else {
	    		System.out.println("bank have insufficent amount");
	    		return 0;
	    	}
	    	
	    	}
	return 0;}
	String dequeue()
	{
		return namee[++rear];
		
	}
	int issize() {
		if(front==-1) {
			return 0;
		}
		if(front>=0) {
			//System.out.println("dd");
			return (front-rear); 
		}
		return 0;
	}
	}


