package Day_2_oops_Take_Home_Assignment;

public class Sports {
	
	protected String name;
	protected String players;
	
	
	public Sports(){
		
	}


	public Sports(String name, String players) {
		super();
		this.name = name;
		this.players = players;
	}
	
	public String getName(){
		return name;
	}
	
	public String getNumberOfTeamMembers(){
		return  "Each team has  n players in Sports";
	}
	
	
	
	
}
