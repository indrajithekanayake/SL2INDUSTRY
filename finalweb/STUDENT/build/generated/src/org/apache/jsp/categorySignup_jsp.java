package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categorySignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>category Login</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#b4e7ea\" >\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("    <section id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                        <h2 class=\"section-heading\" style=\"color: black\">Select Your Category..!</h2>\n");
      out.write("                        <hr class=\"black\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                       \n");
      out.write("                       <div class=\"col-md-6 col-sm-6 col-xs-12 text-center\" >\n");
      out.write("                            <a href=\"StudentSignup.jsp\">\n");
      out.write("                                <div style=\"background-color:#b4e7ea\" class=\"thumbnail\" style='min-width:300px; width:100%; height:300px;'>\n");
      out.write("                                    <img style=\"background-color:#b4e7ea\" class=\"card-img-top\" style='height: 220px;' src=\"img/stu.png\" alt=\"Card image cap\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <h4 class=\"card-title\">Create Student Account</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                </div> \n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-6 col-sm-6 col-xs-12 text-center\">\n");
      out.write("                            <a href=\"PeopleSignup.jsp\">\n");
      out.write("                                <div style=\"background-color:#b4e7ea\" class=\"thumbnail\" style='min-width:300px; width:100%; height:300px;'>\n");
      out.write("                                    <img style=\"background-color:#b4e7ea\" class=\"card-img-top\" style='height: 220px;' src=\"img/22.png\" alt=\"Card image cap\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <h4 class=\"card-title\">Create Industry People Account</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                </div> \n");
      out.write("                            </a>\n");
      out.write("                        </div>  \n");
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
