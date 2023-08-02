package Day_5_oops_Guided_Assignment;

import java.util.ArrayList;

public class AccountList extends Account {
	
	public static ArrayList<Account> list = new ArrayList<>();
	
	public void addAccount(Account ac) throws FakeAccountException{
		boolean isaccountexist = false;
		for(int i=0; i<list.size(); i++){
			Account a = list.get(i);
			if(a.getAccountNumber() == ac.getAccountNumber()){
				 throw new FakeAccountException("Account already exist");
			}
		}
		if(isaccountexist == false){
			list.add(ac);
		}
	
		
	}
	
	public void showAccount(){
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
}
