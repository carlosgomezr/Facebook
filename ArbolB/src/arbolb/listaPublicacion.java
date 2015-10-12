/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb;

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
    
public void imprimir()
    {
        concatenar = "";
        nodoP actual;
        nodoP aux=primero;
        actual=primero;
        while(actual!=null)
        {
            concatenar=concatenar+" <h3> Titulo "+actual.titulo+" </h3> <h3> Publicó: "+actual.nombre +" </h3> Texto: "+actual.texto +" <br></br> Imagen: "+actual.imagen+" <br></br> ";
            actual=actual.next;
        }
       primero=aux;
    }

    
public void imprimirAndroid()
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

}

