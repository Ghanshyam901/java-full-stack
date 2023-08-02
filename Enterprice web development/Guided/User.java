package emp_servlet;

public class User {
	private int empId, salary;
	private String name, loginId, password;
	public User() {
		super();
	}
	
	public User(int empId, int salary, String name, String loginId, String password) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
		this.loginId = loginId;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [empId=" + empId + ", salary=" + salary + ", name=" + name + ", loginId=" + loginId + ", password="
				+ password + "]";
	}
	
}
