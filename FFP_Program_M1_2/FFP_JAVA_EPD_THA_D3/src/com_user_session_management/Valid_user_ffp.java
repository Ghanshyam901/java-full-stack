package com_user_session_management;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Valid_user_ffp
 */
@WebServlet("/Valid_user_ffp")
public class Valid_user_ffp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Valid_user_ffp() {
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
		
		
		try {
			String email = request.getParameter("e_mail");
			String password = request.getParameter("e_password");
			
			
			Emp e = getUserDetails(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Emp getUserDetails(String email, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Emp  e = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/employee_1","root","root");
		
		PreparedStatement ps = con.prepareStatement("select * from emp  where loginId=? and loginPassword=?");
		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			
			e = new Emp();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getDouble(3));
			e.setEmail(rs.getString(4));
			e.setPassword(rs.getString(5));
			
		}
		
		con.close();
		return e;
		
		
	}

}
