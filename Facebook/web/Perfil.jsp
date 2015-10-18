<%-- 
    Document   : Perfil
    Created on : 28/09/2015, 08:51:55 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Facebook</title>
    </head><%! String usuarioLog=""; String usuarioPerfil="";%>
    <body background="BACK FB.png">
    <center>
    <font color="white" face="arial">
             <img src="BANNER FB.png"/>    
             <center>
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
             
                 <table border="0">
                     <tbody>
                         
                         <tr>
                             <form name="pasarbuscar" action="redir.jsp" method="POST">
                             <td> <input type="text" name="usuarioPerfil" value="¿ Buscar Amigos ?" size="40" /> </td>
                             <td> 
                                     <input type="submit" value="Buscar" name="boton0" /> 
                                  </form> 
                             </td>
                             <td><form name="pasarlogin" action="index.jsp" method="POST">
                                     <input type="submit" value="Log out" name="boton" />
                                 </form>
                             </td>
                             <td><form name="pasareliminar" action="eliminar.jsp" method="POST">
                                     <input type="submit" value="Eliminar Cuentat" name="eliminar" />
                                 </form>
                             </td>
                         </tr>
                         
                         <tr>
                             <td></td>
                             <td></td>
                         </tr>
                         
                     </tbody>
                 </table>
    
<DIV ALIGN=left>  
    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
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
                 <br></br>
             </center>
             
             <DIV ALIGN=right>     
             <table border="0">
                 <tbody>
                     <tr>
                         <td>
                             <form name="pasarperfil" action="Perfil.jsp" method="POST">  
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
	java.lang.String x = usuarioLog;
	java.lang.String correo = usuarioLog;
	java.lang.String titulo = request.getParameter("titulo");
	java.lang.String publicador = usuarioLog;
	java.lang.String texto = request.getParameter("texto1");
	java.lang.String imagen = "";
	// TODO process result here
	java.lang.String result = port.agregarPublicacion(x, correo, titulo, publicador, texto, imagen);
	out.println("Result = "+result+"  "+usuarioLog);
        out.println("Public :v ");
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
	java.lang.String contenido = "Publicó "+request.getParameter("texto1");
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
                            <form name="pasarcambiar" action="cambiar.jsp" method="POST">
                                <DIV ALIGN=left>                             
                                    <input type="submit" value="Chage Photo" name="boton2" />
                                </DIV>
                            </form> 
                         </td>
                         <td>
                            <form name="pasaramigos" action="amigos.jsp" method="POST">
                                <DIV ALIGN=right> 
                                    <input type="submit" value="Amigos" name="boton3" />
                                </DIV>
                            </form>   
                         </td>
                         <td>
                             <form name="pasarevento" action="evento.jsp" method="POST">
                                 <input type="submit" value="Eventos " name="boton4" />
                             </form>
                         </td>
                         <td>
                             <form name="pasarmodificar" action="modificar.jsp" method="POST">
                                 <input type="submit" value="Modificar " name="boton5" />
                             </form>
                         </td>
                         <td>
                            <form action="subirImagen.jsp" method="POST" enctype="multipart/form-data">
                                <input type="file" name="Image"/>
                                <input type="submit" value="Publicar Foto"/>
                            </form>
                         </td>
                     </tr>
                 </tbody>
             </table>
             </div>       
           
            
             
             <DIV ALIGN=left>
             <FONT FACE="verdana" SIZE=2>    
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
                                        
                         <td>
                        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
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
    <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarPublicacion(x);
	out.println("Result Public = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </font>
    </center>
    </body>
</html>
