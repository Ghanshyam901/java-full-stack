package Employee_management;

public class Admin {
	private int AdminId;
	private String Name;
	private String Email;
	private String Password;
	private static int AdminIdGen = 1001;
	public Admin(){
		
	}
	
	public Admin(String name, String email, String password) {
		
		AdminId = AdminIdGen++;
		Name = name;
		Email = email;
		Password = password;
	}

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public static int getAdminIdGen() {
		return AdminIdGen;
	}

	public static void setAdminIdGen(int adminIdGen) {
		AdminIdGen = adminIdGen;
	}

	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
	
	
	
}
