import java.util.Scanner;

public class CelciusToFarhenhit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in celcius");
		int temperature=sc.nextInt();
		
		 temperature= (temperature * 9/5) + 32 ;
		 System.out.println("temperatue in farehnit is "+temperature);

	}

}
