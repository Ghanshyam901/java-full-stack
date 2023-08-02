package emp_servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GlobalConfiguration {

		public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating the connection
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","1911");
		    return con;
		}

}
