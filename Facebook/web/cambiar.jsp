<%-- 
    Document   : cambiar
    Created on : 28/09/2015, 09:49:23 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambiar foto</title>
    </head><%! String usuarioLog=""; String usuarioPerfil=""; String aux="";%>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>  
    <font color="white" face="arial">
        <h1>CHANGE PHOTO</h1>
        Selecciona tu foto
        <br></br>
        <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("USUARIO = "+result);
        usuarioLog = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <br></br>
    <br></br>
    
    <form action="uploadFile.jsp" method="POST" enctype="multipart/form-data">
        <input type="file" name="file1"/>
        <input type="submit" value="Seleccionar Foto"/>
    </form>
    
    
    
    <br>
   
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
    </div>
    <center>
        <img src="CHANGE.png" width="800" height="400"/>  
    </center>
    </font>
    </body>
</html>
