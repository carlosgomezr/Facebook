<%-- 
    Document   : modificar
    Created on : 1/10/2015, 10:03:16 AM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar datos</title>
    </head><%! String usuarioLog=""; String usuarioPerfil="";%>
   <body background="BACK FB.png">
        <img src="BANNER FB.png"/>    
    <font color="white" face="arial">
        <h1>Modificar datos </h1>
        Edita tus datos...
       <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>

    <br></br>
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
    </div>
    <form name="pasarmodificar" action="modificar.jsp" method="POST">
    <table border="0">
        <tbody>
             <tr>
                <td>Password: </td>
                <td><input type="text" name="texto0" value="" size="15" /></td>
            </tr>
            <tr>
                <td>Edad: </td>
                <td><input type="text" name="texto1" value="" size="15" /></td>
            </tr>
            <tr>
                <td>Genero: </td>
                <td><input type="text" name="texto2" value="" size="15" /></td>
            </tr>
            <tr>
                <td>Pais: </td>
                <td><input type="text" name="texto3" value="" size="15" /></td>
            </tr>
            <tr>
                <td>Estado civil: </td>
                <td><input type="text" name="texto4" value="" size="15" /></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	java.lang.String password = request.getParameter("texto0");
	java.lang.String edad = request.getParameter("texto1");
	java.lang.String genero = request.getParameter("texto2");
	java.lang.String pais = request.getParameter("texto3");
	java.lang.String estado = request.getParameter("texto4");
	// TODO process result here
	java.lang.String result = port.modificarUsuario(x, password, edad, genero, pais, estado);
	out.println("Modificar usuario "+usuarioLog);
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
	java.lang.String nombre = usuarioLog;
	java.lang.String contenido = " Modifico Datos "+request.getParameter("texto0")+" "+request.getParameter("texto1")+" "+request.getParameter("texto2")+" "+request.getParameter("texto3")+" "+request.getParameter("texto4");
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
             
    
    
                        <input type="submit" value="ModificaR" name="boton2" />
                    </td>
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>
    </form>
    </font>
    </body>
</html>
