/**
 * author:aman kumar
 * 
 * purpose:take two string and print anagram or not
 * 
 * date:
 * 
 */

	import java.util.Scanner;
	import java.util.Arrays;
	class Anagram{

	public static void anagram(String s1,String s2){

		
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);

		char ch2[]=s2.toCharArray();
		Arrays.sort(ch2);
	  	System.out.println(ch2);

		boolean res=Arrays.equals(ch1,ch2);
		if(res){
		System.out.println("String is Anagram");
		}
		else{
		System.out.println("String is not Anagram");
	         }
	       }
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer the string1");
		String s1=sc.nextLine();
		System.out.println("Entrer the string2");
		String s2=sc.next();
		
		anagram(s1,s2);
		 
	}
	}

