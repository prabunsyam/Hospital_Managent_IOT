/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.22
 * Generated at: 2019-03-27 12:04:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.add_patModel;
import java.util.ArrayList;
import services.Add_patservice;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Emergency Accident portal</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Shadow Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- //Custom Theme files --> \r\n");
      out.write("<!-- web font --> \r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Arsenal:400,400i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //web font -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
Add_patservice ar=new Add_patservice();
	   ArrayList<add_patModel>arr2=ar.selectAllRegistration();
	   
      out.write("\r\n");
      out.write("\t<!-- main --> \r\n");
      out.write("\t<div class=\"main-agileinfo slider \">\r\n");
      out.write("\t\t<div class=\"items-group\">\r\n");
      out.write("\t\t\t<div class=\"item agileits-w3layouts\">\r\n");
      out.write("\t\t\t\t<div class=\"block text main-agileits\"> \r\n");
      out.write("\t\t\t\t\t<span class=\"circleLight\"></span> \r\n");
      out.write("\t\t\t\t\t<!-- login form -->\r\n");
      out.write("\t\t\t\t\t<div class=\"login-form loginw3-agile\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"agile-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Scan Your Fingerid</h1> \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-agileits-top\"> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"search.jsp\" method=\"post\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Finger print ID </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"fing\" required=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"anim\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Search\"name=\"operation\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t</form> \r\n");

String list = request.getParameter("fing") ;
System.out.println(list);

if(list!=null)
{
	System.out.println("syamsyam");
String ql= request.getParameter("list");

System.out.println(list);
//System.out.println("syamsyam");
Add_patservice vs=new Add_patservice();
ArrayList<add_patModel>arrayList=vs.search(list);
for(add_patModel rm:arrayList)
{

      out.write("\t\r\n");
      out.write("<label class=\"anim\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label> <h1>See details bellow</h1> \t\t\t\t\t\t\t\t<p>Slno</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"id\"value=\"");
      out.print(rm.getId());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Medical ID</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"Mid\"value =\"");
      out.print(rm.getMedicalId());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Fingerprint ID</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"Fid\" value=\"");
      out.print(rm.getFingerID());
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Name</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"Name\" value=\"");
      out.print(rm.getName());
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Age</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"Age\"value=\"");
      out.print(rm.getAge());
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Sex</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"Sex\" value=\"");
      out.print(rm.getSex());
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Weight</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"Wt\" value=\"");
      out.print(rm.getWeight());
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Records</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"Rcd\" class=\"name\"cols=\"50\" rows=\"5\">");
      out.print(rm.getRecord());
      out.write("</textarea>\t\r\n");
      out.write("\t\t\t\t\t\t\t");
} }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>  \r\n");
      out.write("\t\t\t\t\t</div>   \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>   \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t \r\n");
      out.write("\t<!-- //main --> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
