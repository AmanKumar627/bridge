import java.util.Scanner;

public class InsertionSortString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sring you want to sort");
		String st = sc.nextLine();
		Sorting.Sort(st);
		char []ch=new char[26];
		Sorting.printCharacater(ch);
		

	}

}