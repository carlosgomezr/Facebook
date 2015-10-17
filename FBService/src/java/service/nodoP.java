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
public class nodoP {
    int id;
    String titulo;
    String nombre;
    String texto;
    String imagen;
    nodoP next;
    nodoP ant;
    nodoP(int id,String titulo,String nombre,String texto, String imagen)
    {
        this.id = id;
        this.titulo = titulo;
        this.nombre = nombre;
        this.texto = texto;
        this.imagen = imagen;
        this.next=null;
        this.ant=null;
    }    
}

