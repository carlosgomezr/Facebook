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
public class nodoEvento {
    int id;
    String nombre;
    String fecha;
    String direccion;
    String estado;
    nodoEvento next;
    nodoEvento ant;
    nodoEvento(int id,String nombre,String fecha, String direccion, String estado)
    {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.estado = estado;
        this.next=null;
        this.ant=null;
    }    
}
