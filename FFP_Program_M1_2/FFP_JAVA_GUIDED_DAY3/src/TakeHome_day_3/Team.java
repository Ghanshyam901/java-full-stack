package TakeHome_day_3;

public class Team {
 
	private int Team_id;
	private String name,city,state;
	
	public Team() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int team_id, String name, String city, String state) {
		super();
		Team_id = team_id;
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public int getTeam_id() {
		return Team_id;
	}

	public void setTeam_id(int team_id) {
		Team_id = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Team [Team_id=" + Team_id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}
