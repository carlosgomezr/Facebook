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
                  <input type="submit" value="Log-in :3" name="boton1">
             </form>
             </DIV>
             <table border="0">
                 <tbody>
                     <tr>
                         <td  rowspan="8"> <img src="CHANGE.png" width="750" height="400"/> </td>
                     </tr>
                     <tr>
                         <td> REGISTRATE YA :3</td>
                         <td></td>
                         <td></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Nombre: </td>
                         <td><input type="text" name="texto1" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Apellido: </td>
                         <td><input type="text" name="texto2" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Correo: </td>
                         <td><input type="text" name="texto3" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Nickname: </td>
                         <td><input type="text" name="texto4" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td>Password: </td>
                         <td><input type="password" name="texto5" value="" size="15" /></td>
                     </tr>
                     <tr>
                         <td></td>
                         <td></td>
                         <td><form name="pasarlogin" action="index.jsp" method="POST">
                                    <input type="submit" value="Registrar xD" name="boton2" />
                             </form>
                         </td>
                     </tr>
                 </tbody>
             </table>

             
    </font>
    </body>
</html>
