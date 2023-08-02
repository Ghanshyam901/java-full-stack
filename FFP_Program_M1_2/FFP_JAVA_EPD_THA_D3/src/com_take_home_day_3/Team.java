package com_take_home_day_3;

public class Team {
	
	private int TeamId;
	private String Name,City,State;
	
	public Team(){
		
	}

	public Team(int teamId, String name, String city, String state) {
		super();
		TeamId = teamId;
		Name = name;
		City = city;
		State = state;
	}

	public int getTeamId() {
		return TeamId;
	}

	public void setTeamId(int teamId) {
		TeamId = teamId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Team [TeamId=" + TeamId + ", Name=" + Name + ", City=" + City + ", State=" + State + "]";
	}
	
	

}
