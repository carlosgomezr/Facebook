/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos Gomez
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
String usuarioLog = ""; // usuario con el que loguea el cliente
String usuarioPerfil = ""; // nombre del usuario del perfil en el que me encuentro
String photo = ""; // nombre de la fotografia que subio el usuario ya sea perfil o publicacion

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarUsuario")
    public String AgregarUsuario(@WebParam(name = "nombre") String nombre, @WebParam(name = "correo") String correo, @WebParam(name = "password") String password) {
        String mensaje="";
        int tcorreo = nombre.length();
        
        for(int i = 0; i<tcorreo;i++){
            if(nombre.charAt(i)=='.'){
                if(nombre.charAt(i)=='@'){
                    if(password.length()>6){
                        mensaje = " USUARIO REGISTRADO CORRECTAMENTE";
                    }
                    else{
                        mensaje = " LA CONTRASEÑA DEBE SER MINIMO DE 6 CARACTERES";
                    }
                }
                else{
                        mensaje = mensaje +" CORREO INCORRECTO";
                }
            }
        }
        
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DarUsuarioLog")
    public String DarUsuarioLog() {
        //TODO write your implementation code here:
        return usuarioLog;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DarUsuarioPerfil")
    public String DarUsuarioPerfil() {
        //TODO write your implementation code here:
        return usuarioPerfil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DarPhoto")
    public String DarPhoto() {
        //TODO write your implementation code here:
        return photo;
    }
}
