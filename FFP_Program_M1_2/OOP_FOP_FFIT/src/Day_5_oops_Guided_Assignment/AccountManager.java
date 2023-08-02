package Day_5_oops_Guided_Assignment;


public class AccountManager extends AccountList {

	public boolean checkAccount(long accountnum){
		
		for(int i=0; i<list.size(); i++){
			Account ac = list.get(i);
			if(ac.getAccountNumber() == accountnum){
				return true;
			}
		}
		
		return false;

	}
	
	public double deposit(long accountNo, double amount) throws Exception{
		
		if(amount < 0){
			 throw new NegativeAmountException("Negative amount value");
		}
		boolean isaccount = false;
		
		for(int i=0; i<list.size(); i++){
			 Account ac = list.get(i);
			if(ac.getAccountNumber() == accountNo){
				isaccount = true;
				double preAmount = ac.getBalance();
				ac.setBalance(amount+preAmount);
				return ac.getBalance();
				
			}
		}
		if(isaccount == false){
			 throw new InvalidAccountException("Invalid account");
		}
		
		throw new InvalidAccountException("Invalid account");
		
	}
	
	public double withdraw(long accountNo, double amount) throws Exception{
		
		boolean isaccount = false;
		
		if(amount < 0){
			throw new NegativeAmountException("Negative amount value");
		}

		for(int i=0; i<list.size(); i++){
			 Account ac = list.get(i);
			if(ac.getAccountNumber() == accountNo){
				isaccount = true;
				double preAmount = ac.getBalance();
				
		
					if(preAmount > amount ){
						preAmount -=amount;
						ac.setBalance(preAmount);
						return ac.getBalance();
						
					}else{
						throw new InsufficientFundsException("InsufficientFundsException");
					}

				}
				
			}	
		
		if(isaccount == false){
			throw new InvalidAccountException("Invalid account");
		}
		
		
		
		throw new InvalidAccountException("Invalid account");
		
	}
	
	
	
}
