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
public class AVLNode {
    String correo;
    String nombre;
    int contador;
    listaPublicacion publicacion;
    listaEvento evento;
    public AVLNode izquierdo;            // hijo izquierdo
    public AVLNode derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNode( String correo,String nombre, int contador){
        this( correo,nombre,contador, null, null );
    }

    public AVLNode( String correo,String nombre, int contador, AVLNode izq, AVLNode der ){
        this.correo = correo;
        this.nombre = nombre;
        this.contador = contador;
        this.izquierdo = izq;
        this.derecho = der;
        this.publicacion = new listaPublicacion();
        this.evento = new listaEvento();
        height   = 0;               // altura predeterminada
    }
    
}
