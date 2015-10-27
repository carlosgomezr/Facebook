<%-- 
    Document   : buscar
    Created on : 28/09/2015, 10:44:22 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Facebook</title>
    </head><%! String usuarioLog=""; String usuarioPerfil; String men="ADD"; String name="";%>
    
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>   
        
    <font color="white" FACE="verdana" SIZE=2>
    <center>
    <h2>
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
    </h2>
    </center>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioPerfil();
	//out.println(""+result);
        usuarioPerfil=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
    <h2><%=usuarioPerfil%></h2>  
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
        <form name="pasarbuscar" action="amigoredir.jsp" method="POST">
            
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = usuarioLog;
	// TODO process result here
	java.lang.String result = port.asignarName(nombre);
	//out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

            
            
            <input type="submit" value="<%= men%>" name="agregar" />
        </form>
        <form name="pasareliminar" action="buscareliminar.jsp" method="POST">    
            <input type="submit" value="ELIMINAR" name="eliminaruser" />
        </form>
        
    </div>
    <div align="center"> 
        <DIV ALIGN=left>  
            <br></br>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.mostrarPhoto(x);
	out.println(""+result);
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
	java.lang.String palabra1 = "";
	java.lang.String nombre = usuarioLog;
	java.lang.String palabra2 = " busco a ";
	java.lang.String contenido = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.agregarHistorial2(palabra1, nombre, palabra2, contenido);
	//out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
  <br></br>  
 ---------¿Que es lo que me pasa?---------> 
</DIV> 
             <table border="0">
                 <tbody>
                     <tr>
                         <td>
                             <form name="pasarperfil" action="buscar.jsp" method="POST">  
                             Titulo
                                <input type="text" name="titulo" value="Escribe tu titulo aqui" size="30" />
                                <DIV ALIGN=right>  
                                    <textarea name="texto1" rows="5" cols="50">
                                    Publica Aqui :D
                                    </textarea>
                                </DIV>
                                <DIV ALIGN=left>  
          <br></br>
          <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioPerfil;
	java.lang.String correo = usuarioLog;
	java.lang.String titulo = request.getParameter("titulo");
	java.lang.String publicador = usuarioLog;
	java.lang.String texto = request.getParameter("texto1");
	java.lang.String imagen = "";
	// TODO process result here
	java.lang.String result = port.agregarPublicacion(x, correo, titulo, publicador, texto, imagen);
	//out.println("Result = "+result);
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
	java.lang.String palabra1 = " Publicó ";
	java.lang.String nombre = usuarioLog;
	java.lang.String palabra2 = " a ";
	java.lang.String contenido = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.agregarHistorial2(palabra1, nombre, palabra2, contenido);
	//out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                                    <input type="submit" value="Publicar" name="boton1" /> 
                                </DIV>
                             </form>
                         </td>
                         <td>
                             
 <form action="subirImagenBuscar.jsp" method="POST" enctype="multipart/form-data">
                                <input type="file" name="Image"/>
                                <input type="submit" value="Publicar Foto"/>
                            </form>                             
                         </td>
                    </tbody>
             </table>
    </div>    
             <table border="0">
                 <thead>
                     <tr>
                         <th></th>
                     </tr>
                 </thead>
                 <tbody>
                     <tr>
                         <td>----------------------My Info----------------------</td>
                     </tr>
                     
                     <tr>
                         <td>
                                <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.darDatosPerfil(x);
	out.println(""+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
 
                             
                             ---------------------------------------------------</td>
                     </tr>
                 </tbody>
             </table>
             </FONT>
             </DIV>  
 
    </font>
   
    </body>
</html>
