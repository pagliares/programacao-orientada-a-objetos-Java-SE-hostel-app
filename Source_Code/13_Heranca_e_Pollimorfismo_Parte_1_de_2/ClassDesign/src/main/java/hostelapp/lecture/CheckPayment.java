package hostelapp.lecture;

public class CheckPayment extends Payment{
      private String bankId;
      private String bankName;
      private int branchID;
     
	public CheckPayment(double amount, String bankId, String bankName, int branchID) {
		super(amount);
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchID = branchID;
	}
	
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
      
	@Override
	 public String toString() {
	    	String temp = "Payment details (Check ):\n" +
		                             super.toString() + "\n" + 
		                              "Bank name... "+ this.getBankName()   + "\n" +
	    								"Bank id... "+ this.getBankId()  + "\n" +
	    								"Branch id... "+ this.getBranchID() + "\n";
			return temp;
		}
      
      
}
