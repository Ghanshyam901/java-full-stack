package Guided_login_emp;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");
		
			java.sql.Statement stmt = con.createStatement();
			String sql="select * from employee_details";
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
				
				
				
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<table><tr><th>ID<th></tr><tr><th>Name<th></tr><tr><th>Salary<th></tr><tr><th>Salary<th></tr><tr><th>loginId<th><tr></tr><th>password<th></tr>");
			while(rs.next()){
				int id = rs.getInt(" EmpId");
				String name = rs.getString("Name");
				int salary = rs.getInt("Salary");
				String logId = rs.getString("LoginId");
				String pass = rs.getString("Password");
				
				out.println("<tr><td>"+ id+"</tr></td>"+"<tr><td>"+ name+"</tr></td>"+"<tr><td>"+ salary+"</tr></td>"+ "<tr><td>"+ logId+"</tr></td>"+ "<tr><td>"+ pass+"</tr></td>");
			}
				out.println("</table></body></html>");

			
			
			rs.close();
		stmt.close();
		con.close();
			
			
		}
				catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
