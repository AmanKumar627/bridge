/**
 * 
 * author:aman kumar
 * 
 * purpose:anagram string
 * 
 * date:
 */

	import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("eneter the first String");
			String st1=sc.nextLine();
			System.out.println("enter the second String");
			String st2=sc.nextLine();
			boolean bn=Anagram1.isAnagram(st1,st2);
			if(bn)
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not an anagram");


}
			
		}
	}