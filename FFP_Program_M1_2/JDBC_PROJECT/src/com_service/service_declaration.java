package com_service;

import java.sql.SQLException;
import java.util.List;

import com_entity.Team;

public interface service_declaration {
   
	public List<Team> showAllDetails() throws ClassNotFoundException, SQLException;
	
	public int InsertionTeam(Team t) throws ClassNotFoundException, SQLException;
	public int updationTeam(Team t);
	public int deletionTeam(int id);
	public int searchTeamByName(String name);
	
	
}
