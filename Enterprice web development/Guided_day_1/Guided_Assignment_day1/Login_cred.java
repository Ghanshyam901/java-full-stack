package Guided_Assignment_day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_cred
 */
@WebServlet("/Login_cred")
public class Login_cred extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_cred() {
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
		
		String id = request.getParameter("U_ID");
		String password = request.getParameter("U_PASSWORD");
		
		PrintWriter out=response.getWriter();
		
		out.write("<html><head></head><body style='background-color:yellow;font-size:140%'>");
		
		if(id.equals("HR") && password.equals("PASSWORD")){
			out.write("<h1 style='color:blue' >Welcome to HR Home Page </h1>");
		}else{
			out.write("<h1 style='color:red'>Invalid Credentails</h1>");
		}
		 out.write("</body></html>");
		
	}

}
