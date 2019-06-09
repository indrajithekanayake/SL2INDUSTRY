package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bootstrap.html", out, false);
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/dropdown.css\">\n");
      out.write("        <link href=\"css/navbar.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"sl2industry/index.jsp\"> \n");
      out.write("\n");
      out.write("                        <img src=\"img/logo1.png\" style=\"height:43px; width: 43px;\">\n");
      out.write("                        \n");
      out.write("<!--                        <i class=\"fa fa-university\"></i>-->\n");
      out.write("                        <!--<p style=\"padding-right:80px;padding-bottom:100px;\">SUIC</p>-->\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span> \n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        ");
 try {
                                String UN = request.getSession().getAttribute("setus").toString();
                                if (UN.equals("1")) {
                        
      out.write("\n");
      out.write("                        <li><a href=\"Unistudent.jsp\" style=\"background-color: #269abc \"><span class=\"glyphicon glyphicon-user\"></span>&nbsp");
out.print(request.getSession().getAttribute("uname"));
      out.write("</a></li>\n");
      out.write("                        <li><a href=\"categorySignup.jsp\" style=\"background-color: #449d44 \"><span class=\"glyphicon glyphicon-edit\"></span>&nbspNew Sign-up &nbsp</a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\" style=\"background-color: #F05F40 \"><span class=\"glyphicon glyphicon-off\"></span>&nbspLogOut</a></li>\n");
      out.write("\n");
      out.write("                        ");
 } else if (UN.equals("0")) { 
      out.write("\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"categoryLogin.jsp\" style=\"background-color: #00a3cc \"><span class=\"glyphicon glyphicon-user\"></span>&nbspLogin</a></li>\n");
      out.write("                        <li><a href=\"categorySignup.jsp\" style=\"background-color: #0066cc \"><span class=\"glyphicon glyphicon-edit\"></span>&nbspSign-up</a></li>\n");
      out.write("                        \n");
      out.write("                        ");
 } else if (UN.equals("2")){ 
      out.write("\n");
      out.write("                        <li><a href=\"industrylogin.jsp\" style=\"background-color: #269abc \"><span class=\"glyphicon glyphicon-user\"></span>&nbsp");
out.print(request.getSession().getAttribute("uname"));
      out.write("</a></li>\n");
      out.write("                        <li><a href=\"categorySignup.jsp\" style=\"background-color: #449d44 \"><span class=\"glyphicon glyphicon-edit\"></span>&nbspNew Sign-up &nbsp</a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\" style=\"background-color: #F05F40 \"><span class=\"glyphicon glyphicon-off\"></span>&nbspLogOut</a></li>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                            ");
 }
                                catch (Exception e) { 
      out.write("\n");
      out.write("                        <li><a href=\"categoryLogin.jsp\" style=\"background-color: #00a3cc \"><span class=\"glyphicon glyphicon-user\"></span>&nbspLogin</a></li>\n");
      out.write("                        <li><a href=\"categorySignup.jsp\" style=\"background-color: #0066cc \"><span class=\"glyphicon glyphicon-edit\"></span>&nbspSign-up</a></li>\n");
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(\".navbar-toggle\").click(function (event) {\n");
      out.write("                $(\".navbar-collapse\").toggle('in');\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</body>\n");
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
