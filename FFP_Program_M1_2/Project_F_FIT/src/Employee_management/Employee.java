package Employee_management;

public class Employee {
	private int empId;
	private String FullName,EmailAddress, EmpAddress,Department;
	private long phoneNumber;
	private double Salary;
	private int yearOfExp;
	private double Bonus;
	private static int idgen=101;
	
	public Employee(){
//		empId = idgen++;
	}

	public Employee(String fullName, String emailAddress, String empAddress, String department, long phoneNumber,
			double salary, int yearOfExp, double bonus) {
		empId = idgen++;
		FullName = fullName;
		EmailAddress = emailAddress;
		EmpAddress = empAddress;
		Department = department;
		this.phoneNumber = phoneNumber;
		Salary = salary;
		this.yearOfExp = yearOfExp;
		Bonus = bonus;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public double getBonus() {
		return Bonus;
	}
	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getEmpAddress() {
		return EmpAddress;
	}

	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	

	public int getYearOfExp() {
		return yearOfExp;
	}



	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", FullName=" + FullName + ", EmailAddress=" + EmailAddress
				+ ", EmpAddress=" + EmpAddress + ", Department=" + Department + ", phoneNumber=" + phoneNumber
				+ ", Salary=" + Salary + ", yearOfExp=" + yearOfExp + ", Bonus=" + Bonus + "]";
	}
	
	

	
	
	
	
	

}
