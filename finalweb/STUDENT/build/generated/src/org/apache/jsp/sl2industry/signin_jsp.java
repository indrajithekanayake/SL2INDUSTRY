package org.apache.jsp.sl2industry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>SL2INDUSTRY | Sign In</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main style sheet -->\r\n");
      out.write("    <link href=\"assets/css/signin.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"testbox\">\r\n");
      out.write("    <button style=\"float: right\" onclick=\"location.href='index.jsp'\">X</button>\r\n");
      out.write("    <h1>Sign In</h1>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"LoginServlet\">\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"accounttype\">\r\n");
      out.write("            <input type=\"radio\" value=\"None\" id=\"radioOne\" name=\"account\" checked/>\r\n");
      out.write("            <label for=\"radioOne\" class=\"radio\">Professional</label>\r\n");
      out.write("            <input type=\"radio\" value=\"None\" id=\"radioTwo\" name=\"account\" />\r\n");
      out.write("            <label for=\"radioTwo\" class=\"radio\">Student</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <label id=\"icon\" for=\"name\"><i class=\"icon-envelope \"></i></label>\r\n");
      out.write("        <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"Email\" required/>\r\n");
      out.write("        <label id=\"icon\" for=\"name\"><i class=\"icon-shield\"></i></label>\r\n");
      out.write("        <input type=\"password\" name=\"pw\" id=\"name\" placeholder=\"Password\" required/>\r\n");
      out.write("        <h5 style=\"margin-left: 20px\">Aren't you registered yet? <a href=\"register.jsp\" style=\"color: red\">Register Now</a><br>.</h5>\r\n");
      out.write("        <div class=\"gender\">\r\n");
      out.write("            <input type=\"checkbox\" value=\"None\" id=\"male\" name=\"gender\" checked/>\r\n");
      out.write("            <label for=\"male\" class=\"checkbox\" chec><p>Subscribe our newsletter to stay updated</p></label>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <center><input type=\"submit\" value=\"Sign In\" class=\"button\" ><center>\r\n");
      out.write("        \r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
