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
public class listanombre {
    
    public nodonombre primero;
    public nodonombre ultimo;
    public boolean flag=false;
    public String concatenar="";
    public int tam=0;
    public int id=0;
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public void alta(String cadena)
    {
        if((primero==null))
        {
            nodonombre nuevo = new nodonombre(cadena);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodonombre nuevo = new nodonombre(cadena);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
       // return this;
    }
    
public String imprimir()
    {
        nodonombre actual;
        nodonombre aux=primero;
        actual=primero;
        while(actual!=null)
        {
            System.out.println("Cadena "+actual.cadena);
            actual=actual.next;
        }
       primero=aux;
       return concatenar;
    }


public int tamaño(){
        tam =0;
        if( estavacio() )
	{
		tam=0;
	}
	nodonombre actual = ultimo;
        nodonombre aux=ultimo;
	while( actual != null)
	{
                tam = tam+1;
		actual = actual.ant;
	}
        ultimo = aux;
        return tam;
}
     
public String posicionPublicacion(int tam){
    String retorno="";
        if( estavacio() )
	{
		
	}
	nodonombre actual = primero;
        nodonombre auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                retorno = actual.cadena;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
    return retorno;
}


}
