package registration;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		int id = Integer.parseInt(request.getParameter("e_id")) ;
		String name =request.getParameter("e_name");
		float salary= Float.parseFloat(request.getParameter("e_salary"));
		String  email=request.getParameter("e_loginId");
		String password=request.getParameter("e_password");
		try {
			int r=register(id,name,salary,email,password);
			if(r>0){
				RequestDispatcher rd= request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

	private int register(int id, String name, float salary, String email, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");
		if(con.isClosed()){
			System.out.println("Not connected to database!! ");
			System.out.println();
		}else{
			System.out.println("Successfully Connectde to database!! ");
			System.out.println();
		}
		PreparedStatement ps = con.prepareStatement("INSERT INTO Emp (Empid, Name, Salary, LoginId, Password) VALUES (?, ?, ?, ?, ?);");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setFloat(3, salary);
		ps.setString(4,email);
		ps.setString(5, password);
		
		int rows =ps.executeUpdate();
		
		return rows;
	}

}
