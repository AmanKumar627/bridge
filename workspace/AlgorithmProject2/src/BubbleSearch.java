/**
 * @author aman kumar
 * 
 * purpose:read from the list and bubble sort the word
 * 
 * date:
 * 
 */ 
  import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BubbleSearch {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/home/bridgelabz/aman3.txt");
		BufferedReader br = new BufferedReader(fr);
		String nstr = "";
		while ((nstr = br.readLine()) != null) {
			String bubble[] = nstr.split(" ");
			for (int i = 0; i < bubble.length; i++) {

				System.out.println(bubble[i]);
			}
			String str[] = bubbleSort(bubble);
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}

		}
	}

	private static String[] bubbleSort(String[] bubble) {
		for (int i = 0; i < bubble.length - 1; i++) {
			for (int j = i; j < bubble.length; j++) {
				if (bubble[j].compareTo(bubble[i]) < 0) {
					String temp = bubble[i];
					bubble[i] = bubble[j];
					bubble[j] = temp;
				}
			}
		}
		return bubble;
	}

}

// TODO Auto-generated method stub
