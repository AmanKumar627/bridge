import java.util.Scanner;

public class MonthlyPaymenr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount");
		int principal = sc.nextInt();
		System.out.println("enter the year");
		double year = sc.nextDouble();
		System.out.println("enter the rate of percentage");
		double rate = sc.nextDouble();
		MainForPayment.payment(principal, year, rate);

	}

}
