package com.bridge;



	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class MainList {
		   
		
	   public static void main(String[] args) throws Exception {
	   BufferedReader br=new BufferedReader(new FileReader(""));
	   String st="";
	  MainForUnOrderedList own=new MainForUnOrderedList();
	   Scanner s=new Scanner(System.in);
	   String str;
	   while((st=br.readLine())!=null) {
		  
		   String words[]=st.split(" ");
		   for(int i=0;i<words.length;i++) {
			   own.add(words[i]);
		   }
	   }
	   System.out.println(own);
	   
	     own.search("aman");
	    System.out.println(own);
	    
	    own.search("hello");
	    System.out.println(own);
	   own.search("good");
	   System.out.println(own);
	    }

	}





