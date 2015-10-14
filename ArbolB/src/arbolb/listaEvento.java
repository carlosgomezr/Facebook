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
 
    public void alta(int id,String nombre,String fecha, String direccion, String estado)
    {
        if((primero==null))
        {
            nodoEvento nuevo = new nodoEvento(id,nombre,fecha,direccion, estado);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodoEvento nuevo = new nodoEvento(id,nombre,fecha,direccion,estado);
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

public void cancelar(int id)
{
        concatenar = "";
        nodoEvento actual;
        nodoEvento aux=primero;
        actual=primero;
        while(actual!=null)
        {
            if(actual.id == id){
                actual.estado = "CANCELADO";
            }
            actual=actual.next;
        }
       primero=aux;
}
    
public int tamaño(){
        int t=0;
        if( estavacio() )
	{
		t=0;
	}
	nodoEvento actual = ultimo;
        nodoEvento aux=ultimo;
	while( actual != null)
	{
                t = t+1;
		actual = actual.ant;
	}
        ultimo = aux;
        return t;
}
        
public nodoEvento posicion(int tam){
        nodoEvento aux=null;
        if( estavacio() )
	{
		aux = null;
	}
	nodoEvento actual = primero;
        nodoEvento auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                aux = actual;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
        return aux;
}


}
