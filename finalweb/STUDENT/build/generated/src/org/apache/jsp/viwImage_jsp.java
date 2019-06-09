package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class viwImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String id = request.getParameter("userid");
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "university";
    String userid = "root";
    String password = "";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            //String uid = request.getParameter("id");
            //String firstName = request.getParameter("fname");
            //String lastName = request.getParameter("lname");
//        
//        conn = connectionPool.getConnectionFromPool();
//            String sql = SQL_SELECT_ALL_FORM_ITEM; query
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, categName);
//            ps.setString(2, "%" + itemName + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                ItemDTO itemDTO = new ItemDTO();
//                itemDTO.setItemId(rs.getInt("item_id"));
//                itemDTO.setItemName(rs.getString("item_name"));
//                itemDTO.setItemCateg(rs.getString("item_categ"));
//                itemDTO.setQty(rs.getInt("qty"));
//                itemDTO.setPrice(rs.getBigDecimal("price"));
//                itemDTO.setUploadPath(rs.getString("path"));
//                sList.add(itemDTO);
//      
            try {
                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                String sql = ("select Image from stuevent");
                PreparedStatement st = connection.prepareStatement(sql);
                //st.setString(1, uid);
                rs = st.executeQuery();

                while (rs.next()) {
                    
                   Blob blob = rs.getBlob("Image");
                    byte byteArray[] = blob.getBytes(1, (int) blob.length());
                    response.setContentType("Image");
                    OutputStream os = response.getOutputStream();
                    os.write(byteArray);
                    os.flush();
                    os.close();

                }
            } catch (Exception ex) {
                out.println(ex);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("     \n");
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
