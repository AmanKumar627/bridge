/**
 * @author:aman kumar
 * 
 * 
 * 
 * @author bridgelabz
 *
 */
public class MainForPayment {
	public static void payment(int principal, double year, double rate) {
		double n = 12 * year;
		double r = rate / (12 * 100);
		double pow = Math.pow(1 + r, -n);
		double pay = (principal * r) / (1 - pow);
		System.out.println("the monthly payment is" + pay);

	}

}
