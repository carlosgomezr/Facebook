package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String usuarioLog=""; String usuarioPerfil="";
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
      out.write("    </head>");
      out.write("\n");
      out.write("    <body background=\"BACK FB.png\">\n");
      out.write("    <center>\n");
      out.write("    <font color=\"white\" face=\"arial\">\n");
      out.write("             <img src=\"BANNER FB.png\"/>    \n");
      out.write("             <center>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("Result = "+result);
        usuarioLog = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("             \n");
      out.write("                 <table border=\"0\">\n");
      out.write("                     <tbody>\n");
      out.write("                         \n");
      out.write("                         <tr>\n");
      out.write("                             <form name=\"pasarbuscar\" action=\"redir.jsp\" method=\"POST\">\n");
      out.write("                             <td> <input type=\"text\" name=\"usuarioPerfil\" value=\"¿ Buscar Amigos ?\" size=\"40\" /> </td>\n");
      out.write("                             <td> \n");
      out.write("                                     <input type=\"submit\" value=\"Buscar\" name=\"boton0\" /> \n");
      out.write("                                  </form> \n");
      out.write("                             </td>\n");
      out.write("                             <td><form name=\"pasarlogin\" action=\"index.jsp\" method=\"POST\">\n");
      out.write("                                     <input type=\"submit\" value=\"Log out\" name=\"boton\" />\n");
      out.write("                                 </form>\n");
      out.write("                             </td>\n");
      out.write("                             <td><form name=\"pasareliminar\" action=\"eliminar.jsp\" method=\"POST\">\n");
      out.write("                                     <input type=\"submit\" value=\"Eliminar Cuentat\" name=\"eliminar\" />\n");
      out.write("                                 </form>\n");
      out.write("                             </td>\n");
      out.write("                         </tr>\n");
      out.write("                         \n");
      out.write("                         <tr>\n");
      out.write("                             <td></td>\n");
      out.write("                             <td></td>\n");
      out.write("                         </tr>\n");
      out.write("                         \n");
      out.write("                     </tbody>\n");
      out.write("                 </table>\n");
      out.write("    \n");
      out.write("<DIV ALIGN=left>  \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarPhoto(x);
	out.println("Result = "+result);
        out.println("O.O");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("  ---------¿Que es lo que me pasa?---------> \n");
      out.write("</DIV>             \n");
      out.write("                 <br></br>\n");
      out.write("             </center>\n");
      out.write("             \n");
      out.write("             <DIV ALIGN=right>     \n");
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
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	java.lang.String correo = usuarioLog;
	java.lang.String titulo = request.getParameter("titulo");
	java.lang.String publicador = usuarioLog;
	java.lang.String texto = request.getParameter("texto1");
	java.lang.String imagen = "";
	// TODO process result here
	java.lang.String result = port.agregarPublicacion(x, correo, titulo, publicador, texto, imagen);
	out.println("Result = "+result+"  "+usuarioLog);
        out.println("Public :v ");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("                                \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = usuarioLog;
	java.lang.String contenido = "Publicó "+request.getParameter("texto1");
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("                                \n");
      out.write("                                    <input type=\"submit\" value=\"Publicar\" name=\"boton1\" /> \n");
      out.write("                                </DIV>\n");
      out.write("                             </form>\n");
      out.write("                         </td>\n");
      out.write("                         <td>\n");
      out.write("                            <form name=\"pasarcambiar\" action=\"cambiar.jsp\" method=\"POST\">\n");
      out.write("                                <DIV ALIGN=left>                             \n");
      out.write("                                    <input type=\"submit\" value=\"Chage Photo\" name=\"boton2\" />\n");
      out.write("                                </DIV>\n");
      out.write("                            </form> \n");
      out.write("                         </td>\n");
      out.write("                         <td>\n");
      out.write("                            <form name=\"pasaramigos\" action=\"amigos.jsp\" method=\"POST\">\n");
      out.write("                                <DIV ALIGN=right> \n");
      out.write("                                    <input type=\"submit\" value=\"Amigos\" name=\"boton3\" />\n");
      out.write("                                </DIV>\n");
      out.write("                            </form>   \n");
      out.write("                         </td>\n");
      out.write("                         <td>\n");
      out.write("                             <form name=\"pasarevento\" action=\"evento.jsp\" method=\"POST\">\n");
      out.write("                                 <input type=\"submit\" value=\"Eventos \" name=\"boton4\" />\n");
      out.write("                             </form>\n");
      out.write("                         </td>\n");
      out.write("                         <td>\n");
      out.write("                             <form name=\"pasarmodificar\" action=\"modificar.jsp\" method=\"POST\">\n");
      out.write("                                 <input type=\"submit\" value=\"Modificar \" name=\"boton5\" />\n");
      out.write("                             </form>\n");
      out.write("                         </td>\n");
      out.write("                         <td>\n");
      out.write("                            <form action=\"subirImagen.jsp\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                <input type=\"file\" name=\"Image\"/>\n");
      out.write("                                <input type=\"submit\" value=\"Publicar Foto\"/>\n");
      out.write("                            </form>\n");
      out.write("                         </td>\n");
      out.write("                     </tr>\n");
      out.write("                 </tbody>\n");
      out.write("             </table>\n");
      out.write("             </div>       \n");
      out.write("           \n");
      out.write("            \n");
      out.write("             \n");
      out.write("             <DIV ALIGN=left>\n");
      out.write("             <FONT FACE=\"verdana\" SIZE=2>    \n");
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
      out.write("                                        \n");
      out.write("                         <td>\n");
      out.write("                        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.darDatosPerfil(x);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("         \n");
      out.write("                             \n");
      out.write("                             ---------------------------------------------------</td>\n");
      out.write("                     </tr>\n");
      out.write("                 </tbody>\n");
      out.write("             </table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("             </FONT>\n");
      out.write("             </DIV>  \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarPublicacion(x);
	out.println("Result Public = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarMiPublicacion(x);
	out.println("Result Mi publicacion = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    </font>\n");
      out.write("    </center>\n");
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
