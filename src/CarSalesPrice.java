import java.util.Scanner;
public class CarSalesPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Total price of car?");
		double totalPrice=scan.nextInt();
		System.out.print("Down payment on car?");
		double downPayment=scan.nextInt();
		System.out.print("Months?");
		double months=scan.nextInt();
		System.out.print("Interest rate?");
		double interestRate=scan.nextInt();
		double payPerMonth = (totalPrice-downPayment)/(((Math.pow((((interestRate/100)/12)+1), 60))-1) / ((Math.pow((((interestRate/100)/12)+1), 60))*((interestRate/100)/12))); 
		double interestTotal=(payPerMonth*months)-totalPrice;
		System.out.print("Payment per month is: "+ payPerMonth);
		System.out.print("Total interest payed is: "+interestTotal);
	}
}
