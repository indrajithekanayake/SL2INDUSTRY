package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome to Quick Shop</title>        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"2px solid\" width=\"65%\" align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Image</th>\n");
      out.write("                <th>fName</th>\n");
      out.write("                <th>Lname</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");

    try{
        Blob image = null;
        byte[ ] imgData = null ;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
        String Query="select * from stuevent";
        Statement stm=con.createStatement();
        Statement stmt=con.createStatement();
        ResultSet rs=stm.executeQuery(Query);
        ResultSet rs1=stmt.executeQuery("select * from stuevent");
        while(rs.next()|| rs1.next())
        {
            image = rs1.getBlob(1);
            imgData= image.getBytes(1,(int)image.length());
            response.setContentType("Image");
            OutputStream o = response.getOutputStream();   

      out.write("      \n");
      out.write("        <tbody>\n");
      out.write("        <tr>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <td>");
      out.print(rs.getString("id"));
      out.write("</td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!--       <td>o.write(imgData);</td>             -->\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <td>");
      out.print(rs.getString("firstname") );
      out.write("</td>\n");
      out.write("        \n");
      out.write("        <td>");
      out.print(rs.getString("lastname") );
      out.write("</td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("</tr>\n");
      out.write("        </tbody>\n");
      out.write("        </table>\n");

        }
    } catch(Exception ex)
    {
    out.println("Exception:"+ex.getMessage());
    ex.printStackTrace();
    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
