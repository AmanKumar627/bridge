
public class AnaQueue {
/*
 *method using boolean to check the String is anagram or not 
 * 
 * it returns true or false
 * 
 */
	static boolean check(int m, int n) {
		boolean b;
 //changing integer into string
		String s1 = Integer.toString(m);
	//changing integer into string 
		String s2 = Integer.toString(n);
		b = AnaaPrime.anaPri(s1, s2);
		if (b == true) {

			return true;
		} else {
			return false;
		}
	}
}
