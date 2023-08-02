package com_entity;

public class Team {
	
	private int Id;
	private String Name,City,State;
	
	public Team() {
	
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String name, String city, String state) {
		
		Id = id;
		Name = name;
		City = city;
		State = state;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
		return "Team [Id=" + Id + ", Name=" + Name + ", City=" + City + ", State=" + State + "]";
	}
	
	
	
	
}
