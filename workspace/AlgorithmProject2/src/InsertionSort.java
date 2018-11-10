/**
 * @author:aman kumar
 * 
 * 
 * purpose:Insertion sort for String and integer
 * 
 * 
 * date:
 */
public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {4,1,3,6,2,5,0};
		String word[]= {"mango","banana","grape","guava","apple"};
		long start=System.currentTimeMillis();
		int b[]=Insertion.sorting(a);
		System.out.print("[");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		long finish=System.currentTimeMillis();
		long elapsedTime=finish-start;
		System.out.println(start+"--"+finish+"--"+elapsedTime);
		System.out.println();
		start=System.currentTimeMillis();
		String w[]=Insertion.sorting(word);
		
		
		System.out.print("[");
		for(int i=0;i<w.length;i++)
		{
			System.out.print(w[i]+" ");
		}
		System.out.print("]");
		finish=System.currentTimeMillis();
		elapsedTime=finish-start;
		System.out.println(start+"--"+finish+"--"+elapsedTime);
	}
	}


