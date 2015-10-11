/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb;

/**
 *
 * @author Carlos Gomez
 */
public class AVLNode {
    String correo;
    int contador;
    public AVLNode izquierdo;            // hijo izquierdo
    public AVLNode derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNode( String correo, int contador){
        this( correo,contador, null, null );
    }

    public AVLNode( String correo, int contador, AVLNode izq, AVLNode der ){
        this.correo = correo;
        this.contador = contador;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }
    
}
