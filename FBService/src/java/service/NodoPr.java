/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Carlos Gomez
 */
public class NodoPr{
int nump;
String correo;
String password;
String user;
int edad;
String genero;
String pais;
String estado;
String foto;
listaPublicacion publicacion;
listaEvento evento;
listaHistorial historial;
AVLUsuario usuarios;
//int ident;
//int codlib;
//int codtem;
//int codaut;
//String fecha;
NodoPr(int val){
nump=val;
}
NodoPr(int val,String correo,String password,String user,int edad, String genero,String pais, String estado, String foto){
this.nump=val;
this.correo = correo;
this.password = password;
this.user = user;
this.edad = edad;
this.genero = genero;
this.pais = pais;
this.estado = estado;
this.foto = foto;
this.publicacion = new listaPublicacion();
this.evento = new listaEvento();
this.historial = new listaHistorial();
this.usuarios = new AVLUsuario();
}
NodoPr(int val,String correo,String password,String user){
nump=val;
this.correo = correo;
this.password = password;
this.user = user;
this.historial = new listaHistorial();
this.usuarios = new AVLUsuario();
this.publicacion = new listaPublicacion();
this.evento = new listaEvento();
}
NodoPr(){
    this.publicacion = new listaPublicacion();
    this.evento = new listaEvento();
    this.historial = new listaHistorial();
    this.usuarios = new AVLUsuario();
}
}
