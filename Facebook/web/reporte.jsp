<%-- 
    Document   : reporte
    Created on : 11/10/2015, 10:12:42 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REPORTES</title>
    </head>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>    
    <font color="white" face="arial">
        <h1>REPORTES</h1>
        Diagramas de las Estructuras de Datos del Sistema
    </font>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <input type="submit" value="                   ARBOL B               " name="boton0" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <input type="submit" value="            AVL DE AMIGOS           " name="boton1" />
        <input type="text" name="texto1" value="" size="15" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <input type="submit" value="      EVENTOS POR PERSONA     " name="boton2" />
        <input type="text" name="texto2" value="" size="15" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <input type="submit" value="PUBLICACIONES POR PERSONA" name="boton3" />
        <input type="text" name="texto3" value="" size="15" />
    </form>
    <br></br>
    <form name="pasarreporte" action="reporte.jsp" method="POST">
        <input type="submit" value="                HISTORIAL              " name="boton4" />
        <input type="text" name="texto4" value="" size="15" />
    </form>
    </body>
</html>
