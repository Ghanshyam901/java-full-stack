package day_1_jdbc_guided_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		Scanner scn = new Scanner(System.in);
		
		while(true){
			updateBalance(scn.nextInt(),scn.nextDouble());
		}


	}public static void updateBalance(int id, double amount) throws SQLException, ClassNotFoundException{
		
		Connection con= GlobalConnect.getConnection();
		double prea =0;
		boolean isExistId = false;
		PreparedStatement ps1=con.prepareStatement("select * from Users");
		ResultSet rs=ps1.executeQuery();  
		while(rs.next()){
			if(rs.getInt(1) == id){
				
				prea = rs.getDouble(3);
				isExistId = true;
				break;
			}
		}
		
		if(isExistId == false){
			System.out.print("Invalid Id");
			ps1.close();
		}else{
			
			amount+=prea;
			PreparedStatement ps=con.prepareStatement("update Users set Amount=? where Id=?");
			
			ps.setDouble(1, amount);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			System.out.print(id +" is updated");
		}
		
		
		
	}

}
