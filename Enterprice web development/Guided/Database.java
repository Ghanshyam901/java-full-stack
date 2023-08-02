package emp_servlet;

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

import emp_servlet.GlobalConfiguration;
import emp_servlet.User;

/**
 * Servlet implementation class Database
 */
@WebServlet("/Database")
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Database() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			PrintWriter pw = response.getWriter();
			pw.write("<html><body style='background-color:lightlink;'>");
			pw.write("<span style='color:blue;'><b>Welcome HR!</b></span><br>");
			pw.write("<center><h1 style='color:blue;'>Welcome To Employee Home Page</h1></center>");
			pw.write("<center><a href='http://localhost:8080/GuidedAssignmentDay03/Database'><u>Profile</u></a></center>");
			User d=null;
			ArrayList<User> dlist=new ArrayList<User>();
			Connection con = GlobalConfiguration.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				d=new User();
				d.setEmpId(rs.getInt(1));
				d.setName(rs.getString(2));
				d.setSalary(rs.getInt(3));
				d.setLoginId(rs.getString(4));
				d.setPassword(rs.getString(5));
				dlist.add(d);
			}
			request.setAttribute("data", dlist);
			RequestDispatcher rd = request.getRequestDispatcher("Table.jsp");
			rd.include(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	public static int save(User u){  
	    int status=0;  
	    try{  
	        Connection con=GlobalConfiguration.getConnection();  
	        PreparedStatement ps=con.prepareStatement("insert into user(empId, name, salary, loginId, password) values(?,?,?,?,?)");  
	        ps.setInt(1, u.getEmpId());
	        ps.setString(2, u.getName());
	        ps.setInt(3, u.getSalary());
	        ps.setString(4, u.getLoginId());
	        ps.setString(5, u.getPassword());
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	} 
	
	
	public static int update(User u){  
	    int status=0;  
	    try{  
	        Connection con=GlobalConfiguration.getConnection();  
	        PreparedStatement ps=con.prepareStatement("update user set name=?,salary=?,loginId=?,password=? where empId=?");  
	        ps.setString(1,u.getName());
	        ps.setInt(2,u.getSalary());
	        ps.setString(3,u.getLoginId());
	        ps.setString(4,u.getPassword());
	        ps.setInt(5,u.getEmpId());
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	} 
	
	
	public static List<User> getAllRecords(){  
	    List<User> list=new ArrayList<User>();  
	      
	    try{  
	        Connection con=GlobalConfiguration.getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from user");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            User u=new User();  
	            u.setEmpId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setSalary(rs.getInt(3));
				u.setLoginId(rs.getString(4));
				u.setPassword(rs.getString(5));
	            list.add(u);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	
	
	public static User getRecordById(int id){  
	    User u=null;  
	    try{  
	        Connection con=GlobalConfiguration.getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from user where empId=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            u=new User();
	            u.setEmpId(rs.getInt("empId"));
				u.setName(rs.getString("name"));
				u.setSalary(rs.getInt("salary"));
				u.setLoginId(rs.getString("loginId"));
				u.setPassword(rs.getString("password"));
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u; 
	}

}
