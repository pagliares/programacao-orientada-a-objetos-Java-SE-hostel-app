package hostelapp.lecture;

public class CashPayment extends Payment {
	public double amountTendered;
	
	public CashPayment(double amountTendered, double amount) {
		super(amount);
		this.amountTendered = amountTendered;
	}
 
	public double getAmountTendered() {
		return amountTendered;
	}

	public void setAmountTendered(double amountTendered) {
		this.amountTendered = amountTendered;
	}
	
	@Override
 	public String toString() {
		String temp =  "Total amount...: $ "+ this.getAmount()   + "\n" +
	                              "Amount Tendered...: $"+ this.amountTendered  + "\n" +
	                              "Exchange...: $"+ (this.amountTendered -  this.getAmount() + "\n");
		return temp;
	}
}
