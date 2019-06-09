package org.apache.jsp.sl2industry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>SL2INDUSTRY</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font awesome -->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Slick slider -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">\r\n");
      out.write("    <!-- Fancybox slider -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery.fancybox.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("    <!-- Theme color -->\r\n");
      out.write("    <link id=\"switcher\" href=\"assets/css/theme-color/default-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main style sheet -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,400italic,300,300italic,500,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--START SCROLL TOP BUTTON -->\r\n");
      out.write("<a class=\"scrollToTop\" href=\"#\">\r\n");
      out.write("    <i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("</a>\r\n");
      out.write("<!-- END SCROLL TOP BUTTON -->\r\n");
      out.write("\r\n");
      out.write("<!-- Start header  -->\r\n");
      out.write("<header id=\"mu-header\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12 col-md-12\">\r\n");
      out.write("                <div class=\"mu-header-area\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\r\n");
      out.write("                            <div class=\"mu-header-top-left\">\r\n");
      out.write("                                <div class=\"mu-top-email\">\r\n");
      out.write("                                    <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                                    <span>ekanayakeindrajith@gmail.com</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mu-top-phone\">\r\n");
      out.write("                                    <i class=\"fa fa-phone\"></i>\r\n");
      out.write("                                    <span>(071) 310 1658</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">\r\n");
      out.write("                            <div class=\"mu-header-top-right\">\r\n");
      out.write("                                <nav>\r\n");
      out.write("                                    <ul class=\"mu-top-social-nav\">\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"fa fa-twitter\"></span></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"fa fa-google-plus\"></span></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"fa fa-linkedin\"></span></a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><span class=\"fa fa-youtube\"></span></a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- End header  -->\r\n");
      out.write("<!-- Start menu -->\r\n");
      out.write("<section id=\"mu-menu\">\r\n");
      out.write("    <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <!-- LOGO -->\r\n");
      out.write("                <!-- TEXT BASED LOGO -->\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa fa-university\"></i><span>SL2Industry</span></a>\r\n");
      out.write("                <!-- IMG BASED LOGO  -->\r\n");
      out.write("                <!-- <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"assets/img/logo.png\" alt=\"logo\"></a> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right main-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">About<span class=\"fa fa-angle-down\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#mu-about-us\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"course-detail.jsp\">Our Mission</a></li>\r\n");
      out.write("                            <li><a href=\"vision.jsp\">Our Vision</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">News<span class=\"fa fa-angle-down\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                      <li><a href=\"/STUDENT/ViewNew.jsp\">Job Opportunities</a></li>\r\n");
      out.write("<!--                      <li><a href=\"ViewNew.jsp\">Meetups</a></li>-->\r\n");
      out.write("                  </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("            \r\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\r\n");
      out.write("                    <li><a href=\"#\" id=\"mu-search-icon\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("                    <li><a id=\"popup\" onclick=\"div_show()\" href=\"signin.jsp\"  onmouseover=\"this.style.color='#f44242'\" onmouseout=\"this.style.color='#333333'\" >Sign in</a></li>\r\n");
      out.write("                    <li><a id=\"popup\" onclick=\"div_show()\" href=\"register.jsp\"  onmouseover=\"this.style.color='#f44242'\" onmouseout=\"this.style.color='#333333'\" >Register</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- End menu -->\r\n");
      out.write("<!-- Start search box -->\r\n");
      out.write("<div id=\"mu-search\">\r\n");
      out.write("    <div class=\"mu-search-area\">\r\n");
      out.write("        <button class=\"mu-search-close\"><span class=\"fa fa-close\"></span></button>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <form class=\"mu-search-form\">\r\n");
      out.write("                        <input type=\"search\" placeholder=\"Type Your Keyword(s) & Hit Enter\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End search box -->\r\n");
      out.write("<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("<!-- Slick slider -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/slick.js\"></script>\r\n");
      out.write("<!-- Counter -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/waypoints.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.counterup.js\"></script>\r\n");
      out.write("<!-- Mixit slider -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.mixitup.js\"></script>\r\n");
      out.write("<!-- Add fancyBox -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.fancybox.pack.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Custom js -->\r\n");
      out.write("<script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
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
