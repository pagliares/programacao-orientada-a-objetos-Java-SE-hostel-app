package hostelapp;


public class CreditCardPayment {
    private double amount;
	private  String cardNumber;
	private  String nameOnCard;
	private  String issuer;

	public CreditCardPayment(double amount, String issuer, String cardNumber, String nameOnCard) {
		this.amount = amount;
		this.issuer = issuer;
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
	}

	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getIssuer() {
		return issuer;
	}
	
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	
	public String getDetails() {
		String temp = "Payment details (credit card):\n" +
	                              "Total amount...: $ "+ this.amount + "\n" +
	                              "Issuer...:"+ this.issuer + "\n" +
	                              "Number...: "+ this.cardNumber + "\n" +
	                              "Name on card...:"+ this.nameOnCard; 
		return temp;
	}
 }
