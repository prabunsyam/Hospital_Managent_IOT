package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Add_patservice;

import Model.add_patModel;

/**
 * Servlet implementation class Add_patservlet
 */
@WebServlet("/Add_patservlet")
public class Add_patservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_patservlet() {
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
		System.out.println("inside servlet");
		add_patModel am = new add_patModel();
		Add_patservice as = new Add_patservice();		
		String operation=request.getParameter("operation");
		if(operation.equals("Submit"))
		{
			System.out.println("inside");
			//String id=request.getParameter("id");
			String Medical = request.getParameter("Mid");
			String finger = request.getParameter("Fid");
			String name = request.getParameter("Name");
			String age = request.getParameter("Age");
			String sex = request.getParameter("Sex");
			String wt = request.getParameter("Wt");
			String record = request.getParameter("Rcd");
			System.out.println("inside11");
			System.out.println(Medical+finger+name+age+sex+wt+record);
			am.setMedicalId( Integer.parseInt( Medical ) );
			am.setFingerID( finger );
			am.setName( name );
			am.setAge( Integer.parseInt( age ) );
			am.setSex( sex );
			am.setWeight(Integer.parseInt( wt ));
			am.setRecord( record );
			
				
			int a=as.insert(am);
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