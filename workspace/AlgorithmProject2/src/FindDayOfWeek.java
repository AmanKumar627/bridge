import java.util.Scanner;

public class FindDayOfWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date");
		int date = sc.nextInt();
		if (date > 0 && date < 30) {
			System.out.println("the date is valid");
			System.out.println("enter the month");
			int month = sc.nextInt();
			if (month > 0 && month < 12)
				System.out.println("minth is valid");
			System.out.println("enyrer the year");
			int year = sc.nextInt();
			if (year > 0 && year < 500000)
				System.out.println("year is valid");
			  checkDay(date,month,year);
		}

	}
}

	

		// TODO Auto-generated method stub
		
	


