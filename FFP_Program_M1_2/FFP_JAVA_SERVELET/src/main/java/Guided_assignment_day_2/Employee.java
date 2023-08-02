package Guided_assignment_day_2;

public class Employee {
	
	private int empId;
	private String Name;
	private double Salary;
	private String Gender;
	private String emailId;
	private String password;
	
	public Employee(){
		
	}

	public Employee(int empId, String name, double salary, String gender, String emailId, String password) {
		super();
		this.empId = empId;
		Name = name;
		Salary = salary;
		Gender = gender;
		this.emailId = emailId;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", Salary=" + Salary + ", Gender=" + Gender
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	
	
	
}
