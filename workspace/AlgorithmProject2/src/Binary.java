/**
 * author:aman kumar
 * 
 * 
 * purpose:logic for binary search
 * 
 * 
 * date:
 * 
 *
 */
public class Binary {

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
}
