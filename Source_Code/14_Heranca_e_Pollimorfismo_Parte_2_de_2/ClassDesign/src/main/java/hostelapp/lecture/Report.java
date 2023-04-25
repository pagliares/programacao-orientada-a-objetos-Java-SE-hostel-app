package hostelapp.lecture;

public class Report {
	private CardPayment [] cardPayments;
	private int contador;
	
	public Report() {
		cardPayments = new CardPayment[2];
		contador = 0;
	}
	
	public void add(CardPayment cardPayment) {
		cardPayments[contador] = cardPayment;
		contador++;
	}
	
	@Override
	public String toString() {
		String temp = "";
	    for (CardPayment x: cardPayments)
	    	temp+=x.toString() + "\n";
	    return temp;
 	}
	
	public static void main(String[] args) {
		Report report = new Report();
		report.add(new CreditCardPayment(500.00, "VISA", "123-1234-12345-12",  "Florentino Ariza"));
		report.add(new DebtCardPayment(200.50, "Wells Fargo", "8979.1234.123-12", "Florentino Ariza" ));
		System.out.println("Payment report");
		System.out.println(report.toString());
		
	}

}
