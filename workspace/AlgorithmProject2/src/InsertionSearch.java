import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 
 * 
 * @author bridgelabz
 *
 */
public class InsertionSearch {
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("/home/bridgelabz/aman2.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while ((str = br.readLine()) != null) {
			String sort[] = str.split(" ");

			for(int i=0;i<sort.length;i++)
			{
				System.out.println(sort[i]);
			}
			//for (int i = 0; i < sort.length; i++) {
				InsertionSort(sort);
			//}

			for(int i=0;i<sort.length;i++)
			{
				System.out.println(sort[i]);
			}
		}
	}

	private static void InsertionSort(String sort[]) {


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

}
