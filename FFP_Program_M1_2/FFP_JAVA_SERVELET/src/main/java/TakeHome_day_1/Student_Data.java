package TakeHome_day_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student_Data
 */
@WebServlet("/Student_Data")
public class Student_Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Data() {
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
		
		String name = request.getParameter("Name");
		String password = request.getParameter("Password");
		String hobbies = request.getParameter("Hobbies");
		String gender = request.getParameter("gender");
		String address = request.getParameter("Address");
		String color = request.getParameter("Color");
		String dob = request.getParameter("Dob");
		
		PrintWriter out=response.getWriter();
		
		out.write("<html><head></head><body style='background-color:grey;font-size:120%'>");
		
		if(name.length() == 0 ||password.length() < 5 || hobbies.length() == 0 || gender == null  || address.length() == 0 || color.length() == 0 || dob.length() == 0){
			out.write("<h1> please provide all details</h1>");
		}else{
		
		out.write("<h4>Name : "+name +"</h4>");
		out.write("<h4>Password : "+password +"</h4>");
		out.write("<h4>Hobbies : "+hobbies +"</h4>");
		out.write("<h4>Gender : "+gender +"</h4>");
		out.write("<h4>Address : "+address +"</h4>");
		out.write("<h4>Color : "+color +"</h4>");
		out.write("<h4>Date of Birth : "+dob +"</h4>");
		
		
		 out.write("</body></html>");
		}
		
		
		
	}

}
