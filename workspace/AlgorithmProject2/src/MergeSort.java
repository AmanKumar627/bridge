/**
 * author:aman kumar
 * 
 * 
 * purpose:merge sort for string
 * 
 * 
 *date:
 */
public class MergeSort {

		public static void main(String[] args) {
			System.out.println("main");
			String word[]= {"mango","guava","tomato","grape","apple"};
			String w[]=Sort.sort(word, 0, word.length-1);
			System.out.print("[");
			for (int i = 0; i < w.length; i++) {
				System.out.print(w[i]+" ");
			}
			System.out.print("]");
		}
		}


