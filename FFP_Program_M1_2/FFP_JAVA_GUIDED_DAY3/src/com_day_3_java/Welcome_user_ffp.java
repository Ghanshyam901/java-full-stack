package com_day_3_java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome_user_ffp
 */
@WebServlet("/Welcome_user_ffp")
public class Welcome_user_ffp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome_user_ffp() {
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
		
		
		HttpSession session=request.getSession(false); //destination page
		Emp u=(Emp)session.getAttribute("EMP");
		PrintWriter pw=response.getWriter();
		pw.write("<h4>"+"welcome"+u.getName() +"</h4>");
		
		pw.write("<h2> Welcome to EmpPage </h2>");
		
		pw.write("<span>"+u.getId()+" "+u.getName()+" "+u.getSalary()+" "+u.getLoginId()+" "+ u.getLoginPassword()+"</span>");
		
		
	}

}
