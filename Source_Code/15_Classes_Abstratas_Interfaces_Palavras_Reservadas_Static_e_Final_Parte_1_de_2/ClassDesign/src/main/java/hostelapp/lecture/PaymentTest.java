package hostelapp.lecture;
public class PaymentTest {
	
	public static void main(String[] args) {
		PaymentTest pt = new PaymentTest();
		
		CreditCardPayment ccp = new CreditCardPayment(500.00, "VISA", "123-1234-12345-12",  "Florentino Ariza");

		 pt.processPayment(ccp);
		
		DebtCardPayment dcp = new DebtCardPayment(200.50, "Wells Fargo", "8979.1234.123-12", "Florentino Ariza" );
	    pt.processPayment(dcp);
	    
	    CashPayment cash = new CashPayment(200, 100);
	    pt.processPayment(cash);
	    
	    Payment check = new CheckPayment(500, "B01", "Wells Fargo", 10);
	    pt.processPayment(check);
   	}
	
	public void processPayment(Payment cp) {
		System.out.println("Processing the payment");
        System.out.println(cp);
	}
}
