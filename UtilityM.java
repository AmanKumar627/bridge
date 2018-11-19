import java.util.Arrays;
import java.util.Scanner;

public class UtilityM {
	public static void anagram(String s1, String s2) {

		char ch1[] = s1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);

		char ch2[] = s2.toCharArray();
		Arrays.sort(ch2);
		System.out.println(ch2);

		boolean res = Arrays.equals(ch1, ch2);
		if (res) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("String is not Anagram");

		}

	}

	/*******************************************************************************************/
	public static void nibbles(String n) {
		String nibble = "";
		char c[] = n.toCharArray();
		int mid = c.length / 2;
		for (int i = mid; i < c.length; i++) {
			nibble = nibble + c[i];
		}
		for (int i = 0; i < mid; i++) {
			nibble = nibble + c[i];
		}
		System.out.println("the nibble value is " + nibble);
		int num = Integer.parseInt(nibble);

		int count = Integer.toString(num).length(), j = 0, sum = 0;
		while (count != 0) {
			int rem = num % 10;
			// System.out.println(rem);
			j++;
			int dec = 1;
			if (rem == 1) {
				// System.out.println(j);
				for (int i = 0; i < j - 1; i++) {
					dec = dec * 2;

				}
				sum = sum + dec;

			}
			num = num / 10;
			count--;
		}
		System.out.println(sum);
	}

	/****************************************************************************************************************/

	static void toBinary(int num) {
		int a = num;
		String n = "";
		while (num != 0) {
			int dec = num % 2;
			n = dec + n;
			num = num / 2;
		}
		System.out.println("the binary value of " + a + " is (" + n + ")2");
		UtilityM.nibbles(n);
	}

	/*************************************************************************************/

	static void binarySearch(int a[], int key) {
		System.out.println("Integer");

		int low = 0, flag = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] > key) {
				high = mid - 1;
			} else if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] == key) {
				flag = 1;
				System.out.println("the key is found " + key + " in " + mid + " position");
				break;
			}
		}
		if (flag == 0)
			System.out.println("the key is not in the array");
	}

	/****************************************************************************************/

	static void binarySearch(String a[], String key) {
		System.out.println("String");
		int low = 0, flag = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid].compareTo(key) > 0) {

				high = mid - 1;
			} else if (a[mid].compareTo(key) < 0) {

				low = mid + 1;
			} else if (a[mid].compareTo(key) == 0) {
				flag = 1;
				System.out.println("the key is found " + key + " in " + mid + " position");
				break;
			}
		}
		if (flag == 0)
			System.out.println("the key is not in the array");
	}

	/********************************************************************************/
	public static String[] bubbleSort(String[] bubble) {
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

	/***********************************************************************************/

	public static void farehnitConversion(int temperature) {

		temperature = (temperature * 9 / 5) + 32;
		System.out.println("temperatue in farehnit is " + temperature);

	}

	/***************************************************************************************/
	public static void celciusConversion(float temperature) {
		temperature = ((temperature - 32) * 5) / 9;

		System.out.println("temperature in Celsius = " + temperature);
	}

	/****************************************************************************************/

	public static void find() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		while (check(N) != false) {
			System.out.println("enter the number");
			N = s.nextInt();

		}
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println("enter ur guess number");
		int key = s.nextInt();
		UtilityM.binarySearch(arr, key);
	}

	private static boolean check(int n) {
		int pow = 1;
		for (int i = 0; i < 1000; i++) {
			pow = pow * 2;
			if (pow == n)
				return false;

		}
		return true;
	}

	/***************************************************************************************************************/
	public static void InsertionSort(String sort[]) {

		for (int i = 1; i < sort.length; i++) {
			String key = sort[i];
			int j = i - 1;
			while (j >= 0 && sort[j].compareTo(key) > 0) {
				sort[j + 1] = sort[j];
				j = j - 1;
			}
			sort[j + 1] = key;
		}

	}
	// TODO Auto-generated method stub

	/*************************************************************************************/

	public static int[] sorting(int arr[]) {
		System.out.println("Integer");
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	static String[] sorting(String arr[]) {
		System.out.println("String");
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	/************************************************************************************/

	public static void payment(int principal, double year, double rate) {
		double n = 12 * year;
		double r = rate / (12 * 100);
		double pow = Math.pow(1 + r, -n);
		double pay = (principal * r) / (1 - pow);
		System.out.println("the monthly payment is" + pay);

	}

	/****************************************************************************************/

	public static void search(int a[], int f, int l, int n) {
		int flag = 0;
		while (f <= l) {
			int mid = (f + l) / 2;

			if (a[mid] == n) {
				System.out.println("elemnt is found" + n);
				flag = 1;
				break;
			} else if (a[mid] > n) {
				l = mid - 1;

			} else if (a[mid] < n) {
				f = mid + 1;
			}
		}
		if (flag == 0) {
			System.out.println("elemt is not found");
		}
	}

	static public int searchstr(String s[], String key, int low, int last) {
		while (low <= last) {
			int mid = (low + last) / 2;
			if (s[mid].compareTo(key) == 0) {
				System.out.println("elemt found" + key + "at the index" + mid);
				break;
			} else if (s[mid].compareTo(key) > 0) {
				last = mid - 1;
			} else if (s[mid].compareTo(key) < 0) {
				low = mid + 1;
			}
		}
		return 1;
	}

	/***************************************************************************************************/
	public static void findSquareRoot() {
		double c = 23;
		double epsilon = 1e-15; // relative error tolerance
		double t = c; // estimate of the square root of c

		// repeatedly apply Newton update step until desired precision is
		// achieved
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		// print out the estimate of the square root of c
		System.out.println(t);

	}

	/***********************************************************************************************/
	static String player1, player2, turn, board[], winner = null;

	static public void printboard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");

	}

	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
	}

	static String check() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		return null;
	}
}
