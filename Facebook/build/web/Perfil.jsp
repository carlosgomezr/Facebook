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
	out.println("Usuario Log"+result);
        usuarioLog = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
         
                 <table border="0">
                     <tbody>
                         
                         <tr>
                             <form name="pasarbuscar" action="buscar.jsp" method="POST">
                             <td> <input type="text" name="texto0" value="¿ Buscar Amigos ?" size="40" /> </td>
                             <td> 
                       <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String usuario = request.getParameter("texto0");
	// TODO process result here
	java.lang.String result = port.asignarUsuario(usuario);
	out.println("Buscar "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                                              
    
                                     <input type="submit" value="Buscar" name="boton0" /> 
                                  </form> 
                             </td>
                             <td><form name="pasarlogin" action="index.jsp" method="POST">
                                     <input type="submit" value="Log out" name="boton" />
                                 </form>
                             </td>
                             <td>
                                 <form name="pasarindex" action="index.jsp" method="POST">
                <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String correo = usuarioLog;
	// TODO process result here
	java.lang.String result = port.eliminarUsuario(correo);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                                     
                                     <input type="submit" value="ELIMINAR CUENTA" name="eliminar" />
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
    <img src="photos/hombre.png" width="80" height="80"/> ---------¿Que es lo que me pasa?---------> 
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
                            <form action="uploadFile.jsp" method="POST" enctype="multipart/form-data">
                                <input type="file" name="Image"/>
                         </td>
                         <td>       
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
        <%-- start web service invocation --%><hr/>
    <%
    try {
	service.NewWebService_Service service = new service.NewWebService_Service();
	service.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String x = usuarioLog;
	// TODO process result here
	java.lang.String result = port.mostrarPublicacion(x);
	out.println("Publicaciones "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
         
             
             </FONT>
             </DIV>  
 
    </font>
    </center>
    </body>
</html>
