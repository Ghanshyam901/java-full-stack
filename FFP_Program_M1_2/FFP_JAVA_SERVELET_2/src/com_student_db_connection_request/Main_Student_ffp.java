package com_student_db_connection_request;

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

/**
 * Servlet implementation class Main_Student_ffp
 */
@WebServlet("/Main_Student_ffp")
public class Main_Student_ffp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main_Student_ffp() {
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
		
		
		RequestDispatcher rd = null;
		
		 
		try {
			int id = Integer.parseInt(request.getParameter("s_id"));
			String name = request.getParameter("s_name");
			Student s = getStudentDetails(id,name);
			request.setAttribute("STUDENT",s);
			
			if(s != null){
				rd = request.getRequestDispatcher("Valid_student_ffp");
				rd.forward(request, response);
			}else{
				rd = request.getRequestDispatcher("InValid_student_ffp");
				rd.forward(request, response);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private Student getStudentDetails(int id, String name) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Student s = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/school","root","root");
		
		PreparedStatement ps = con.prepareStatement("select * from student where StudentId=? and StudentName=?");
		ps.setInt(1,id);
		ps.setString(2, name);
		
		ResultSet rs =ps.executeQuery();
		while(rs.next()){
			s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setCity(rs.getString(3));
			s.setAge(rs.getInt(4));
			s.setCourseId(rs.getInt(5));
			
		}
		
		con.close();
		return s;
	}

}
