package day_1_jdbc_guided_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GlobalConnect {
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/UserData","root","root");
		
	    return con;
	}
	
}
