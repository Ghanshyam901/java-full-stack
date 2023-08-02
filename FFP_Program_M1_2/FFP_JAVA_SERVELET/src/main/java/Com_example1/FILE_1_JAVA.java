package Com_example1;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FILE_1_JAVA
 */
@WebServlet("/FILE_1_JAVA")
public class FILE_1_JAVA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FILE_1_JAVA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter two ranges");
		int low = scn.nextInt();
		int high = scn.nextInt();
		List<Integer> prime = new ArrayList<>();
		PrintWriter pw = response.getWriter();
		
		if(low<1 || high>100){
			pw.write("<span> range should be 1-100 </span>");
		}else{
			
		

	        while (low < high) {
	            boolean flag = false;

	            for(int i = 2; i <= low/2; ++i) {
	                // condition for nonprime number
	                if(low % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag && low != 0 && low != 1)
	              prime.add(low);

	            ++low;
	        }
	        pw.write("<span>"+"prime is :" +prime+"</span>");
		}
		
	        

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
