

	import java.util.Scanner;

	public class FindNum {
		static void find()
		{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		while(check(N)!=false)
		{
			System.out.println("enter the number");
			N=s.nextInt();
			
		}
		int arr[]=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		System.out.println("enter ur guess number");
		int key=s.nextInt();
		Binary.binarySearch(arr, key);
		}

		private static boolean check(int n) {
			int pow=1;
		for (int i = 0; i < 1000; i++) {
			pow=pow*2;
			if(pow==n)
				return false;
		
		}
		return true;
		}
	}


