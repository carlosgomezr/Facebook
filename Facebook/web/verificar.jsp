<%-- 
    Document   : verificar
    Created on : 28/09/2015, 08:27:40 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>verificar</title>
    </head>
    <body background="BACK FB.png">
         <%! String texto1;
             String texto2;
        %>
        <%
            texto1 = request.getParameter("texto1");
            texto2 = request.getParameter("texto2");
        %>
    <center>
    <font color="white">
            <img src="BANNER FB.png"/>    
            <h1>Verificar</h1>  
             
            <br></br>
            <br></br>
            <br></br>

             <h1> ERROR LOGIN </h1> 
             Por favor verifique datos
             <h2> <%= texto1 %> </h2>
             <h2> <%= texto2 %> </h2>
    </font>
    </center>
    
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String usuario = texto1;
	// TODO process result here
	java.lang.String result = port.asignarUsuarioLog(usuario);
	out.println("Result = "+result+" userLog "+texto1);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String usuario = texto2;
	// TODO process result here
	java.lang.String result = port.asignarUsuario(usuario);
	out.println("Result = "+result+" userPerfil "+texto2);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
    <%-- end web service invocation --%><hr/>
   
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = request.getParameter("texto1");
	java.lang.String password = request.getParameter("texto2");;
	// TODO process result here
	java.lang.String result = port.login(x, password);
	out.println("Result = "+result);
        response.sendRedirect("http://localhost:8080/Facebook/"+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
         
             
    </body>
</html>
