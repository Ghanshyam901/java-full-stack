package Day_5_oops_Guided_Assignment;

public class Account {
	private long AccountNumber;
	private double Balance;
	
	public Account(){
		
	}

	
	
	public Account(long accountNumber, double balance) {
		super();
		AccountNumber = accountNumber;
		Balance = balance;
	}



	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}



	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", Balance=" + Balance + "]";
	}
	
	
}
