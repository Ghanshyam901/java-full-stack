package Employee_management;

import java.util.ArrayList;
import java.util.List;

public class Admin_System extends Admin {
	
	private List<Admin> AdminData;
	
	public Admin_System(){
		AdminData = new ArrayList<>();
	}
		
	public Admin_System(List<Admin> adminData) {
		super();
		AdminData = adminData;
	}

	
	
	
	public List<Admin> getAdminData() {
		return AdminData;
	}

	public void setAdminData(List<Admin> adminData) {
		AdminData = adminData;
	}

	@Override
	public String toString() {
		return "Admin_System [AdminData=" + AdminData + "]";
	}
	
	
	
	
	
}
