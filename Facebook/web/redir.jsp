<%-- 
    Document   : redir
    Created on : 18/10/2015, 01:38:27 AM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head><%! String usuarioPerfil; String men="";%>
    <%
            usuarioPerfil = request.getParameter("usuarioPerfil");
            out.println("UsuarioPerfil "+usuarioPerfil);
    %>
    <body>
        
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String usuario = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.asignarUsuario(usuario);
	out.println("Result = "+result);
        response.sendRedirect("http://localhost:8080/Facebook/buscar.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
        <h1>Hello World!</h1>
    </body>
</html>
