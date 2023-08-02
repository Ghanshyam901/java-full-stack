package day24_GA;

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpHomePage02
 */
@WebServlet("/EmpHomePage02")
public class EmpHomePage02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpHomePage02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
        int eid = Integer.parseInt(request.getParameter("eid"));
        String ename = request.getParameter("ename");

       
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurefit", "root", "root");

            String sql = "SELECT * FROM employee WHERE eid = ? AND ename = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, eid);
            stmt.setString(2, ename);
            rs = stmt.executeQuery();

            // If the entered eid and ename are not valid, redirect to the login page
            if (!rs.next()) {
                response.sendRedirect("day24GA_login.html");
                return;
            }

            // If the entered eid and ename are valid, store the employee data in the session
            HttpSession session = request.getSession();
            session.setAttribute("eid", eid);
            session.setAttribute("ename", ename);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display a welcome message and a link to the Profile servlet
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Employee Home Page</title></head><body>");
        out.println("<h1>Welcome " + ename + "!</h1>");
        out.println("<p><a href=\"Profile\">Show Profile</a></p>");
        out.println("</body></html>");
	}

}
