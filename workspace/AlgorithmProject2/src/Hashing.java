import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hashing {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("/home/bridgelabz/aman4.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		int arr[];
		HashMain h =new HashMain();
		int count=0;
		while((str=br.readLine())==null);
		{
			String words[]=str.split(" ");
			arr=new int[words.length];
			for (int i = 0; i <words.length; i++) {
		  		arr[i]=Integer.parseInt(words[i]);
		  		h.add(arr[i]);
		}
			System.out.println(h);
	}

	}
}
