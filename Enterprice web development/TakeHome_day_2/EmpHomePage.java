package TakeHome_day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpHomePage
 */
@WebServlet("/EmpHomePage")
public class EmpHomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpHomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empId = request.getParameter("eid");
		String password = request.getParameter("password");
		
        PrintWriter out=response.getWriter();
		
		
		
		if(empId.equals("Harsha") && password.equals("password")){
			
			out.write("<html><head></head><body style='background-color:#ffffcc;font-size:140%'>");
			out.write("<h5 style='color:blue' >Welcome " +empId+"!"+ "</h5>");
			
			out.print("<a style='margin-left:85%;color:#c61aff' href='home'>Home</a> ");
			out.print("<a style='color:#c61aff' href='home'>Logout</a>");
		
			out.write("<h1 style='color:blue;margin-left:15%' >Welcome to Employee Home Page</h1>");
			out.write("</body></html>");
			
		}else{
			out.write("<h5 style='color:blue' >Invalid details</h5>");
		}
		
		
		
		
		doGet(request, response);
	}

}
