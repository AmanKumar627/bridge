

	


	import java.util.Scanner;

	public class Quess {
		static boolean pow(int num) {
			int a=1;
			for(int i=0;i<=32;i++) {
				a=a*2;
			if(num==a) {
				return false;
			}
			}
			return true;
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num;
		boolean b=true;
		System.out.println("enter the no to guess");
		int aa=0;
		while(b!=false) {
			num=s.nextInt();
			System.out.println("enter the to guess");
			b=pow(num);
			aa=num;
		}
		int a[]=new int[aa];
		if(b==false) {
			for(int i=0;i<a.length;i++) {
		    	a[i]=i;
		    }
		    System.out.println("enter to num");
		    int n=s.nextInt();
		    InSearch.search(a, 0, a.length, n);
	    }

	}
	}

