<%-- 
    Document   : evento
    Created on : 1/10/2015, 10:59:04 AM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos (~owo)~</title>
    </head>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>  
    <font color="white" face="arial">
        <h1>Eventos (~owo)~</h1>
        Crea, revisa y planifica tus eventos .... (~owo)~
   
    <br></br>
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil O.O" name="boton1" />
        </form>
    </div>
    <DIV ALIGN=right>
        <h2> Mis Eventos </h2>
        <h3> Evento Cumpleaños :D</h3>Fecha: 17 de octubre <br></br>Direccion: Zona 1 Mario's House <br></br>Estado: ESPERANDO...
        <br></br>
        <h3> Evento Cumpleaños :D</h3>Fecha: 17 de octubre <br></br>Direccion: Zona 1 Mario's House <br></br>Estado: ESPERANDO...
        <h2> Crea tus eventos :D </h2>
        <table border="0">
            <tbody>
                <tr>
                    <td></td>
                    <td>Nombre: </td>
                    <td><input type="text" name="texto1" value="" size="25" /></td>
                    <td  rowspan="4"> <img src="EVENTOS FB.png"> </td>
                </tr>
                <tr>
                    <td></td>
                    <td>Fecha: </td>
                    <td><input type="text" name="texto2" value="" size="25" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td>Direccion: </td>
                    <td><input type="text" name="texto3" value="" size="25" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td>Amigos? :D</td>
                    <td>
                        <input type="text" name="texto4" value="" size="25" /></td>
                    <td>
                    </td>
                    
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
                        <form name="pasarevento" action="evento.jsp" method="POST">
                            <input type="submit" value="Crear Evento" name="boton5" />
                        </form>
                    </td>
                    
                </tr>
                
            </tbody>
        </table>
        <br></br>
        <h2>Evento que deseo cancelar :c </h2>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="text" name="texto1" value="" size="20" />
            <input type="submit" value="Cancelar Evento" name="boton2" />
        </form>
    </div>
    </font> 
    </body>
</html>
