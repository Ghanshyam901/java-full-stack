package Day_6_oops_guided_assignment;

public class AccountTester  {

	public static void main(String[] args){
		
		Account a = new Account();
		Thread t1=new Thread()
		{
			public void run()
			{
				try {
					a.depost(2000);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2=new Thread()
		
		{
			public void run()
			{
				try {
					a.withdraw(3000);
				}catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		};
		t2.start();

	}

}
