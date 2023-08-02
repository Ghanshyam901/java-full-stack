package Day_6_oops_guided_assignment;


public class Account{
	
	private int Balance = 9000;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
	public synchronized void depost(int amount) throws Exception{
		

		if(amount < 0){
			throw new NegativeAmountException2("Amount should be grater than 0");
		}
		
		try {
			Thread.sleep(100);
			int acBalance = getBalance();
			acBalance+=amount;
			setBalance(acBalance);
			System.out.println("Amount Deposited, Balance: "+getBalance());
			
		} catch (Exception e) {
			
		}
		
		
		
		
	}public synchronized void withdraw(int amount) throws Exception{
		
		if(amount < 0){
			throw new NegativeAmountException2("Amount should be grater than 0");
		}
		
		int acBalance = getBalance();
		
		if(acBalance >= amount){
			try {
				Thread.sleep(1000);
				acBalance-=amount;
				setBalance(acBalance);
				System.out.println("Amount Withdraw, Balance: "+getBalance());
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}else{
			throw new AmountException("low balance");
		}
		
		
	}
	
}
