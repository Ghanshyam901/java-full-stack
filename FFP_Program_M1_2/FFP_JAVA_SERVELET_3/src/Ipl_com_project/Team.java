package Ipl_com_project;

public class Team {
	
	private int temaID;
	private String playerName, email, city;
	private long phoneNo;
	
	public Team(){
		
	}

	public Team(int temaID, String playerName, String email, String city, long phoneNo) {
		super();
		this.temaID = temaID;
		this.playerName = playerName;
		this.email = email;
		this.city = city;
		this.phoneNo = phoneNo;
	}

	public int getTemaID() {
		return temaID;
	}

	public void setTemaID(int temaID) {
		this.temaID = temaID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Team [temaID=" + temaID + ", playerName=" + playerName + ", email=" + email + ", city=" + city
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
	

}
