/**
 * 

 * author:aman kumar
 * 
 * 
 * purpose:power of 2 and should be less than
 *
 * 
 * date:
 */

	

	import java.util.Scanner;

	public class Power {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int number;
			int c = 1;
			System.out.println("enter the number of time you want  to power");
			number = scanner.nextInt();
			int a = 1;
			if (number <= 32 && number > 0) {
				while (number != 0) {
					a = a * 2;
					number--;
					System.out.println("power of 2^" + c + " " + a);
					c++;
				}
				System.out.println(a);
			} else {
				System.out.println("Only works if 0 <= N < 31 since 2^31 overflows an int");
			}

		}

	}

