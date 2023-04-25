package hostelapp;
public class PaymentTest {
	public static void main(String[] args) {
		CreditCardPayment ccp = new CreditCardPayment(500.00, "Florentino Ariza", "123-1234-12345-12", "VISA");
		 
		System.out.println(ccp.getDetails() + "\n");
		
		DebtCardPayment dcp = new DebtCardPayment(200.50, "8979.1234.123-12", "Florentino Ariza", "Wells Fargo");
		 
		System.out.println(dcp.getDetails());
	}

}
