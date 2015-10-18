<%-- 
    Document   : reporte
    Created on : 11/10/2015, 10:12:42 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REPORTES</title>
    </head>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>    
    <font color="white" face="arial">
        <h1>REPORTES</h1>
        Diagramas de las Estructuras de Datos del Sistema
    <br></br>
    <DIV ALIGN=right>  
    <form name="pasarlogin" action="index.jsp" method="POST">
         <input type="submit" value="Log out" name="boton" />
     </form>
    </div>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
            <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphArbolB();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <input type="submit" value="                   ARBOL B               " name="boton0" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
         <input type="text" name="texto1" value="" size="15" />
            <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = request.getParameter("texto1");
	// TODO process result here
	java.lang.String result = port.graphAVL(x);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <input type="submit" value="            AVL DE AMIGOS           " name="boton1" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">

        <input type="text" name="texto2" value="" size="15" />
        <input type="text" name="texto5" value="" size="15" />
    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = request.getParameter("texto2");
	java.lang.String correo = request.getParameter("texto5");
	// TODO process result here
	java.lang.String result = port.graphEvento(x, correo);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
        
        <input type="submit" value="      EVENTOS POR PERSONA     " name="boton2" />
    </form>
    <br></br>
    
    
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <input type="text" name="texto3" value="" size="15" />
        <input type="text" name="texto6" value="" size="15" />
            <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = request.getParameter("texto3");
	java.lang.String correo = request.getParameter("texto6");
	// TODO process result here
	java.lang.String result = port.graphPublicacion(x, correo);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
        <input type="submit" value="PUBLICACIONES POR PERSONA" name="boton3" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphHistorial();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
        
        <input type="submit" value="                HISTORIAL              " name="boton4" />
    </form>
    </font>

    </body>
</html>
