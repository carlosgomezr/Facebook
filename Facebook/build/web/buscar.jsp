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
    </head>
    <body background="BACK FB.png">
        <img src="BANNER FB.png"/>    
    <font color="white" FACE="verdana" SIZE=2>
        <h1></h1>  
    <br></br>
    <DIV ALIGN=right>
        <form name="pasarperfil" action="Perfil.jsp" method="POST">
            <input type="submit" value="Mi Perfil" name="boton1" />
        </form>
        <form name="pasarbuscar" action="buscar.jsp" method="POST">
            <input type="submit" value="Agregar +" name="agregar" />
        </form>
        
    </div>
    <div align="center"> 
        <DIV ALIGN=left>  
    <img src="photos/mujer.png" width="80" height="80"/> ---------¿Que es lo que me pasa?---------> 
</DIV> 
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
                                    <input type="submit" value="Publicar" name="boton1" /> 
                                </DIV>
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
                         <td>---------------------------------------------------</td>
                     </tr>
                 </tbody>
             </table>
             </FONT>
             </DIV>  
 
    </font>
   
    </body>
</html>
