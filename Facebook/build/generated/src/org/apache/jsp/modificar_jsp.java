package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Modificar datos</title>\n");
      out.write("    </head>\n");
      out.write("   <body background=\"BACK FB.png\">\n");
      out.write("        <img src=\"BANNER FB.png\"/>    \n");
      out.write("    <font color=\"white\" face=\"arial\">\n");
      out.write("        <h1>Modificar datos :$</h1>\n");
      out.write("        Edita tus datos... :$\n");
      out.write("    </font>\n");
      out.write("    <br></br>\n");
      out.write("    <DIV ALIGN=right>\n");
      out.write("        <form name=\"pasarperfil\" action=\"Perfil.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Mi Perfil O.O\" name=\"boton1\" />\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <table border=\"0\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>Edad: </td>\n");
      out.write("                <td><input type=\"text\" name=\"texto1\" value=\"\" size=\"15\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Genero: </td>\n");
      out.write("                <td><input type=\"text\" name=\"texto2\" value=\"\" size=\"15\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Pais: </td>\n");
      out.write("                <td><input type=\"text\" name=\"texto3\" value=\"\" size=\"15\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Estado civil: </td>\n");
      out.write("                <td><input type=\"text\" name=\"texto4\" value=\"\" size=\"15\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><form name=\"pasarmodificar\" action=\"modificar.jsp\" method=\"POST\">\n");
      out.write("                        <input type=\"submit\" value=\"Modificar :$\" name=\"boton2\" />\n");
      out.write("                    </form></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
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
