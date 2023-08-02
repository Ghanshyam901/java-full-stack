package com_controller_ui;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com_entity.Team;
import com_service.Service_Implementation;
 
public class Ipl_main {
  static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		InsertTeam();
		
		
		
	}public static void showData()throws ClassNotFoundException, SQLException{
		List<Team> list = new Service_Implementation().showAllDetails();
		for(Team t : list){
			System.out.println(t);
		}
	} public static void InsertTeam() throws ClassNotFoundException, SQLException{
		
		Team t = new Team();
		System.out.println("Enter Name ,City, State");
		t.setName(scn.nextLine());
		t.setCity(scn.nextLine());
		t.setState(scn.nextLine());
		
		int i = new Service_Implementation().InsertionTeam(t);
		if(i != 0){
			System.out.print("insertion done 1 row affected");
		}else{
			System.out.print("Insertion failed");
		}
		
	}
	

}
