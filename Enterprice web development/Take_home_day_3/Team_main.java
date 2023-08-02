package com_take_home_day_3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Team_main
 */
@WebServlet("/Team_main")
public class Team_main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Team_main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		int id = Integer.parseInt(request.getParameter("t_id")) ;
		String name =request.getParameter("t_name");
		String city =request.getParameter("t_city");
		String state =request.getParameter("t_state");
		
		try {
			int r=register(id,name,city,state);
			if(r>0){
				RequestDispatcher rd= request.getRequestDispatcher("AddTeam.html");
				rd.include(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int register(int id, String name, String city, String state) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/employee_1","root","root");
		
		if(con.isClosed()){
			System.out.println("Not connected to database!! ");
			System.out.println();
		}else{
			System.out.println("Successfully Connectde to database!! ");
			System.out.println();
		}
		PreparedStatement ps = con.prepareStatement("INSERT INTO Team (id, name,city, state) VALUES (?, ?, ?, ?);");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3,city);
		ps.setString(4,state);
		
		int rows =ps.executeUpdate();
		
		return rows;
		
		
	}
		
}	
	


