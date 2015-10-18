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
    </head><%! String usuarioLog=""; String usuarioPerfil; String men="XD";%>
    
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>   
        
    <font color="white" FACE="verdana" SIZE=2>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.darUsuarioLog();
	out.println("Result UserLog= "+result);
        usuarioLog = result;
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
	java.lang.String result = port.darUsuarioPerfil();
	out.println("Result = "+result);
        usuarioPerfil=result;
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
	java.lang.String x = usuarioLog;
	java.lang.String correo = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.existeAVL(x, correo);
	out.println("Result = "+result);
        men=result;
        out.println(" MENSAJE "+men);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
        <h1></h1>  
    <br></br>
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
        <form name="pasarbuscar" action="buscar.jsp" method="POST">
            
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	java.lang.String parameter1 = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.agregarEliminarAVL(x, parameter1);
	out.println("Result = "+result);
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
	java.lang.String contenido = usuarioLog+" "+men+" a"+usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
            <input type="submit" value="<%= men%>" name="agregar" />
        </form>
        
    </div>
    <div align="center"> 
        <DIV ALIGN=left>  
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioPerfil;
	// TODO process result here
	java.lang.String result = port.mostrarPhoto(x);
	out.println("Result = "+result);
        out.println("O.O");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
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
                                    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioPerfil;
	java.lang.String correo = usuarioLog;
	java.lang.String titulo = request.getParameter("titulo");
	java.lang.String publicador = usuarioPerfil;
	java.lang.String texto = request.getParameter("texto1");
	java.lang.String imagen = "";
	// TODO process result here
	java.lang.String result = port.agregarPublicacion(x, correo, titulo, publicador, texto, imagen);
	out.println("Result = "+result);
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
	java.lang.String nombre = usuarioPerfil;
	java.lang.String contenido = " Publicó "+request.getParameter("texto1");
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
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
                             
 <form action="uploadFile.jsp" method="POST" enctype="multipart/form-data">
                                <input type="file" name="Image"/>
                                      <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioPerfil;
	java.lang.String correo = usuarioLog;
	java.lang.String titulo = request.getParameter("titulo");
	java.lang.String publicador = usuarioPerfil;
	java.lang.String texto = "";
	java.lang.String imagen = request.getParameter("file");
	// TODO process result here
	java.lang.String result = port.agregarPublicacion(x, correo, titulo, publicador, texto, imagen);
	out.println("Result = "+result);
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
	java.lang.String nombre = usuarioPerfil;
	java.lang.String contenido = "Publicó "+request.getParameter("file");
	// TODO process result here
	java.lang.String result = port.agregarHistorial(nombre, contenido);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

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
                         <td> Nombre: Carlos Estuardo</td>
                     </tr>
                     <tr>
                         <td> Genero: Masculino</td>
                     </tr>
                     <tr>
                         <td> Edad: 19</td>
                     </tr> 
                     <tr>
                         <td> Pais: Guatemala</td>
                     </tr>
                      <tr>
                         <td> Estado Civil: ¬w¬</td>
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
	out.println("Result = "+result);
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
