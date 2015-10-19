<%-- 
    Document   : amigos
    Created on : 28/09/2015, 10:18:59 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis amigos</title>
    </head><%! String usuarioLog=""; String usuarioPerfil="";%>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>    
    <font color="white" face="arial">
        <h1>AMIGOS</h1>
        Tu lista de amigos, conocidos y mas...
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
    <br></br>    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarAmigos(x);
	out.println("<h2>Amigos</h2> "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
    <br></br>
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
    </div>
    </font>
    
    </body>
</html>
