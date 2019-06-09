package org.apache.jsp.sl2industry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \r\n");
      out.write("    <title>SL2INDUSTRY | 404</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font awesome -->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">   \r\n");
      out.write("    <!-- Slick slider -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">          \r\n");
      out.write("    <!-- Fancybox slider -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery.fancybox.css\" type=\"text/css\" media=\"screen\" /> \r\n");
      out.write("    <!-- Theme color -->\r\n");
      out.write("    <link id=\"switcher\" href=\"assets/css/theme-color/default-theme.css\" rel=\"stylesheet\">  \r\n");
      out.write("\r\n");
      out.write("    <!-- Main style sheet -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">    \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,400italic,300,300italic,500,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <script>\r\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.3.1.js\"\r\n");
      out.write("            integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\r\n");
      out.write("            crossorigin=\"anonymous\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $(\"#header\").load(\"header.jsp\");\r\n");
      out.write("            $(\"#footer\").load(\"footer.jsp\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("  <!-- include Header -->\r\n");
      out.write("  <div id=\"header\"></div>\r\n");
      out.write("  <!-- end include header -->\r\n");
      out.write("\r\n");
      out.write(" <!-- Page breadcrumb -->\r\n");
      out.write(" <section id=\"mu-page-breadcrumb\">\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <div class=\"col-md-12\">\r\n");
      out.write("         <div class=\"mu-page-breadcrumb-area\">\r\n");
      out.write("           <h2>404</h2>\r\n");
      out.write("           <ol class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"#\">Home</a></li>            \r\n");
      out.write("            <li class=\"active\">404</li>\r\n");
      out.write("          </ol>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </section>\r\n");
      out.write(" <!-- End breadcrumb -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Start error section  -->\r\n");
      out.write("  <section id=\"mu-error\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("       <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"mu-error-area\">\r\n");
      out.write("            <p>Oops! The page you requested was not found!</p>\r\n");
      out.write("            <span>The page you are looking for is not available or has been removed or changed.</span>\r\n");
      out.write("            <h2>404</h2>\r\n");
      out.write("            <a class=\"mu-post-btn\" href=\"index.jsp\">GO TO HOME</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write(" <!-- End error section  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Start footer -->\r\n");
      out.write("  <div id=\"footer\"></div>\r\n");
      out.write("  <!-- End footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!-- jQuery library -->\r\n");
      out.write("  <script src=\"assets/js/jquery.min.js\"></script>  \r\n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("  <script src=\"assets/js/bootstrap.js\"></script>   \r\n");
      out.write("  <!-- Slick slider -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/slick.js\"></script>\r\n");
      out.write("  <!-- Counter -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/waypoints.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.counterup.js\"></script>  \r\n");
      out.write("  <!-- Mixit slider -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.mixitup.js\"></script>\r\n");
      out.write("  <!-- Add fancyBox -->        \r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.fancybox.pack.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom js -->\r\n");
      out.write("  <script src=\"assets/js/custom.js\"></script> \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
