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
int idusuarios=0; // incrementable que asciende al insertar usuario al arbol B
int idpublicaciones=0; // incrmentable que asciende tras insertar publicacion
int ideventos=0; // incrementable que asciende tras insertar evento
int idAVL=0;   // incrementable que asciende tras insertar amigo 
public static  Btree m = new
Btree();
public static listaHistorial historial = new listaHistorial();
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
        int tpassword = password.length();
        boolean btamaño= false;
        boolean barroba= false;
        boolean bpunto= false;
        boolean bexiste= false;
        
        if(tpassword>=6){ 
            btamaño= true;
        }else{
            mensaje=" ERROR PASSWORD MENOR A 6 CARACTERES <br></br>";
        }
        for(int i=0;i<correo.length();i++){
            if(correo.charAt(i)=='@'){
                barroba=true;
            }else if(correo.charAt(i)=='.'){
                bpunto=true;
            }
            else{
                mensaje=" ERROR CORREO NO VALIDO <br></br>";
            }
        }
        if(btamaño==true && barroba==true && bpunto==true){
            m.verificarUser(nombre);
            if(m.bandera==false){
                idusuarios = idusuarios+1;
                mensaje="USUARIO CREADO "+nombre+"  "+correo+"  "+password;
                NodoPr user = new NodoPr(idusuarios,correo,password,nombre,0,"","","","");
                m.Inserta(user);
                m.GraficarArbolB("C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt");
                Funcion g = new Funcion();
                g.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
               
            }
            else{
                mensaje=" NO SE PUDO CREAR USUARIO <br></br>";
            }
        }
                        
        
        return mensaje+" id "+idusuarios;
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
    @WebMethod(operationName = "AsignarUsuario")
    public String AsignarUsuario(@WebParam(name = "usuario") String usuario) {
        if(usuario!="" || usuario!=null){
            usuarioPerfil = usuario;
        }
        //TODO write your implementation code here:
        return "usuarioPerfil "+usuarioPerfil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AsignarUsuarioLog")
    public String AsignarUsuarioLog(@WebParam(name = "usuario") String usuario) {
        m.DarCorreoLogin(usuario);
        usuarioLog = m.auxcorreo;
        //TODO write your implementation code here:
        return "usuarioLog "+usuarioLog;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarUsuario")
    public String EliminarUsuario(@WebParam(name = "correo") String correo) {
        NodoPr user=new NodoPr(0,correo,"","",0,"","","","");
        m.Eliminar(user);
        m.GraficarArbolB("C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt");
        Funcion g = new Funcion();
        g.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        //TODO write your implementation code here:
        return "Cuenta Eliminada "+correo;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModificarUsuario")
    public String ModificarUsuario(@WebParam(name = "x") String x, @WebParam(name = "password") String password, @WebParam(name = "edad") String edad, @WebParam(name = "genero") String genero, @WebParam(name = "pais") String pais, @WebParam(name = "estado") String estado) {
        int auxedad = Integer.parseInt(edad);
        m.modificarDatos(x, password, auxedad, genero, pais, estado);
        m.GraficarArbolB("C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt");
        Funcion g = new Funcion();
        g.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        //TODO write your implementation code here:
        return "Modificado "+x;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraphArbolB")
    public String GraphArbolB() {
        m.GraficarArbolB("C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt");
        Funcion g = new Funcion();
        g.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\ArbolB.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        //TODO write your implementation code here:
        return "ArbolB Graficado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarAmigo")
    public String AgregarAmigo(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo, @WebParam(name = "nombre") String nombre) {
        m.insertarAVL(x, correo, nombre, idAVL);
        m.graficarAVL(x,"AVL "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\AVL.txt");
        Funcion g = new Funcion();
        g.generarImagen("AVL "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\AVL.txt", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");

        //TODO write your implementation code here:
        return "Amigo Agregado "+correo;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarAmigo")
    public String EliminarAmigo(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo) {
        m.eliminarAVL(x, correo);
        m.graficarAVL(x,"AVL "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\AVL.txt");
        Funcion g = new Funcion();
        g.generarImagen("AVL "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\AVL.txt", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarPublicacion")
    public String AgregarPublicacion(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo, @WebParam(name = "titulo") String titulo, @WebParam(name = "publicador") String publicador, @WebParam(name = "texto") String texto, @WebParam(name = "imagen") String imagen) {
        if(x!=null && correo!=null && titulo!=null && publicador!=null && texto!=null && imagen!=null){
            m.insertarAVLPublicacion(x, correo, idpublicaciones, titulo, publicador, texto, imagen);
            m.graficarAVLPublicacion(x, correo ,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Publicar.txt","Publicaciones");
            Funcion g = new Funcion();
            g.generarImagen("Publicaciones "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Publicar.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        }
        //TODO write your implementation code here:
        return "Publicado con exito ";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarEvento")
    public String AgregarEvento(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo, @WebParam(name = "evento") String evento, @WebParam(name = "fecha") String fecha, @WebParam(name = "direccion") String direccion) {
        if(x!=null && correo!=null && evento!=null && fecha!=null && direccion!=null){
            m.insertarAVLEvento(x, correo, ideventos, evento, fecha, direccion);
            m.graficarAVLEvento("isla","kaya0","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\EventosB.txt","Eventos :B");
            Funcion g = new Funcion();
            g.generarImagen("Eventos"+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\EventosB.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        }
        //TODO write your implementation code here:
        return "Evento creado ";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "x") String x, @WebParam(name = "password") String password) {
        String pagina="index.jsp";
        m.Login(x, password);
        if(m.banderalog==true){
            pagina="Perfil.jsp";
        }
        //TODO write your implementation code here:
        return pagina;
    }







    /**
     * Web service operation
     */
    @WebMethod(operationName = "AsignarPhoto")
    public String AsignarPhoto(@WebParam(name = "x") String x, @WebParam(name = "foto") String foto) {
        m.modificarFoto(x, foto);
        //TODO write your implementation code here:
        return "FOTO ACTUALIZADA";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DarDatosPerfil")
    public String DarDatosPerfil(@WebParam(name = "x") String x) {
        m.darDatosB(x);
        String mensaje="";
        mensaje="<br> Nombre: "+m.auxnombre+"</br>"+"<br> Genero: "+m.auxgenero+"</br>"+"<br> Edad: "+m.auxedad+"</br>"+"<br> Pais: "+m.auxpais+"</br>"+"<br> Estado: "+m.auxestado+"</br>";
        //TODO write your implementation code here:
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DarDatosPerfilAndroid")
    public String DarDatosPerfilAndroid(@WebParam(name = "x") String x) {
        m.darDatosB(x);
        String mensaje="";
        mensaje="Nombre: "+m.auxnombre+"\n"+"Genero: "+m.auxgenero+"\n"+"Edad: "+m.auxedad+"\n"+"Pais: "+m.auxpais+"\n"+"Estado: "+m.auxestado+"\n";
        //TODO write your implementation code here:
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MostrarPublicacion")
    public String MostrarPublicacion(@WebParam(name = "x") String x) {
        m.mostrarPublicacion(x);
        //TODO write your implementation code here:
        return m.publicacion;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MostrarPublicacionAndroid")
    public String MostrarPublicacionAndroid(@WebParam(name = "x") String x) {
        m.mostrarPublicacionAndroid(x);
        //TODO write your implementation code here:
        return m.publicacion;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MostrarEvento")
    public String MostrarEvento(@WebParam(name = "x") String x) {
        m.mostrarEvento(x);
        //TODO write your implementation code here:
        return m.evento;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MostrarEventoAndroid")
    public String MostrarEventoAndroid(@WebParam(name = "x") String x) {
        m.mostrarEventoAndroid(x);
        //TODO write your implementation code here:
        return m.evento;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MostrarPhoto")
    public String MostrarPhoto(@WebParam(name = "x") String x) {
    String mensaje="";
    m.darPhotoB(x);
    if(m.auxfoto!=null){
        mensaje="<img src=\"photos/"+m.auxfoto+"\"/  width=\"80\" height=\"80\">";
    }else{
        mensaje="<img src=\"photos/hombre.png"+"\"/  width=\"80\" height=\"80\">";
    }
    
        //TODO write your implementation code here:
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MostrarPhotoAndroid")
    public String MostrarPhotoAndroid(@WebParam(name = "x") String x) {
    String mensaje="";
    m.darPhotoB(x);
    mensaje=m.auxfoto;
    //TODO write your implementation code here:
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ExisteAVL")
    public String ExisteAVL(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo) {
        String mensaje="inicio";
        m.existeAVL(x, correo);
        if(m.existebandera==true){
            mensaje="ELIMINAR";
        }
        else{
            mensaje="AGREGAR +";
        }
        //TODO write your implementation code here:
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarEliminarAVL")
    public String AgregarEliminarAVL(@WebParam(name = "x") String x, @WebParam(name = "parameter1") String parameter1) {
        String mensaje="";
        m.existeAVL(x, parameter1);
        if(m.existebandera==true){
            m.eliminarAVL(x,parameter1);
        }
        else{
            m.darDatosB(x);
            m.insertarAVL(x,parameter1, m.auxnombre, idAVL);
        }
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraphAVL")
    public String GraphAVL(@WebParam(name = "x") String x) {
        m.graficarAVL(x,"AVL "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\AVL.txt");
        Funcion g = new Funcion();
        g.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\AVL.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
               
        //TODO write your implementation code here:
        return "AVL "+x;
    }



    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarHistorial")
    public String AgregarHistorial(@WebParam(name = "nombre") String nombre, @WebParam(name = "contenido") String contenido) {
        historial.alta(nombre, contenido);
        Funcion g = new Funcion();
        g.generarHistorial(historial,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Historial.txt",usuarioLog);
        g.generarImagen("Historial","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Historial.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        //TODO write your implementation code here:
        return "Agregar Historial ";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraphHistorial")
    public String GraphHistorial() {
        Funcion g = new Funcion();
        g.generarHistorial(historial,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Historial.txt",usuarioLog);
        g.generarImagen("Historial","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Historial.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        
        //TODO write your implementation code here:
        return "Grafica Historial";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraphPublicacion")
    public String GraphPublicacion(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo) {
        //TODO write your implementation code here:
       
        Funcion g = new Funcion();
        m.graficarAVLPublicacion(x, correo,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Publicacion.txt", "Publicaciones "+x);
        g.generarImagen("Publicacion "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Publicacion.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        return "Graficar Publicacion";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraphEvento")
    public String GraphEvento(@WebParam(name = "x") String x, @WebParam(name = "correo") String correo) {
        //TODO write your implementation code here:
        Funcion g = new Funcion();
        m.graficarAVLPublicacion(x, correo,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Evento.txt", "Eventos "+x);
        g.generarImagen("Evento "+x,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\Evento.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\FBService\\src\\");
        return "Graficar Evento";
    }



    
   
}
