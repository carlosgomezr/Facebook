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
public class listaHistorial {

    public nodoHistorial primero;
    public nodoHistorial ultimo;
    public boolean flag=false;
    public String concatenar="";
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public void alta(String nombre,String contenido)
    {
        if((primero==null))
        {
            nodoHistorial nuevo = new nodoHistorial(nombre,contenido);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodoHistorial nuevo = new nodoHistorial(nombre,contenido);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
       // return this;
    }

    
public void imprimir()
{
        concatenar = "";
        nodoHistorial actual;
        nodoHistorial aux=primero;
        actual=primero;
        concatenar = "HISTORIAL DE: "+actual.nombre+" <br></br>";
        while(actual!=null)
        {
            concatenar=concatenar+" contenido "+actual.contenido +" <br></br>";
            actual=actual.next;
        }
       primero=aux;
}

public void imprimirAndroid()
{
         concatenar = "";
        nodoHistorial actual;
        nodoHistorial aux=primero;
        actual=primero;
        concatenar = "HISTORIAL DE: "+actual.nombre;
        while(actual!=null)
        {
            concatenar=concatenar+" contenido "+actual.contenido+"\\n";
            actual=actual.next;
        }
       primero=aux;
}

    
}
