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
    </head>
    <body background="BACK FB.png">
    <center>
    <font color="white" face="arial">
             <img src="BANNER FB.png"/>    
             <center>
                 <table border="0">
                     <tbody>
                         <tr>
                             <td> <input type="text" name="texto0" value="¿ Buscar Amigos ? :B" size="40" /> </td>
                             <td> <form name="pasarbuscar" action="buscar.jsp" method="POST">
                                     <input type="submit" value="Buscar @u@" name="boton0" /> 
                                  </form> 
                             </td>
                             <td><form name="pasarlogin" action="index.jsp" method="POST">
                                     <input type="submit" value="Log out :c" name="boton" />
                                 </form>
                             </td>
                             <td></td>
                         </tr>
                     </tbody>
                 </table>

                 
                 
                 <br></br>
             </center>
             <DIV ALIGN=left>  
                 <img src="hombre.png"/> ---------¿Que es lo que me pasa?--------->
                 <textarea name="texto1" rows="5" cols="50">
Publica Aqui :D
                 </textarea>
             </DIV>
             <DIV ALIGN=right>     
             <table border="0">
                 <tbody>
                     <tr>
                         <td>
                             <form name="pasarperfil" action="Perfil.jsp" method="POST">  
                                <DIV ALIGN=left>  
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
                                    <input type="submit" value="Amigos ¬w¬" name="boton3" />
                                </DIV>
                            </form>   
                         </td>
                         <td>
                             <form name="pasarevento" action="evento.jsp" method="POST">
                                 <input type="submit" value="Eventos (~ouo)~" name="boton4" />
                             </form>
                         </td>
                         <td>
                             <form name="pasarmodificar" action="modificar.jsp" method="POST">
                                 <input type="submit" value="Modificar :$" name="boton5" />
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
                         <td> Sexo: Masculino</td>
                     </tr>
                     <tr>
                         <td> Edad: 19</td>
                     </tr>
                     <tr>
                         <td>---------------------------------------------------</td>
                     </tr>
                 </tbody>
             </table>
             </FONT>
             </DIV>  
 
    </font>
    </center>
    </body>
</html>
