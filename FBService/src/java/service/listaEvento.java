/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Carlos Gomez
 */
public class listaEvento {

    public nodoEvento primero;
    public nodoEvento ultimo;
    public boolean flag=false;
    public String concatenar="";
    public int id=0;
    public int tam=0;
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

    
public String imprimir()
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
       return concatenar;
}

public String imprimirAndroid()
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
       return concatenar;
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
        tam =0;
        if( estavacio() )
	{
		tam=0;
	}
	nodoEvento actual = ultimo;
        nodoEvento aux=ultimo;
	while( actual != null)
	{
                tam = tam+1;
		actual = actual.ant;
	}
        ultimo = aux;
        return tam;
}
        
public String posicionEvento(int tam){
        concatenar="";
        if( estavacio() )
	{
		
	}
	nodoEvento actual = primero;
        nodoEvento auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                concatenar=" Evento   "+actual.nombre +"  Fecha: "+actual.fecha +"  Direccion: "+actual.direccion+" Estado: "+actual.estado;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
        return concatenar;
}

public int posicionEventoID(int tam){
        id = 0;
        if( estavacio() )
	{
		
	}
	nodoEvento actual = primero;
        nodoEvento auxiliar = primero;
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


public void generarEvento(listaEvento lista,String ruta){
            listaEvento aux = lista;
	    nodoEvento auxprimero = lista.primero;
            nodoEvento auxultimo = lista.ultimo;
            File f;
            int c = 0;
            int c2 = 1;
	    
            FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \"LISTA DOBLE  Mis eventos\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("node"+c+"[label=\" Nombre: "+aux.primero.nombre+"\\n Fecha: "+aux.primero.fecha+"\\n Direccion: "+aux.primero.direccion+"\\n Estado: "+aux.primero.estado+"\"];\n");
                            pw.write("node"+c2+"[label=\" Nombre: "+aux.primero.next.nombre+"\\n Fecha: "+aux.primero.next.fecha+"\\n Direccion: "+aux.primero.next.direccion+"\\n Estado: "+aux.primero.next.estado+"\"];\n");
                            pw.write("node"+c+"->node"+c2+";\n");
                            pw.write("node"+c2+"->node"+c+";\n");
                            aux.primero = aux.primero.next;
                            c=c+1;
                            c2=c2+1;
                        }
                    }
                    else{
                            pw.write("node"+c+"[label=\" Nombre: "+aux.primero.nombre+"\\n Fecha: "+aux.primero.fecha+"\\n Direccion: "+aux.primero.direccion+"\\n Estado: "+aux.primero.estado+"\"];\n");
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
	    aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    
            }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}

}
