import java.util.Scanner;

public class Mix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number between  0 to thousand");

		int number1 = sc.nextInt();
	//	int number2 = sc.nextInt();
		if (number1 <= 1000) {
			Primechecker.checkPrime(number1);
		//	Primechecker.checkAnagram(number1, number2);
			
		//	Primechecker.checkPallindrome(number1);
			
		}
		else
		{
			System.out.println("enter valid number");
		}
	}

}
