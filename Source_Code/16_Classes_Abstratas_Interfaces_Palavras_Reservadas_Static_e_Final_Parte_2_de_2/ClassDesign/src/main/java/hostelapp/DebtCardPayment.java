package hostelapp;


public class DebtCardPayment {
	private double amount;
	private  String cardNumber;
	private  String nameOnCard;
	private  String bankName;

	public DebtCardPayment(double amount, String bankName, String cardNumber, String nameOnCard) {
		this.amount = amount;
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
		String temp = "Payment details (debt card):\n" +
	                              "Total amount...: $ "+ this.amount   + "\n" +
	                              "Issuer... "+ this.bankName   + "\n" +
	                              "Number...: "+ this.cardNumber  + "\n" +
	                              "Name on card...:"+ this.nameOnCard; 
		return temp;
	}
	
	
}
