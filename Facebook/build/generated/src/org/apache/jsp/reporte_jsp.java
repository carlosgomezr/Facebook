package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reporte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>REPORTES</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"BACK FB.png\">\n");
      out.write("        <img src=\"BANNER FB.png\"/>    \n");
      out.write("    <font color=\"white\" face=\"arial\">\n");
      out.write("        <h1>REPORTES</h1>\n");
      out.write("        Diagramas de las Estructuras de Datos del Sistema\n");
      out.write("    </font>\n");
      out.write("    <br></br>\n");
      out.write("    <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"                   ARBOL B               \" name=\"boton0\" />\n");
      out.write("    </form>\n");
      out.write("    <br></br>\n");
      out.write("    <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"            AVL DE AMIGOS           \" name=\"boton1\" />\n");
      out.write("        <input type=\"text\" name=\"texto1\" value=\"\" size=\"15\" />\n");
      out.write("    </form>\n");
      out.write("    <br></br>\n");
      out.write("    <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"      EVENTOS POR PERSONA     \" name=\"boton2\" />\n");
      out.write("        <input type=\"text\" name=\"texto2\" value=\"\" size=\"15\" />\n");
      out.write("    </form>\n");
      out.write("    <br></br>\n");
      out.write("    <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"PUBLICACIONES POR PERSONA\" name=\"boton3\" />\n");
      out.write("        <input type=\"text\" name=\"texto3\" value=\"\" size=\"15\" />\n");
      out.write("    </form>\n");
      out.write("    <br></br>\n");
      out.write("    <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"                HISTORIAL              \" name=\"boton4\" />\n");
      out.write("        <input type=\"text\" name=\"texto4\" value=\"\" size=\"15\" />\n");
      out.write("    </form>\n");
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
