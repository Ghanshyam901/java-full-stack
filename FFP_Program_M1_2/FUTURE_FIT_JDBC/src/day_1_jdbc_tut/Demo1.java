package day_1_jdbc_tut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/hospital","root","root");
		
		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select * from course");
		
		
//		String q1 = "INSERT INTO Hospital1 VALUES (1,'raj','delhi')";
//		st.executeUpdate(q1);
//		String q2 = "INSERT INTO Hospital1 VALUES (2,'raj','delhi')";
//		st.executeUpdate(q2);
//		String q3 = "INSERT INTO Hospital1 VALUES (3,'raj','delhi')";
//		st.executeUpdate(q3);
		
//		System.out.print("database created successfully ..");
		
		ResultSet rs = st.executeQuery("select * from Hospital1");
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" " + rs.getString(3));
		}
	
		con.close();
		
		

	}

}
