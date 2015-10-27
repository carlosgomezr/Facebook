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
            concatenar=concatenar+" <h3> Titulo "+actual.titulo+" </h3> <h3> Publicó: "+actual.nombre +" </h3> Texto: "+actual.texto +" <br></br> Imagen: <IMG SRC=\"http://localhost:8080/Facebook/photos/"+actual.imagen+"\"  <br></br> ";
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

public void generarPublicaciones(listaPublicacion lista,String ruta){
            listaPublicacion aux = lista;
	    nodoP auxprimero = lista.primero;
            nodoP auxultimo = lista.ultimo;
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
            pw.write("label= \"LISTA DOBLE  Mis publicaciones\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("node"+c+"[label=\" Titulo: "+aux.primero.titulo+"\\n Quien publicó: "+aux.primero.nombre+"\\n Texto: "+aux.primero.texto+"\\n Imagen: "+aux.primero.imagen+"\"];\n");
                            pw.write("node"+c2+"[label=\" Titulo: "+aux.primero.next.titulo+"\\n Quien publicó: "+aux.primero.next.nombre+"\\n Texto: "+aux.primero.next.texto+"\\n Imagen: "+aux.primero.next.imagen+"\"];\n");
                            pw.write("node"+c+"->node"+c2+";\n");
                            pw.write("node"+c2+"->node"+c+";\n");
                            aux.primero = aux.primero.next;
                            c=c+1;
                            c2=c2+1;
                        }
                    }
                    else{
                            pw.write("node"+aux.primero.id+"[label=\" Titulo: "+aux.primero.titulo+"\\n Quien publicó: "+aux.primero.nombre+"\\n Texto: "+aux.primero.texto+"\\n Imagen: "+aux.primero.imagen+"\"];\n");
                    }
                
            }
            else{
                    System.out.println("    lista vacia  ");
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

