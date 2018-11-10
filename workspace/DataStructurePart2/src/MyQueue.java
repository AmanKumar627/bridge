
public class MyQueue {
//intialization of variables which is used
	int cap = 0;
	int front = -1;
	int rear = -1;
	int size;
	char ch1[];
	int ar[];
//constructor for initialaize the global variable
	public MyQueue(int capacity) {
		this.cap = capacity;

		rear = capacity - 1;
		ch1 = new char[cap];
		ar = new int[cap];

	}
/*
 * method for adding elements in front
 * 
 * 
 */
	boolean addfront(char ch) {
		if (front == cap - 1) {
			System.out.println("deqe");
			return true;

		}
		ch1[++front] = ch;
		System.out.print(ch1[front]);
		return true;
		// System.out.println("ok");

	}
  /*
   * 
   * check whether queue is full or not
   * 
   */
	boolean enqueue(int n) {
		if (front == cap - 1) {
			System.out.println("queue is full");
			return true;

		}
		ar[++front] = n;
		// System.out.println(ar[front]);

		return true;
	}
/*method to add the element in last
 * 
 * 
 * 
 */
	boolean adddrear(char ch) {
		if (rear == front) {
			System.out.println("f");
			return true;

		}
		ch1[rear--] = ch;
		System.out.print(ch1[rear] + "" + rear);
		return true;

	}
	/*
	 * method to remove the element from front
	 * 
	 */
     
	public char removefront() {

		if (front == -1) {
		}
		return ch1[front--];
	}
   /*
    * method to remove element from last
    * 
    */
	public char removerear() {

		return ch1[++rear];

	}
	/*
	 * removing the element from front
	 * 
	 */

	public int dequeue() {
		if (front == -1) {
		}
		return ar[front--];

	}

	@Override
	public String toString() {

		for (int i = 0; i <= front; i++) {
			System.out.println(ar[i]);
		}
		return "";
	}
}
