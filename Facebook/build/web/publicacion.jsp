<%-- 
    Document   : publicacion
    Created on : 18/10/2015, 07:09:38 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%! String usuarioLog=""; String usuarioPerfil=""; String aux="";%>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>  
    <font color="white" face="arial">
        <h1>PUBLICAR FOTO</h1>
        Selecciona tu foto :D a publicar
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("Usuario = "+result);
        usuarioLog = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <br></br>
    
    <form action="uploadFile.jsp" method="POST" enctype="multipart/form-data">
        Titulo
        <input type="text" name="titulo1" value="Escribe tu titulo aqui" size="20" />
        <textarea name="texto1" rows="5" cols="50">
                                    Publica Aqui :D
        </textarea>
        <input type="file" name="file1"/>
       
        <input type="submit" value="Seleccionar Foto"/>
    </form>
    
    
    
    <br>
   
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
    </div>    
    </body>
</html>
