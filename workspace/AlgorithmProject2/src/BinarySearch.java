/**
 
* @author aman kumar
 * 
 * purpose:binary search for String 
 * 
 * date:
 * 
 * 
 */
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7,8,9};
		String a[]= {"apple","banana","grape","guava","mango"};
		System.out.println("enter the key for integer and String");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		String word=s.next();
		long start=System.currentTimeMillis();
		Binary.binarySearch(arr, key);
		long finish=System.currentTimeMillis();
		long elapsedTime=finish-start;
		System.out.println(start+"--"+finish+"--"+elapsedTime);
		 start=System.currentTimeMillis();
		Binary.binarySearch(a, word);
		 finish=System.currentTimeMillis();
		 elapsedTime=finish-start;
		System.out.println(start+"--"+finish+"--"+elapsedTime);
	}
	}
	
	
	


