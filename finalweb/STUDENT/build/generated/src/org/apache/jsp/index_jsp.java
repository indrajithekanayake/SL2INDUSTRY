package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Colabarion</title>\n");
      out.write("        <link href=\"css/web.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <header style=\"background-image: url('img/a.jpg');\">\n");
      out.write("            <div class=\"header-content\">\n");
      out.write("                <div class=\"header-content-inner\">\n");
      out.write("                    <h1 id=\"homeHeading\">Sri Lanka University Industry Collaboration</h1>\n");
      out.write("                    <!--<h2 id=\"homeHeading\">We Create Your Dreams</h2>-->\n");
      out.write("                    <hr class=\"light\">\n");
      out.write("                    <p></p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <section class=\"features\">\n");
      out.write("\n");
      out.write("            <h3 class=\"text-center\">Follow Us</h3>\n");
      out.write("            <hr class=\"primary\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center\">\n");
      out.write("\n");
      out.write("                           <a href=\"https://www.facebook.com/\"><img src=\"img/face.png\" ></a>\n");
      out.write("                            Facebook \n");
      out.write("                        </p>\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center\">\n");
      out.write("\n");
      out.write("                            <a href=\"https://www.instagram.com\"><img src=\"img/inst.png\"></a>\n");
      out.write("                             Instagram\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center\">\n");
      out.write("\n");
      out.write("                            <a href=\"https://www.youtube.com/\"><img src=\"img/ytd.png\"></a>\n");
      out.write("                        Youtube\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center\">\n");
      out.write("\n");
      out.write("                            <a href=\"https://twitter.com/\"><img src=\"img/tw.png\"></a>\n");
      out.write("                             Twitter\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center\">\n");
      out.write("\n");
      out.write("                            <a href=\"https://www.skype.com/en/\"><img src=\"img/sky.png\"></a>\n");
      out.write("                            Skype\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                        <p class=\"arranging\" style=\"text-align: center\">\n");
      out.write("\n");
      out.write("                            <a href=\"https://telegram.org/\"><img src=\"img/tel.png\"></a>\n");
      out.write("                            Telegram\n");
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
      out.write("        <section class=\"no-padding\" id=\"portfolio\"></section>\n");
      out.write("\n");
      out.write("        <section id=\"contact\" class=\"bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                        <h2 class=\"section-heading\">Let's Get In Touch!</h2>\n");
      out.write("                        <hr class=\"primary\">\n");
      out.write("                        <p>Any issues? <br>It's Ok! Give us a call or send us an email and we will get back to you as soon as possible!</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-lg-offset-2 text-center\">\n");
      out.write("                        <i class=\"fa fa-phone fa-3x sr-contact\"></i>\n");
      out.write("                        <p>(+94) 77-588-1599</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 text-center\">\n");
      out.write("                        <i class=\"fa fa-envelope-o fa-3x sr-contact\"></i>\n");
      out.write("                        <p>student@gmail.com</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
