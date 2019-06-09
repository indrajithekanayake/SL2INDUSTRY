package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UniAddproject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        <script src=\"swal/dist/sweetalert-dev.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"swal/dist/sweetalert.css\">\n");
      out.write("        <title>Add Project</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#b4e7ea\"s>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"padding-top: 50px;\">\n");
      out.write("            <h1 class=\"page-header\" >Add Project & Problem</h1>\n");
      out.write("                <!-- edit form column -->\n");
      out.write("                <div class=\"col-md-6 col-sm-6 col-xs-12 personal-info\">\n");
      out.write("                    <h3>Project info,</h3>\n");
      out.write("                    <br>\n");
      out.write("                    <form action=\"addpost\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("                      \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-lg-3 control-label\">User ID:</label>\n");
      out.write("                            <div class=\"col-lg-8\">\n");
      out.write("                                <input type=\"text\" name=\"id\"  class=\"form-control\" autofocus required=\"\">                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Date:</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <input type=\"date\" name=\"date\" class=\"form-control\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-lg-3 control-label\">Project Name:</label>\n");
      out.write("                            <div class=\"col-lg-8\">\n");
      out.write("                                <input type=\"text\" name=\"pn\" class=\"form-control\" autofocus required=\"\">                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Project Type:</label>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <input type=\"text\" name=\"pt\" class=\"form-control\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-lg-3 control-label\">Description: </label>\n");
      out.write("                            <div class=\"col-lg-8 \">\n");
      out.write("                                <!--<input type=\"text\" name=\"ds\" class=\"form-control\" required=\"\">-->\n");
      out.write("                                <textarea rows=\"3\" cols=\"30\" name=\"ds\" required=\"\"></textarea>             \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-md-3 control-label\"></label>\n");
      out.write("                            <div class=\"col-md-8 \">\n");
      out.write("                                <input class=\"btn btn-danger\" value=\"Post project\" type=\"submit\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("           </div>\n");
      out.write("        \n");
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
