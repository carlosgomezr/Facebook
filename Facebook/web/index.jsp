<%-- 
    Document   : index
    Created on : 28/09/2015, 07:37:24 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body background="BACK FB.png">
    <font color="white" face="verdana">
             <img src="BANNER FB.png"/>
             <DIV ALIGN=right>
             <form name="pasarverificar" action="verificar.jsp" method="POST">
                  Usuario:
                 <input type="text" name="texto1" value="" size="15" />
                  Password:
                  <input type="password" name="texto2" value="" size="15" /> 
                  <input type="submit" value="Log-in" name="boton1">
             </form>
                 <form name="pasarreporte" action="reporte.jsp" method="POST">
                     <input type="submit" value="REPORTES" name="botonr" />
                 </form>
             </DIV>
             <form name="pasarlogin" action="index.jsp" method="POST">
             <table border="0">
                 <tbody>
                     <tr>
                         <td  rowspan="8"> <img src="CHANGE.png" width="750" height="400"/> </td>
                     </tr>
                     <tr>
                         <td> REGISTRARSE</td>
                         <td></td>
                         <td></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Nickname: </td>
                         <td><input type="text" name="texto3" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td></td>
                         <td></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Correo: </td>
                         <td><input type="text" name="texto4" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td></td>
                         <td></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Password: </td>
                         <td><input type="password" name="texto5" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td></td>
                         
                         <td>
        <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
                         
                             
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
                         
                             
                                    <input type="submit" value="Registrar xD" name="boton2" />
                         </td>
                     </tr>
                 </tbody>
             </table>
             </form>
             
    </font>
    </body>
</html>
