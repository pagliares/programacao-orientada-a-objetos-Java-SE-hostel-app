package hostelapp.lecture;


public class DebtCardPayment extends CardPayment {
	
	private  String bankName;

	public DebtCardPayment(double amount, String bankName, String cardNumber, String nameOnCard) {
		super(amount, cardNumber, nameOnCard); //  First line in a constructor is Always a super or this
		this.bankName = bankName;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Override
    public String toString() {
    	String temp = "Payment details (debt card):\n" +
	                             super.toString() + "\n" + 
	                              "Bank name... "+ this.getBankName()   + "\n";
		return temp;
	}
}
