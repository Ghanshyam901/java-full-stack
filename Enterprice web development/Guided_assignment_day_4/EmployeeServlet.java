package com_Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditEmployee
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try 
		   {
			List<Employee> emplist=displayAll();
			request.setAttribute("allteams",emplist);
			RequestDispatcher rd=request.getRequestDispatcher("GetAllEmployees.jsp");
			rd.forward(request, response);
		   } 
		    catch (ClassNotFoundException | SQLException e) 
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher rd=request.getRequestDispatcher("EditEmployee.jsp");
		rd.forward(request, response);
		String req=request.getParameter("request_type");
		PrintWriter pw=response.getWriter();
		Employee e=new Employee();
		e.setEmpId(Integer.parseInt(request.getParameter("id")));
		e.setName(request.getParameter("name"));
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		e.setGender(request.getParameter("gender"));
		e.setLoginId(request.getParameter("logind"));
		e.setPassword(request.getParameter("pwd"));
		String id=request.getParameter("pwd");
		try 
		{
			int i = updateEmployee(e);
			if(i!=0)
				doGet(request, response);
			else
				pw.write("<h1>updation Failed</h1>");
		} 
		catch (ClassNotFoundException | SQLException E) {
			// TODO Auto-generated catch block
			E.printStackTrace();
		}
	}
		
	
	public List<Employee> displayAll() throws ClassNotFoundException, SQLException 
	{
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee t=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/npci_c6","root","root");
		PreparedStatement ps=con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			t=new Employee();
			t.setEmpId(rs.getInt(1));
			t.setName(rs.getString(2));
			t.setSalary(rs.getDouble(3));
			t.setGender(rs.getString(4));
			t.setLoginId(rs.getString(5));
			
		}
		con.close();
		return empList;
	}
	public int updateEmployee(Employee e) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/npci_c6","root","root");
		PreparedStatement ps=con.prepareStatement("update employee set empid=? name=? salary=? gender=? loginid=?   where password=?");
		ps.setInt(1,e.getEmpId() );
		ps.setString(2, e.getName());
		ps.setDouble(3, e.getSalary());
		ps.setString(4,e.getGender());
		ps.setString(5,e.getLoginId());
		ps.setString(6,e.getPassword());
		
		int res=ps.executeUpdate();
		return res;

}
}

