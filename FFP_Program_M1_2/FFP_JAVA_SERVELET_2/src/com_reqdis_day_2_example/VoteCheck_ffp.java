package com_reqdis_day_2_example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoteCheck_ffp
 */
@WebServlet("/VoteCheck_ffp")
public class VoteCheck_ffp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteCheck_ffp() {
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
		
		int age = Integer.parseInt(request.getParameter("v_age"));
		
		RequestDispatcher rd = null;
		if(age>=18){
			rd = request.getRequestDispatcher("CanVote_ffp");
			rd.forward(request, response);
		}else{
			rd = request.getRequestDispatcher("CanNotVote_ffp");
			rd.forward(request, response);
		}
		
	}

}
