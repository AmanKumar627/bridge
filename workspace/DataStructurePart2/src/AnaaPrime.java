
public class AnaaPrime {

	public static boolean anaPri(String s1, String s2) {
		// taken two array of size ten
		int count1[] = new int[10];
		int count2[] = new int[10];

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		// converting into character array
		if (s1.length() == s2.length()) {
			// first it checks the length
			for (int i = 0; i < s1.length(); i++) {
				// loop for string 1
				if (ch1[i] >= '0' && ch1[i] <= '9') {
					count1[ch1[i] - 48]++;
				}

			}
			// loop for string 2
			for (int i = 0; i < s2.length(); i++) {

				if (ch2[i] >= '0' && ch2[i] <= '9') {
					count2[ch2[i] - 48]++;
				}
			}
			//comapring two strings
			for (int i = 0; i < count1.length; i++) {
				if (count1[i] != count2[i]) {
					for (int l = 0; l < count1.length; l++) {
						count1[l] = 0;
					}
					for (int k = 0; k < count2.length; k++) {
						count2[k] = 0;
					}
					return false;
				}
			}
			//displaying the result
			for (int l = 0; l < count1.length; l++) {
				count1[l] = 0;
			}
			for (int k = 0; k < count2.length; k++) {
				count2[k] = 0;
			}
			// System.out.println("its");
			return true;
		}

		return false;

	}
}
