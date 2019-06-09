package org.apache.jsp.sl2industry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>SL2INDUSTRY | Contact</title>\r\n");
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
      out.write("    <link id=\"switcher\" href=\"assets/css/theme-color/default-theme.css\" rel=\"stylesheet\">    \r\n");
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
      out.write("           <h2>Contact</h2>\r\n");
      out.write("           <ol class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"#\">Home</a></li>            \r\n");
      out.write("            <li class=\"active\">Contact</li>\r\n");
      out.write("          </ol>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </section>\r\n");
      out.write(" <!-- End breadcrumb -->\r\n");
      out.write("\r\n");
      out.write(" <!-- Start contact  -->\r\n");
      out.write(" <section id=\"mu-contact\">\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <div class=\"col-md-12\">\r\n");
      out.write("         <div class=\"mu-contact-area\">\r\n");
      out.write("          <!-- start title -->\r\n");
      out.write("          <div class=\"mu-title\">\r\n");
      out.write("            <h2>Get in Touch</h2>\r\n");
      out.write("            <p></p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- end title -->\r\n");
      out.write("          <!-- start contact content -->\r\n");
      out.write("          <div class=\"mu-contact-content\">           \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"mu-contact-left\">\r\n");
      out.write("                  <form class=\"contactform\">                  \r\n");
      out.write("                    <p class=\"comment-form-author\">\r\n");
      out.write("                      <label for=\"author\">Name <span class=\"required\">*</span></label>\r\n");
      out.write("                      <input type=\"text\" required=\"required\" size=\"30\" value=\"\" name=\"author\">\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"comment-form-email\">\r\n");
      out.write("                      <label for=\"email\">Email <span class=\"required\">*</span></label>\r\n");
      out.write("                      <input type=\"email\" required=\"required\" aria-required=\"true\" value=\"\" name=\"email\">\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"comment-form-url\">\r\n");
      out.write("                      <label for=\"subject\">Subject</label>\r\n");
      out.write("                      <input type=\"text\" name=\"subject\">  \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"comment-form-comment\">\r\n");
      out.write("                      <label for=\"comment\">Message</label>\r\n");
      out.write("                      <textarea required=\"required\" aria-required=\"true\" rows=\"8\" cols=\"45\" name=\"comment\"></textarea>\r\n");
      out.write("                    </p>                \r\n");
      out.write("                    <p class=\"form-submit\">\r\n");
      out.write("                      <input type=\"submit\" value=\"Send Message\" class=\"mu-post-btn\" name=\"submit\">\r\n");
      out.write("                    </p>        \r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6\">\r\n");
      out.write("                  <div class=\"mu-contact-right\" style=\"width: 100%\">\r\n");
      out.write("                      <iframe width=\"100%\" height=\"600\" src=\"https://maps.google.com/maps?width=100%&amp;height=600&amp;hl=en&amp;coord=6.821536,80.0412575&amp;q=309%20Dampe%20-%20Pitipana%20Rd%2C%20Homagama+(SL2INDUSTRY)&amp;ie=UTF8&amp;t=&amp;z=14&amp;iwloc=B&amp;output=embed\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\"><a href=\"https://www.maps.ie/map-my-route/\">Plot a route map</a></iframe>\r\n");
      out.write("                  </div><br />\r\n");
      out.write("                <!--<div class=\"mu-contact-right\">\r\n");
      out.write("                  <iframe src=\"https://www.google.com/maps/embed?pb=!1m23!1m12!1m3!1d6249.345033302234!2d-80.02791918555701!3d40.45935344513505!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m8!3e6!4m0!4m5!1s0x8834f411a7b748bd%3A0xaec8197db3de9a9e!2sCalifornia-Kirkbride%2C+Pittsburgh%2C+PA%2C+USA!3m2!1d40.4600435!2d-80.0213538!5e0!3m2!1sen!2sbd!4v1464270878470\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\r\n");
      out.write("                </div>-->\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- end contact content -->\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </section>\r\n");
      out.write(" <!-- End contact  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Start footer -->\r\n");
      out.write("  <div id=\"footer\"></div>\r\n");
      out.write("  <!-- End footer -->\r\n");
      out.write("\r\n");
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
