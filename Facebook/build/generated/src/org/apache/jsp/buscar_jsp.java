package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buscar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>My Facebook</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"BACK FB.png\">\n");
      out.write("        <img src=\"BANNER FB.png\"/>    \n");
      out.write("    <font color=\"white\" FACE=\"verdana\" SIZE=2>\n");
      out.write("        <h1></h1>  \n");
      out.write("    <br></br>\n");
      out.write("    <DIV ALIGN=right>\n");
      out.write("        <form name=\"pasarperfil\" action=\"Perfil.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Mi Perfil\" name=\"boton1\" />\n");
      out.write("        </form>\n");
      out.write("        <form name=\"pasarbuscar\" action=\"buscar.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Agregar +\" name=\"agregar\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div align=\"center\"> \n");
      out.write("        <DIV ALIGN=left>  \n");
      out.write("    <img src=\"photos/mujer.png\" width=\"80\" height=\"80\"/> ---------¿Que es lo que me pasa?---------> \n");
      out.write("</DIV> \n");
      out.write("             <table border=\"0\">\n");
      out.write("                 <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>\n");
      out.write("                             <form name=\"pasarperfil\" action=\"Perfil.jsp\" method=\"POST\">  \n");
      out.write("                             Titulo\n");
      out.write("                                <input type=\"text\" name=\"titulo\" value=\"Escribe tu titulo aqui\" size=\"30\" />\n");
      out.write("                                <DIV ALIGN=right>  \n");
      out.write("                                    <textarea name=\"texto1\" rows=\"5\" cols=\"50\">\n");
      out.write("                                    Publica Aqui :D\n");
      out.write("                                    </textarea>\n");
      out.write("                                </DIV>\n");
      out.write("                                <DIV ALIGN=left>  \n");
      out.write("                                    <input type=\"submit\" value=\"Publicar\" name=\"boton1\" /> \n");
      out.write("                                </DIV>\n");
      out.write("                             </form>\n");
      out.write("                         </td>\n");
      out.write("                    </tbody>\n");
      out.write("             </table>\n");
      out.write("    </div>    \n");
      out.write("             <table border=\"0\">\n");
      out.write("                 <thead>\n");
      out.write("                     <tr>\n");
      out.write("                         <th></th>\n");
      out.write("                     </tr>\n");
      out.write("                 </thead>\n");
      out.write("                 <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>----------------------My Info----------------------</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td> Nombre: Carlos Estuardo</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td> Genero: Masculino</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td> Edad: 19</td>\n");
      out.write("                     </tr> \n");
      out.write("                     <tr>\n");
      out.write("                         <td> Pais: Guatemala</td>\n");
      out.write("                     </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <td> Estado Civil: ¬w¬</td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>---------------------------------------------------</td>\n");
      out.write("                     </tr>\n");
      out.write("                 </tbody>\n");
      out.write("             </table>\n");
      out.write("             </FONT>\n");
      out.write("             </DIV>  \n");
      out.write(" \n");
      out.write("    </font>\n");
      out.write("   \n");
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
