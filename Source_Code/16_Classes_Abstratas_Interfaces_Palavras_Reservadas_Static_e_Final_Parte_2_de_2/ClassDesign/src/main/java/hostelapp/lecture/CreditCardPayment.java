package hostelapp.lecture;


public class CreditCardPayment extends CardPayment {
    
	private  String issuer;
	 
	public CreditCardPayment(double amount, String issuer, String cardNumber, String nameOnCard) {
		super(amount, cardNumber, nameOnCard);
		this.issuer = issuer;
	}

	public String getIssuer() {
		return issuer;
	}
	
	public void setIssuer(String issuer) {
		this.issuer = issuer;
 	}
	

	@Override
	public boolean equals(Object object) {
		CreditCardPayment  ccp = null;
		if (object instanceof CreditCardPayment ) {
			ccp = (CreditCardPayment) object;
            if (ccp.getCardNumber().equals(this.getCardNumber())) {
            	return true;
            }
 		} else {
 			return false;
 		}
		return false;
	}
	
	
	public String toString() {
		String temp = "Payment details (credit card):\n" +  
	                             super.toString() + "\n" +
 	                              "Issuer...:"+ this.issuer + "\n";    
		return temp;
	}	
 }
