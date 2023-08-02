package day_1_jdbc_TakeHome_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day_1_jdbc_guided_Assignment.GlobalConnect;

public class Main_class {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scn = new Scanner(System.in);
	
		System.out.println("Enter yes or No For perform the task");
		String choice = scn.nextLine();
		
		if(choice.equalsIgnoreCase("no")){
			System.out.print("Thanks for using our application...");
			scn.close();
		}
		
		
		int ch;
		while(choice.equalsIgnoreCase("yes")){
				
				do{
					System.out.println("1 for delete the data , 2 for get the data from table ,else 0");
					ch = scn.nextInt();
					
					switch(ch){
					
					
					case 1 : 
						System.out.println("Enter Id ");
						deleteData(scn.nextInt());
						break;
					 
					case 2 :
						System.out.print("Enter Id ");
						showData(scn.nextInt());
						break;
					default:
						
						break;
					}
				}while(ch!=0);
				System.out.println("Do you want to perform operation YES or NO ");
				choice = scn.next();
				if(choice.equalsIgnoreCase("no")){
					System.out.print("Thanks for using our application...");
					scn.close();
				}
			}
				
			
		
		
		
	}public static void deleteData(int id) throws ClassNotFoundException, SQLException{
		
       Connection con= GlobalConnect.getConnection();
		
		boolean isExistId = false;
		
		PreparedStatement ps1=con.prepareStatement("Select * from user_a");
		ResultSet rs=ps1.executeQuery();  
		while(rs.next()){
			if(rs.getInt(1) == id){
				isExistId = true;
				break;
			}
		}
		
		if(isExistId== true){
			PreparedStatement ps = con.prepareStatement("Delete From user_a where Id=?");
			ps.setInt(1, id);
			ps.execute();
			System.out.println("Successfully deleted .. ");
		}else{
			System.out.println("Invalid id");
		}
		
	}public static void showData(int id) throws ClassNotFoundException, SQLException{
		Connection con= GlobalConnect.getConnection();
		
		boolean isExistId = false;
		PreparedStatement ps1=con.prepareStatement("select * from user_a");
		ResultSet rs=ps1.executeQuery();  
		while(rs.next()){
			if(rs.getInt(1) == id){
				isExistId = true;
				break;
			}
		}
		
		
		if(isExistId){
			
			PreparedStatement ps = con.prepareStatement("Select * from user_a where Id=?");
			ps.setInt(1, id);
			ps.executeQuery();
		    
		    ResultSet rs2=ps.executeQuery(); 
			while(rs2.next()){
			    System.out.println(rs2.getInt(1)+" " +rs2.getString(2)+" "+rs2.getDouble(3)+" "+rs2.getLong(4));
			}
		
		}else{
			System.out.println("Invalid id");
		}

	}

}
