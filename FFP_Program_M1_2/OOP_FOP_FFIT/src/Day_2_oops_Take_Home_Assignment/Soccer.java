package Day_2_oops_Take_Home_Assignment;

public class Soccer extends Sports{
	
	public String getName(){
		  return " in "+name;
	  }
	  
	  public String getNumberOfTeamMembers(){
			return  " Each team has "+ players +" players";
	 }

	@Override
	public String toString() {
		return "Soccer [" + getName() + "" + getNumberOfTeamMembers() + "]";
	}
	  
	 
	
	  
}
