package com_persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com_entity.Team;

public class Team_Implementation implements Team_Declaration {

	@Override
	public List<Team> displayAllTeams() throws ClassNotFoundException, SQLException {
		
		ArrayList<Team> list = new ArrayList<Team>();
		
		Connection con= GlobalConnection.getConnection();
		PreparedStatement ps =con.prepareStatement("Select * from Team");
		Team t = null;
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			t = new Team();
			t.setId(rs.getInt(1));
			t.setName(rs.getString(2));
			t.setCity(rs.getString(3));
			t.setState(rs.getString(4));
			list.add(t);
			
		}
		
		return list;
	}

	@Override
	public int InsertTeam(Team t) throws SQLException, ClassNotFoundException {
		
		Connection con= GlobalConnection.getConnection();
		PreparedStatement ps =con.prepareStatement("Insert into Team (Name,City,State) values(?,?,?)");
		ps.setString(1, t.getName());
		ps.setString(2, t.getCity());
		ps.setString(3, t.getState());
		
		int i = ps.executeUpdate();
		
		
		
		return i;
	}

	@Override
	public int updateTeam(Team t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTeam(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int searchTeam(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
