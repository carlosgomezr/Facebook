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
    </head>
   <body background="BACK FB.png">
        <img src="BANNER FB.png"/>    
    <font color="white" face="arial">
        <h1>Modificar datos :$</h1>
        Edita tus datos... :$
   
    <br></br>
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil O.O" name="boton1" />
        </form>
    </div>
    <table border="0">
        <tbody>
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
                <td><form name="pasarmodificar" action="modificar.jsp" method="POST">
                        <input type="submit" value="Modificar :$" name="boton2" />
                    </form></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>
    </font>
    </body>
</html>
