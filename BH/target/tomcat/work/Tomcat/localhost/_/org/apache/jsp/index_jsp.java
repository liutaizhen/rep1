/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
<<<<<<< HEAD
 * Generated at: 2015-05-09 03:09:01 UTC
=======
 * Generated at: 2015-05-07 09:44:01 UTC
>>>>>>> bc766493e1cb710750e8ba53bb3499d4f13041e3
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
<<<<<<< HEAD
      response.setContentType("text/html;charset=UTF-8");
=======
      response.setContentType("text/html");
>>>>>>> bc766493e1cb710750e8ba53bb3499d4f13041e3
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
<<<<<<< HEAD
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>作业5</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #h1{\r\n");
      out.write("            color: red;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }s\r\n");
      out.write("         #p{\r\n");
      out.write("             border-color: blue;\r\n");
      out.write("             color: green;\r\n");
      out.write("             font: 18px;\r\n");
      out.write("             text-indent: 24px;\r\n");
      out.write("             text-align: center;\r\n");
      out.write("\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("        .abc{\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            position: relative; left: 40px; top: 10px;\r\n");
      out.write("            width: 600px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1 id=\"h1\">我的网上家园</h1>\r\n");
      out.write("<div class=\"abc\">\r\n");
      out.write("    <p id=\"p\">\r\n");
      out.write("        欢迎你来到这里 欢迎你到网上家园做客， 欢迎你来到这里 欢迎你到网上家园做客， 欢迎你来到这里 欢迎你到网上家园做客， 欢迎你来到这里 欢迎你到网上家园做客。\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
=======
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>hhh</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("æ¬¢è¿ããããã\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
>>>>>>> bc766493e1cb710750e8ba53bb3499d4f13041e3
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
