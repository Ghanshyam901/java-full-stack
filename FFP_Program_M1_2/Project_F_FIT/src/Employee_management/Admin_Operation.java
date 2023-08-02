 package Employee_management;

public class Admin_Operation extends Admin_System {
	
	
	public void AddAdmin(Admin ad){
		
		getAdminData().add(ad);
		
	}
	
	public boolean isAdmin(String Email, String password){
		Email = Email.toLowerCase();
		for(Admin ad : getAdminData()){
			String email = ad.getEmail();
			email = email.toLowerCase();
			if(email.equals(Email) && ad.getPassword().equals(password)){
				return true;
			}
		}
		
		return false;
	}
	
	
}
