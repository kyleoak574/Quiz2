import java.util.Scanner;

public class CarSales {
	Scanner scan = new Scanner(System.in);
	double totalPrice=scan.nextInt();
	double downPayment=scan.nextInt();
	double months=scan.nextInt();
	double interestRate=scan.nextInt();
	public double monthlyPay() {
		return (totalPrice*(interestRate/12))/(1-Math.pow(1+(interestRate/12), -months));
	}
	public void totalInterestPaid() {
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double ttotalPrice=scan.nextInt();
		double ddownPayment=scan.nextInt();
		double mmonths=scan.nextInt();
		double iinterestRate=scan.nextInt();
		System.out.print(ttotalPrice*iinterestRate);
	}
}
