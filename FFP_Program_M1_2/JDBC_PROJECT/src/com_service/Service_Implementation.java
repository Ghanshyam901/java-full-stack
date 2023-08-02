package com_service;

import java.sql.SQLException;
import java.util.List;

import com_entity.Team;
import com_persistance.Team_Implementation;

public class Service_Implementation implements service_declaration {

	@Override
	public List<Team> showAllDetails() throws ClassNotFoundException, SQLException {
		
		return new Team_Implementation().displayAllTeams();
		
		
	}

	@Override
	public int InsertionTeam(Team t) throws ClassNotFoundException, SQLException {
		
		return new Team_Implementation().InsertTeam(t);
		
	}

	@Override
	public int updationTeam(Team t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletionTeam(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int searchTeamByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
