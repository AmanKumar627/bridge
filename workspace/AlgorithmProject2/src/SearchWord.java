/**
 *@author amankumar 
 * 
 * purpose :read string from file and buble sort
 * 
 * date:
 */




import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWord {
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception {
	
		FileReader fr = new FileReader("/home/bridgelabz/aman1.txt");
		BufferedReader br = new BufferedReader(fr);
		String st = "";
		while ((st = br.readLine()) != null) {
			String word[] = st.split(" ");
		//	for (int i = 0; i < word.length; i++) {
			//	System.out.println(word[i]);
				BinarySearch(word);
				break;
		//	}
		}

	}

	private static void BinarySearch(String[] word) {
		String temp;
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].compareTo(word[j]) > 0) {
					temp = word[i];
					word[i] = word[j];
					word[j] = temp;

				}
				
			}
			
			
		}
		for (int i = 0; i < word.length; i++)
		{ System.out.println(word[i]);}
		String key;
		
		System.out.println("enter search word");
		key=s.next();
		  Binary.binarySearch(word, key);
		

	}

}
