package Day_2_oops_guided_assignment;

public class Employee {
	protected int Id;
	protected String FirstName;
	protected String LastName;
	protected String Address;
	private static int idGen=101;
	
	public Employee(){
		Id = idGen++;
	}

	public Employee(String firstName, String lastName, String address) {
		super();
		
		FirstName = firstName;
		LastName = lastName;
		Address = address;
	}
	
	public String getFullName(){
		return FirstName+" "+ LastName;
	}

	@Override
	public String toString() {
		return  "[Id=" + Id + ", Address= " + Address
				+ ", Name : " + getFullName() + "";
	}
	
	
	
}
