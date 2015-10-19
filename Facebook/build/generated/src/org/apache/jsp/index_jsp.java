package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>LOGIN</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"BACK FB.png\">\n");
      out.write("    <font color=\"white\" face=\"verdana\">\n");
      out.write("             <img src=\"BANNER FB.png\"/>\n");
      out.write("             <DIV ALIGN=right>\n");
      out.write("             <form name=\"pasarverificar\" action=\"verificar.jsp\" method=\"POST\">\n");
      out.write("                  Usuario:\n");
      out.write("                 <input type=\"text\" name=\"texto1\" value=\"\" size=\"15\" />\n");
      out.write("                  Password:\n");
      out.write("                  <input type=\"password\" name=\"texto2\" value=\"\" size=\"15\" /> \n");
      out.write("                      ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String palabra1 = "Usuario ";
	java.lang.String nombre = request.getParameter("texto1");
	java.lang.String palabra2 = " Logueo ";
	java.lang.String contenido = " a la APP ";
	// TODO process result here
	java.lang.String result = port.agregarHistorial2(palabra1, nombre, palabra2, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                  <input type=\"submit\" value=\"Log-in\" name=\"boton1\">\n");
      out.write("             </form>\n");
      out.write("                 <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("                     <input type=\"submit\" value=\"REPORTES\" name=\"botonr\" />\n");
      out.write("                 </form>\n");
      out.write("             </DIV>\n");
      out.write("             <form name=\"pasarlogin\" action=\"index.jsp\" method=\"POST\">\n");
      out.write("             <table border=\"0\">\n");
      out.write("                 <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                         <td  rowspan=\"8\"> <img src=\"CHANGE.png\" width=\"750\" height=\"400\"/> </td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td> REGISTRARSE</td>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td>Nickname: </td>\n");
      out.write("                         <td><input type=\"text\" name=\"texto3\" value=\"\" size=\"15\" /></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td>Correo: </td>\n");
      out.write("                         <td><input type=\"text\" name=\"texto4\" value=\"\" size=\"15\" /></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td>Password: </td>\n");
      out.write("                         <td><input type=\"password\" name=\"texto5\" value=\"\" size=\"15\" /></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td></td>\n");
      out.write("                         <td></td>\n");
      out.write("                         \n");
      out.write("                         <td>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String palabra1 = "Se registró ";
	java.lang.String nombre = request.getParameter("texto3");
	java.lang.String palabra2 = " con correo ";
	java.lang.String contenido = request.getParameter("texto4");
	// TODO process result here
	java.lang.String result = port.agregarHistorial2(palabra1, nombre, palabra2, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("                         \n");
      out.write("                             \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = request.getParameter("texto3");
	java.lang.String correo = request.getParameter("texto4");
	java.lang.String password = request.getParameter("texto5");
	// TODO process result here
	java.lang.String result = port.agregarUsuario(nombre, correo, password);
	out.println("Result user = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("                         \n");
      out.write("                             \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphArbolB();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("                         \n");
      out.write("                             \n");
      out.write("                                    <input type=\"submit\" value=\"Registrar xD\" name=\"boton2\" />\n");
      out.write("                         </td>\n");
      out.write("                     </tr>\n");
      out.write("                 </tbody>\n");
      out.write("             </table>\n");
      out.write("             </form>\n");
      out.write("             \n");
      out.write("    </font>\n");
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
