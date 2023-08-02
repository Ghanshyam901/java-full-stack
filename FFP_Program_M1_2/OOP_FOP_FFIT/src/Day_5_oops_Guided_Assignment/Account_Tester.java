package Day_5_oops_Guided_Assignment;

public class Account_Tester {

	public static void main(String[] args) throws Exception {
		AccountList ac = new AccountList();
		AccountManager am = new AccountManager();
		
		Account a1 = new Account(99887766,23000);
		Account a2 = new Account(99787766,25000);
		Account a3 = new Account(99687766,26000);
		Account a4 = new Account(99587766,29000);
		Account a5 = new Account(99507766,29000);
		Account a6 = new Account(90508766,29000);
		
		ac.addAccount(a1);
		ac.addAccount(a2);
		ac.addAccount(a3);
		ac.addAccount(a4);
		ac.addAccount(a5);
		ac.addAccount(a6);

		
		ac.showAccount();
		
	
		System.out.println(am.checkAccount(99787766));
		System.out.println(am.deposit(99587766, 500000));
		System.out.println(am.deposit(99887766, 500800));
		System.out.println(am.deposit(9968776, 506000));
		
		System.out.println("-----------------------------------xxxxxxxx-----------------------------------");
		
//	    System.out.print(am.withdraw(99587766, 7729000));
		
		
		

	}

}
