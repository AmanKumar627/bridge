/**
 * author:aman kumar
 * 
 * 
 * 
 * purpose:primechecker
 * 
 * 
 * date:
 *
 */
public class Primechecker {

	public static void checkPrime(int number) {
		int flag = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag++;
				break;

			}
		}
		if (flag == 0) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	public static void checkAnagram(int number1, int number2) {
		String st1 = String.valueOf(number1);
		String st2 = String.valueOf(number2);
		int length1 = st1.length();
		int length2 = st2.length();
		char ch1[] = st1.toCharArray();
		char ch2[] = st2.toCharArray();
		if (st1.length() == st2.length())

			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
						System.out.println("it is anagram");
						String str1 = new String(ch1);
						String str2 = new String(ch2);
						int anagram1 = Integer.parseInt(str1);
						int anagram2 = Integer.parseInt(str2);

					}
				}

			}

	}

	public static void checkPallindrome(int number) {
		int l = Integer.toString(number).length();
		int c = 0;
		int i = 0;
		int a[] = new int[l];
		while (number != 0) {
			int r = number % 10;
			a[i] = r;
			i++;
			number = number / 10;

			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[a.length - 1 - i]) {

					System.out.println("number is pallindrome");

				}

			}
		}
	}
}
