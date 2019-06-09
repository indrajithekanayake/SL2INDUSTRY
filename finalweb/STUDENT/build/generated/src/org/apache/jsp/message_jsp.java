package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Send Message</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"padding-top: 10px;\">\n");
      out.write("            <h1 class=\"page-header\" >Send Message </h1>\n");
      out.write("                <!-- edit form column -->\n");
      out.write("                \n");
      out.write("                    <form action=\"mgssv\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("                      \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-lg-1 control-label\">User ID:</label>\n");
      out.write("                            <div class=\"col-lg-5\">\n");
      out.write("                                <input type=\"text\" name=\"id1\"  class=\"form-control\" autofocus required=\"\">                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-md-1 control-label\">Date:</label>\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <input type=\"date\" name=\"date1\" class=\"form-control\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-lg-1 control-label\">Message</label>\n");
      out.write("                            <div class=\"col-lg-5\">\n");
      out.write("                                               \n");
      out.write("                                <textarea rows=\"5\" cols=\"60\" name=\"mg\" required=\"\"></textarea> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-md-3 control-label \"></label>\n");
      out.write("                            <div class=\"col-md-8 \">\n");
      out.write("                                <input class=\"btn btn-info btn-xl\" value=\"SEND\" type=\"submit\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("         <div class=\"container\" style=\"padding-top: 20px;\">\n");
      out.write("            <h1 class=\"page-header\" >View Message </h1>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        <table class=\"table table-dark table-hover\">\n");
      out.write("<tr>\n");
      out.write("    <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("      <th scope=\"col\">ID</th>\n");
      out.write("      <th scope=\"col\">Date</th>\n");
      out.write("      <th scope=\"col\">Message</th>\n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("\n");

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from messga where id='1111'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){ 
    
      out.write("\n");
      out.write("    <tr >\n");
      out.write("<td>");
      out.print(resultSet.getString("id") );
      out.write("</td> \n");
      out.write("<td>");
      out.print(resultSet.getString("date") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("messge") );
      out.write("</td>\n");
      out.write(" \n");
      out.write("</tr>\n");

    }
connection.close();
} catch (Exception e) {
e.printStackTrace();
}


      out.write("\n");
      out.write("\n");
      out.write("        </table><div class=\"col-md-12 col-sm-6 col-xs-12 text-center \" ><li><a href=\"Unistudent.jsp\" class=\"btn btn-danger btn btn-xl\" >BACK</a></li><h1></h1>\n");
      out.write("        </div>\n");
      out.write("\n");
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
