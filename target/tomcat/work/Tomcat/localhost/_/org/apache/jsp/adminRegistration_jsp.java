/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-27 13:08:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=<device-width>, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    /* form {\r\n");
      out.write("        border: 3px solid #f1f1f1;\r\n");
      out.write("    } */\r\n");
      out.write("\r\n");
      out.write("    /* Full-width inputs */\r\n");
      out.write("\r\n");
      out.write("    input[type=text],\r\n");
      out.write("    input[type=password],\r\n");
      out.write("    input[type=email] {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 12px 20px;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Set a style for all buttons */\r\n");
      out.write("\r\n");
      out.write("    button {\r\n");
      out.write("        background-color: #4CAF50;\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding: 14px 20px;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        border: none;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Add a hover effect for buttons */\r\n");
      out.write("\r\n");
      out.write("    button:hover {\r\n");
      out.write("        opacity: 0.8;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Extra style for the cancel button (red) */\r\n");
      out.write("   \r\n");
      out.write("   body{\r\n");
      out.write("       background-image: url(\"http://argun.in/wp-content/uploads/2016/05/tomato-tango.jpg\");\r\n");
      out.write("   }\r\n");
      out.write("    .cancelbtn {\r\n");
      out.write("        width: auto;\r\n");
      out.write("        padding: 10px 18px;\r\n");
      out.write("        background-color: #f44336;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Center the avatar image inside this container */\r\n");
      out.write("\r\n");
      out.write("    .imgcontainer {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin: 24px 0 12px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Avatar image */\r\n");
      out.write("\r\n");
      out.write("    img.avatar {\r\n");
      out.write("        width: 40%;\r\n");
      out.write("        border-radius: 50%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Add padding to containers */\r\n");
      out.write("\r\n");
      out.write("    /* .container {\r\n");
      out.write("        padding: 16px;\r\n");
      out.write("    } */\r\n");
      out.write("\r\n");
      out.write("    /* The \"Forgot password\" text */\r\n");
      out.write("\r\n");
      out.write("    span.psw {\r\n");
      out.write("        float: right;\r\n");
      out.write("        padding-top: 16px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("\r\n");
      out.write("    @media screen and (max-width: 300px) {\r\n");
      out.write("        span.psw {\r\n");
      out.write("            display: block;\r\n");
      out.write("            float: none;\r\n");
      out.write("        }\r\n");
      out.write("        .cancelbtn {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("             <br>\r\n");
      out.write("             <br>\r\n");
      out.write("             <br>\r\n");
      out.write("             <br>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <h1 style=\"text-align: center;color: white\">!!RegistrationForm!!</h1>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <form method=\"POST\" action='/CrudOperations?action=registerAdmin' name=\"frmAddUser\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <label for=\"Email\">\r\n");
      out.write("                <b style=\"color: white\">Name</b>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"name\" name=\"nameAdmin\" required>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <label for=\"psw\">\r\n");
      out.write("                <b style=\"color: white\">password</b>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"passwordAdmin\" required>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\">Register</button>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
