package com_day_3_java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validation_user_ffp
 */
@WebServlet("/Validation_user_ffp")
public class Validation_user_ffp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation_user_ffp() {
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
		
		
		
		try 
		{
			
			String email=request.getParameter("u_email");
			String pwd=request.getParameter("u_pwd");
			
			Emp e = getEmpDetails(email,pwd);
			RequestDispatcher rd = null;
			HttpSession session = request.getSession(true);
			session.setAttribute("EMP", e);
			
			
			if(e !=null)
				
			{
			  System.out.print(e.getId());
			  rd=request.getRequestDispatcher("Welcome_user_ffp");
			  rd.forward(request, response);
			}
			else
			{
				rd=request.getRequestDispatcher("Invalid_user_ffp");
				rd.forward(request, response);	
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Emp getEmpDetails(String email, String pwd) throws SQLException, ClassNotFoundException {
		
		Emp u=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/employee_1","root","root");
		
		PreparedStatement ps=con.prepareStatement("select * from emp where loginId=? and loginPassword=?");
		
		ps.setString(1, email);
		ps.setString(2, pwd);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			u=new Emp();
			
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			
			u.setSalary(rs.getDouble(3));
			u.setLoginId(rs.getString(4));
			u.setLoginPassword(rs.getString(5));
			

		}
		con.close();
		
		
		
		return u;
	}

}
