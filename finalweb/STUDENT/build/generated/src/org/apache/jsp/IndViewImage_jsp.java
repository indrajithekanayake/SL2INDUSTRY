package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import db.DBCon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public final class IndViewImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        <script src=\"swal/dist/sweetalert-dev.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"col-md-12 col-sm-6 col-xs-12 text-center \" >\n");
      out.write("                    <h2 style=\"font-family: Serif;font-weight: bold;color:saddlebrown;font-size:50px;\">Industry Events and meetup</h2>\n");
      out.write("                    <br><br>\n");
      out.write("         </div>\n");
      out.write("        <table class=\"table table-dark table-hover\">\n");
      out.write("            \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><center><b>Id</b></center><td><center><b>First Name</b></center></td><td><center><b>Last Name</b></center></td><td><center><b>Image</b></center></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");

                        try
                        {
                                DBCon dbconn=new DBCon();
                                Connection connectToDB= dbconn.connectToDB();

                                String sqlString = "SELECT * FROM induevnt";
                                Statement myStatement = connectToDB.createStatement();
                                ResultSet rs=myStatement.executeQuery(sqlString);
                                
                                if(!rs.isBeforeFirst())
                                {
                                    
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                        <td colspan=\"3\"><center>");
out.print("No Files!"); 
      out.write("</center></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    ");

                                }    
                                
                                while(rs.next())
                                {   
                            
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><center>");
out.print(rs.getString("id")); 
      out.write("</center></td>\n");
      out.write("                                        <td><center>");
out.print(rs.getString("firstname")); 
      out.write("</center></td>\n");
      out.write("                                        <td><center>");
out.print(rs.getString("lastname")); 
      out.write("</center></td>\n");
      out.write("                                        <td><center><a href=\"Viewnew3.jsp?id=");
out.print(rs.getString("id"));
      out.write("\">View Image</a></center></td>\n");
      out.write("                                    </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                </tbody> \n");
      out.write("        </table>\n");
      out.write("                            \n");
      out.write("                            ");

                                rs.close();
                                myStatement.close();
                                connectToDB.close();
                        }catch(Exception e){e.printStackTrace();}    
                        
                    
      out.write("\n");
      out.write("                     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
