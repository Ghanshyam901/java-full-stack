package Guided_login_emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Webpage
 */
@WebServlet("/WelcomeEmpPage")
public class WelcomeEmpPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeEmpPage() {
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
		
		PrintWriter out = response.getWriter();
		
		out.write("<body style='background-color:#FFFFF0';>");
		out.write("<h2 style='color:blue; text align:left;'> Welcome </h1>");
		out.write("<h4 style='color:blue; text-align:right;'><a href='#'>Home<a/> <a a href='#'>Logout<a/> </h4>");
		out.write("<h1 style='color:blue; text-align:center;'> Welcome to Employee Home Page </h1>");
		out.write("</body>");
//		out.write("<form> ID:<input style='margin-left:35px;' type='number' placeholder='Enter Id''><br><br>Password:<input type='text' placeholder=' ' ><br><br><input type='submit' value='Login'>");
	}

}
