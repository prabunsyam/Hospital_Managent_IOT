package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Login_model;

import services.Login_service;

/**
 * Servlet implementation class Log_servlet
 */
@WebServlet("/Log_servlet")
public class Log_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Log_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		System.out.println(pass);
		System.out.println(user);
		Login_model lm=new Login_model();
		Login_service ls=new Login_service();
		lm=ls.logincheck(user, pass);
		String usertype=null;
		
			System.out.println("inside");
			
			
				
				String pwd=lm.getPass();
				HttpSession  session=request.getSession();
				session.setAttribute("user", lm);
				session.setAttribute("pass", pwd);
				
				
					
					response.sendRedirect("Add_pat.jsp");
				
			}
		
	

}
