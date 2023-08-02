package com_persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GlobalConnection {
       
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/Teams","root","root");
		
	    return con;
	}
}
