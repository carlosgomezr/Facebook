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
public class listaEvento {

    public nodoEvento primero;
    public nodoEvento ultimo;
    public boolean flag=false;
    public String concatenar="";
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public void alta(String nombre,String fecha, String direccion, String estado)
    {
        if((primero==null))
        {
            nodoEvento nuevo = new nodoEvento(nombre,fecha,direccion, estado);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodoEvento nuevo = new nodoEvento(nombre,fecha,direccion,estado);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
       // return this;
    }

    
public void imprimir()
{
        concatenar = "";
        nodoEvento actual;
        nodoEvento aux=primero;
        actual=primero;
        while(actual!=null)
        {
            concatenar=concatenar+"<h3> Evento   "+actual.nombre +" </h3> Fecha: "+actual.fecha +" <br></br> Direccion: "+actual.direccion+"<br></br> Estado: "+actual.estado+" <br></br>";
            actual=actual.next;
        }
       primero=aux;
}

public void imprimirAndroid()
{
        concatenar = "";
        nodoEvento actual;
        nodoEvento aux=primero;
        actual=primero;
        while(actual!=null)
        {
            concatenar=concatenar+" Evento   "+actual.nombre +"  Fecha: "+actual.fecha +"  Direccion: "+actual.direccion+" Estado: "+actual.estado+" \n";
            actual=actual.next;
        }
       primero=aux;
}

public void cancelar(String nombre)
{
        concatenar = "";
        nodoEvento actual;
        nodoEvento aux=primero;
        actual=primero;
        while(actual!=null)
        {
            if(actual.nombre.compareTo(nombre)==0){
                actual.estado = "CANCELADO";
            }
            actual=actual.next;
        }
       primero=aux;
}
    
}
