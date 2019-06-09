package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Astudentview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "university";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"col-md-12 col-sm-6 col-xs-12 text-center \" >\n");
      out.write("                    <h2 style=\"font-family: Serif;font-weight: bold;color:darkblue;font-size:50px;\">Student Details</h2>\n");
      out.write("                    <br>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                      <a href=\"Astudentupdate.jsp\" class=\"btn btn-xl btn-primary\" style=\" width: 260px;\">Update Student Details</a>\n");
      out.write("                            <br><br>\n");
      out.write("                            <a href=\"Astudentdelete.jsp\" class=\"btn btn-xl btn-primary\" style=\" width: 260px;\">Delete Student Details </a>\n");
      out.write("                            <br><br>\n");
      out.write("                  </div>\n");
      out.write("        <br><br>\n");
      out.write("<\n");
      out.write("        <table class=\"table table-dark table-hover\">\n");
      out.write("            <thead class=\"thead-dark\">\n");
      out.write("<tr>\n");
      out.write("<td>Name</td>\n");
      out.write("<td>Email</td>\n");
      out.write("<td>UserID</td>\n");
      out.write("<td>Password</td>\n");
      out.write("<td>NIC</td>\n");
      out.write("<td>StudentNO</td>\n");
      out.write("<td>Address</td>\n");
      out.write("<td>University</td>\n");
      out.write("<td>ContactNO</td>\n");
      out.write("<td>Faculty</td>\n");
      out.write("</tr>\n");
      out.write("            </thead>\n");

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from student";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){ 
    
      out.write("\n");
      out.write("    <tr><!--name,age,gender .. are database column-->\n");
      out.write(" <td>");
      out.print(resultSet.getString("name") );
      out.write("</td> \n");
      out.write("<td>");
      out.print(resultSet.getString("email") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("uid") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("password") );
      out.write("</td>  \n");
      out.write("<td>");
      out.print(resultSet.getString("nic") );
      out.write("</td> \n");
      out.write("<td>");
      out.print(resultSet.getString("sno") );
      out.write("</td> \n");
      out.write("<td>");
      out.print(resultSet.getString("address") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("university") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("cno") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("facility") );
      out.write("</td>\n");
      out.write("</tr>\n");

    }
connection.close();
} catch (Exception e) {
e.printStackTrace();
}


      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
