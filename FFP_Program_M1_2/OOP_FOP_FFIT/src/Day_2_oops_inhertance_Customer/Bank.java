package Day_2_oops_inhertance_Customer;

public class Bank {
	
	public void create_commercial_customer(int id,String Fname,String Lname , long balance , long phoneNo, String Address ){
		Commercial_Customer c1 = new Commercial_Customer();
	}
	
    public void create_personal_customer(int id,String Fname,String Lname , long balance , long phoneNo, String Address ){
    	Personal_Customer c1 = new Personal_Customer(101,"shyma","kumar",3333.0,99888888,"hellosk");
	}
	
}
