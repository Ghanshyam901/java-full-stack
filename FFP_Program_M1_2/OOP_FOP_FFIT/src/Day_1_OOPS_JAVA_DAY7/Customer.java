package Day_1_OOPS_JAVA_DAY7;

public class Customer {
	
	private String FirstName ,LastName , Address;
	private double Salary;
	private long Id;
	private static long idGen=101;
	
	
	public Customer(){
		Id = idGen++;
	}
	
	public Customer(String firstName, String lastName, String address, double salary) {
		this();
	
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Salary = salary;
		
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + " , FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", Salary="
				+ Salary + "]";
	}

	
	
	
	
	
	
	

}
