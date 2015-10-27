<%-- 
    Document   : evento
    Created on : 1/10/2015, 10:59:04 AM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos (~owo)~</title>
    </head><%! String usuarioLog=""; String usuarioPerfil="";%>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>  
    <font color="white" face="arial">
        <h1>Eventos</h1>
        Crea, revisa y planifica tus eventos .... 
   
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
    </div>
    <DIV ALIGN=right>
        <h2> Mis Eventos </h2>

    <br></br>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("USUARIO "+result);
        usuarioLog = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <br></br>    
        
    <br></br>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarEvento(x);
	out.println("----"+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %><br></br>

    <br></br><%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarMiEvento(x);
	out.println("Eventos creados por mi :D "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <br></br>
        <h2> Crea tus eventos :D </h2>
        <form name="pasarevento" action="evento.jsp" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td></td>
                    <td>Nombre: </td>
                    <td><input type="text" name="texto1" value="" size="25" /></td>
                    <td  rowspan="4"> <img src="EVENTOS FB.png"> </td>
                </tr>
                <tr>
                    <td></td>
                    <td>Fecha: </td>
                    <td><input type="text" name="texto2" value="" size="25" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td>Direccion: </td>
                    <td><input type="text" name="texto3" value="" size="25" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td>Amigos? :D</td>
                    <td>
                        <input type="text" name="texto4" value="" size="25" /></td>
                    <td>
                    </td>
                    
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
  <br></br>  <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	java.lang.String correo = usuarioLog;
	java.lang.String evento = request.getParameter("texto1");
	java.lang.String fecha = request.getParameter("texto2");
	java.lang.String direccion = request.getParameter("texto3");
	// TODO process result here
	java.lang.String result = port.agregarEvento(x, correo, evento, fecha, direccion);
//	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
  <br></br>
      <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	java.lang.String correo = request.getParameter("texto4");
	java.lang.String evento = request.getParameter("texto1");
	java.lang.String fecha = request.getParameter("texto2");
	java.lang.String direccion = request.getParameter("texto3");
	// TODO process result here
	java.lang.String result = port.agregarEventoAmigos(x, correo, evento, fecha, direccion);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                        
    
  <br></br>  <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String palabra1 = "Creo Evento ";
	java.lang.String nombre = usuarioLog;
	java.lang.String palabra2 = " invito ";
	java.lang.String contenido = " a "+request.getParameter("texto4");
	// TODO process result here
	java.lang.String result = port.agregarHistorial2(palabra1, nombre, palabra2, contenido);
//	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
                <input type="submit" value="Crear Evento" name="boton5" />
                        
                    </td>
                    
                </tr>
                
            </tbody>
        </table>
        </form>
        <br></br>
        <h2>Evento que deseo cancelar :c </h2>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="text" name="texto6" value="" size="20" />
            <input type="submit" value="Cancelar Evento" name="boton2" />
            
            
        </form>
    </div>
    </font> 
    </body>
</html>
