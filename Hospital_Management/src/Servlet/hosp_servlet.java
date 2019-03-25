package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Login_model;


import services.hosp_service;


/**
 * Servlet implementation class hosp_servlet
 */
@WebServlet("/hosp_servlet")
public class hosp_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hosp_servlet() {
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
		Login_model lm = new Login_model();
		hosp_service ls = new hosp_service();
		
		String operation=request.getParameter("operation");
		if(operation.equals("Create login"))
		{
			System.out.println("inside");
			//String id=request.getParameter("id");
			String usr=request.getParameter("user");
			String ps=request.getParameter("pass");
			
			System.out.println("inside11");
			System.out.println(usr+ps);
			lm.setUser(usr);
			lm.setPass(ps);
			
			
			int a=ls.insert(lm);
			if(a!=0)
			{
				response.sendRedirect("index.jsp?msg=a");
				
			}
			else
			{
				response.sendRedirect("index.jsp?msg=b");	
			}	
		}	
			
	}	
	}

	
