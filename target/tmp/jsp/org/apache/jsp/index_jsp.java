package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html lang=\"pl\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title></title>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("    <h1 align=\"center\">Bankowy kaulkulator kredytowy</h1>\n");
      out.write("    <form action=\"credit\" method=\"post\" align=\"center\" >\n");
      out.write("        <label> Wnioskowana kwota kredytu: <br /> <input  type=\"text\" id= \"amount\" name=\"amount\"/> </label><br />\n");
      out.write("        <label> Ilosc lat: <br /> <input type=\"text\" id=\"years\" name=\"years\"/></label>   <br />\n");
      out.write("        <label> Oprocentowanie:<br /> <input type=\"text\" id=\"percentage\" name=\"percentage\"/> </label> <br />\n");
      out.write("        <label> Prowizja: <br />  <input type=\"text\" id=\"commision\" name=\"commision\"/> </label>  <br />\n");
      out.write("        <label> Rodzaj rat :<br /> <select name=\"type\"> \n");
      out.write("    <option selected=\"selected\">Stale</option>\n");
      out.write("    <option>Malejace</option>\n");
      out.write("       \n");
      out.write("</select>\n");
      out.write("         <br /> <br /></label>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Wyslij\" />\n");
      out.write("    </form>\n");
      out.write(" \n");
      out.write("</body>\n");
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
