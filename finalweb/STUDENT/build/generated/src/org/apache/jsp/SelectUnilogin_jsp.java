package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SelectUnilogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Select Universirty</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        <link href=\"css/web.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:black\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("         <section class=\"features\">\n");
      out.write("\n");
      out.write("              <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                  <h2 class=\"section-heading\" style=\"color: white\">SELECT UNIVERSITY..!</h2>\n");
      out.write("                        <hr class=\"light\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center;color:white\">\n");
      out.write("\n");
      out.write("                           <a href=\"loginUser.jsp\"><img src=\"img/nsbm.png\" ></a>\n");
      out.write("                           <br>\n");
      out.write("                            NSBM \n");
      out.write("                        </p>\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center;color:white\">\n");
      out.write("\n");
      out.write("                            <a href=\"loginUser.jsp\"><img src=\"img/slit.png\"></a>\n");
      out.write("                            <br>\n");
      out.write("                             SLITT\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center;color:white\">\n");
      out.write("\n");
      out.write("                            <a href=\"loginUser.jsp\"><img src=\"img/nibm.png\"></a>\n");
      out.write("                        NIBM\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center;color:white\">\n");
      out.write("\n");
      out.write("                            <a href=\"loginUser.jsp\"><img src=\"img/ichs.png\"></a>\n");
      out.write("                             IUHS\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center;color:white\">\n");
      out.write("\n");
      out.write("                            <a href=\"loginUser.jsp\"><img src=\"img/icbt.png\"></a>\n");
      out.write("                            ICBT\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center;color:white\">\n");
      out.write("\n");
      out.write("                            <a href=\"loginUser.jsp\"><img src=\"img/CINEC-Logo.png\"></a>\n");
      out.write("                            CINEC\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
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
