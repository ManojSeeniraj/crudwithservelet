/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-27 13:07:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<title>W3.CSS Template</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: \"Times New Roman\", Georgia, Serif;background-image:url(\"https://previews.123rf.com/images/romastudio/romastudio1603/romastudio160300280/54088843-healthy-food-background-studio-photo-of-different-fruits-on-white-wooden-table-high-resolution-produ.jpg\");}\r\n");
      out.write("h1,h2,h3,h4,h5,h6 {\r\n");
      out.write("    font-family: \"Playfair Display\";\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Navbar (sit on top) -->\r\n");
      out.write("<div class=\"w3-top\">\r\n");
      out.write("  <div class=\"w3-bar w3-white w3-padding w3-card\" style=\"letter-spacing:4px;\">\r\n");
      out.write("    <a href=\"#home\" class=\"w3-bar-item w3-button\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("    <!-- Right-sided navbar links. Hide them on small screens -->\r\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\r\n");
      out.write("      <a href=\"#about\" class=\"w3-bar-item w3-button\">About</a>\r\n");
      out.write("      <a href=\"#menu\" class=\"w3-bar-item w3-button\">Inbox</a>\r\n");
      out.write("      <a href=\"contacts.jsp\" class=\"w3-bar-item w3-button\">Contact</a>\r\n");
      out.write("      <a href='/UserDetailController?action=listuser' class=\"w3-bar-item w3-button\">My Details</a>\r\n");
      out.write("      <a href='UserProfile.jsp' class=\"w3-bar-item w3-button\">User Profile</a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Header -->\r\n");
      out.write("<!-- <header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1600px;min-width:500px\" id=\"home\">\r\n");
      out.write("  <img class=\"w3-image\" src=\"https://png.pngtree.com/thumb_back/fw800/back_pic/00/03/78/93561fba1a37108.jpg\" style=\"filter: invert();\" alt=\"Hamburger Catering\" width=\"1600\" height=\"500\">\r\n");
      out.write("  <div class=\"w3-display-bottomleft w3-padding-large w3-opacity\">\r\n");
      out.write("    <h1 class=\"w3-xxlarge\" style=\"color: white\">Le Catering</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("</header> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Page content -->\r\n");
      out.write("<div class=\"w3-content\" style=\"max-width:1100px\">\r\n");
      out.write("\r\n");
      out.write("  <!-- About Section -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <hr>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Menu Section -->\r\n");
      out.write("  <div class=\"w3-row w3-padding-64\" id=\"menu\">\r\n");
      out.write("    <div class=\"w3-col l6 w3-padding-large\">\r\n");
      out.write("      <div class=\"w3-container w3-padding-64\" id=\"contact\">\r\n");
      out.write("        <h1>Inbox Us</h1><br>\r\n");
      out.write("        <p>We Are Waiting To see Your Reviews.</p>\r\n");
      out.write("        <form method=\"POST\" action='/UserDetailController?action=inboxmail' name=\"frmAddUser\">\r\n");
      out.write("          \r\n");
      out.write("          <p><input class=\"w3-input w3-padding-16\" type=\"email\" placeholder=\"Email\" required name=\"emailidhome\"></p>\r\n");
      out.write("          <p><input class=\"w3-input w3-padding-16\" type=\"date\" placeholder=\"date\" required name=\"datehome\"></p>\r\n");
      out.write("          <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"form\" required name=\"fromhome\"></p>\r\n");
      out.write("          <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"to\" required name=\"tohome\"></p>\r\n");
      out.write("          <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Subject\" required name=\"subjecthome\"></p>\r\n");
      out.write("          <p><input class=\"w3-input w3-padding-16\" type=\"message\" placeholder=\"Message\" required name=\"messagehome\"></p>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          <p><button class=\"w3-button w3-light-grey w3-section\" type=\"submit\">SEND MESSAGE</button></p>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <hr>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<!-- End page content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
