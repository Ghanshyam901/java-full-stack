package Day_2_oops_inhertance_Customer;

 public class Customer {
	
	private int Id;
	private String FirstName;
	private String LastName;
	private double Balance;
	
	public Customer(){
		
	}
	
	public Customer(int id, String firstName, String lastName, double balance) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Balance = balance;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Balance=" + Balance
				+ "]";
	}
	
	
	
	
}
