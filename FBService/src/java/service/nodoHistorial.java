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
public class nodoHistorial {
    String nombre;
    String contenido;
    nodoHistorial next;
    nodoHistorial ant;
    nodoHistorial(String nombre,String contenido)
    {
        this.nombre = nombre;
        this.contenido = contenido;
        this.next=null;
        this.ant=null;
    }    
}
