package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentSignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Student Signup</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        <script src=\"swal/dist/sweetalert-dev.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"swal/dist/sweetalert.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#D3D3D3\">\n");
      out.write("      \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <section id=\"login\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                        <h2 class=\"section-heading\">Create Student Account</h2>\n");
      out.write("                        <hr class=\"light\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3\"></div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 text-center\" >\n");
      out.write("                        <form action=\"Servsign\" method=\"POST\" name=\"signup\"> \n");
      out.write("                            <input type=\"text\" id=\"name\" class=\"form-control\" name=\"name\" placeholder=\"Name\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"Uname\" class=\"form-control\" name=\"UID\" placeholder=\"User ID\" required=\"\"/><br>\n");
      out.write("                            <input type=\"password\" id=\"Pw1\" class=\"form-control\" name=\"password1\" placeholder=\"Password\" autocomplete=\"off\" required=\"\"/><br>\n");
      out.write("<!--                            <input type=\"password\" id=\"Pw2\" class=\"form-control\" name=\"password2\" placeholder=\"Re-type password\" required=\"\"/><br>-->\n");
      out.write("                            <input type=\"text\" id=\"Nic\" class=\"form-control\" name=\"nic\" placeholder=\"NIC No\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"sno\" class=\"form-control\" name=\"sno\" placeholder=\"Student No\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"City\" class=\"form-control\" name=\"addres\" placeholder=\"Address\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"Street\" class=\"form-control\" name=\"university\" placeholder=\"University\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"Cno\" class=\"form-control\" name=\"cno\" placeholder=\"Contact Number\" required=\"\"/><br>\n");
      out.write("                            <input type=\"text\" id=\"fac\" class=\"form-control\" name=\"fac\" placeholder=\"Faculty\" required=\"\"/><br>\n");
      out.write("                            <hr class=\"dark\">\n");
      out.write("                            <br><br>\n");
      out.write("                            <button class=\"btn btn-xl btn-info sr-button\" name=\"SignUp\" type=\"submit\">Create my account</button><br>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
