
public class Anagram1 {

	public static boolean isAnagram(String st1, String st2) {
		if (st1.length() != st2.length()) {
			System.out.println("String is not anagram");
		} else {

			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
						return true;
					}
				}
			}

		}
		return false;
	}

}
