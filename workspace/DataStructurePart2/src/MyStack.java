
public class MyStack {

	int size = -1;
	int s = -1;
	int cap = 10;
	int arr[] = new int[158];
	char st[] = new char[cap];
/*
 * 
 * method for adding the element in astack
 * 
 * 
 * 
 */
	
	
	public void push(char ch)

	{
		st[++size] = ch;

		// System.out.println(ch);
	}
	  
	 
	

	public void push(int n) {
		arr[++s] = n;

	}
/*
 * 
 * method for deleting element from stack
 * 
 */
	public char pop() {

		// System.out.println("sk");
		return st[size--];
	}

	public int popint() {
		if (s >= 0)
			return arr[s--];
		return 0;
	}

	public char peek() {

		if (size < 0) {
			isempty();

		}
		return st[size];
	}
    // recverse the string 
	public void reverse() {
		// System.out.println("heloo");
		// System.out.println(s);
		for (int i = 0; i <= s; i++) {
			// System.out.println("hello");
			System.out.println(arr[i]);

		}
	}
     //boolean to check its empty or not
	boolean isempty() {
		if (size == -1) {
			return true;
		} else {
			return false;
		}

	}
 //method for displaying the elements
	public void display() {

		for (int i = 0; i < st.length; i++) {
			if (st[i] != 0) {
				// System.out.println(st[i]);
			}

		}
	}
}
