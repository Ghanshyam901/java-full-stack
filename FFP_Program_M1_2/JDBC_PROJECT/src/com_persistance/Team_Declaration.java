package com_persistance;

import java.sql.SQLException;
import java.util.List;

import com_entity.Team;

public interface Team_Declaration {
	
	public List<Team> displayAllTeams() throws ClassNotFoundException, SQLException;
	public int InsertTeam(Team t) throws SQLException, ClassNotFoundException;
	public int updateTeam(Team t);
	public int deleteTeam(int id);
	public int searchTeam(String name);
}
