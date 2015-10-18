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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Carlos Gomez
 */
public class listaPublicacion {
    public nodoP primero;
    public nodoP ultimo;
    public boolean flag=false;
    public String concatenar="";
    public int tam=0;
    public int id=0;
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public void alta(int id, String titulo,String nombre,String texto, String imagen)
    {
        if((primero==null))
        {
            nodoP nuevo = new nodoP(id,titulo,nombre,texto,imagen);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodoP nuevo = new nodoP(id,titulo,nombre,texto,imagen);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
       // return this;
    }
    
public String imprimir()
    {
       concatenar = "";
        nodoP actual;
        nodoP aux=primero;
        actual=primero;
        while(actual!=null)
        {
            concatenar=concatenar+" <h3> Titulo "+actual.titulo+" </h3> <h3> Publicó: "+actual.nombre +" </h3> Texto: "+actual.texto +" <br></br> Imagen: <IMG SRC=\"/photos/"+actual.imagen+"\">  <br></br> ";
            actual=actual.next;
        }
       primero=aux;
       return concatenar;
    }

    
public String imprimirAndroid()
    {
        concatenar = "";
        nodoP actual;
        nodoP aux=primero;
        actual=primero;
        while(actual!=null)
        {
            concatenar=concatenar+" Titulo "+actual.titulo+" Publicó: "+actual.nombre +" Texto: "+actual.texto +" Imagen: "+actual.imagen+" \n";
            actual=actual.next;
        }
       primero=aux;
       return concatenar;
    }

public boolean delete(int num)
    {
      nodoP anterior=null;
      nodoP actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.id==num)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodoP temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num==ultimo.id)
        {
             if(primero==ultimo){
                primero = ultimo = null;
            }
             else{
                ultimo=actual.ant;
                ultimo.next = null;
                //System.out.println("    ultimo.next"+ultimo.next.id);
             }
            return true;
        }
        return false;
}

public int tamaño(){
        tam =0;
        if( estavacio() )
	{
		tam=0;
	}
	nodoP actual = ultimo;
        nodoP aux=ultimo;
	while( actual != null)
	{
                tam = tam+1;
		actual = actual.ant;
	}
        ultimo = aux;
        return tam;
}
     
public String posicionPublicacion(int tam){
        concatenar="";
        if( estavacio() )
	{
		
	}
	nodoP actual = primero;
        nodoP auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                concatenar = " Titulo "+actual.titulo+" Publicó: "+actual.nombre +" Texto: "+actual.texto +" Imagen: "+actual.imagen;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
        return concatenar;
}

public int posicionPublicacionID(int tam){
        id = 0;
        if( estavacio() )
	{
		
	}
	nodoP actual = primero;
        nodoP auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                id = actual.id;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
        return id;
}


}

