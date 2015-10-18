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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
/**
 *
 * @author Carlos Gomez
 */
public class Funcion {
    
public void generarHistorial(listaHistorial lista,String ruta, String usuario){
            listaHistorial aux = lista;
            nodoHistorial auxprimero = lista.primero;
            nodoHistorial auxultimo = lista.ultimo;
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
            pw.write("label= \"LISTA DOBLE  HISTORIAL "+" \"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("node"+c+"[label=\" User: "+aux.primero.nombre+" Contenido: "+aux.primero.contenido+"\"];\n");
                            pw.write("node"+c2+"[label=\" User: "+aux.primero.next.nombre+" Contenido: "+aux.primero.next.contenido+"\"];\n");
                            pw.write("node"+c+"->node"+c2+";\n");
                            pw.write("node"+c2+"->node"+c+";\n");
                            aux.primero = aux.primero.next;
                            c=c+1;
                            c2=c2+1;
                        }
                    }
                    else{
                            pw.write("node"+c+"[label=\" User: "+aux.primero.nombre+" Contenido: "+aux.primero.contenido+"\"];\n");
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



public void generarImagen(String nombre,String ruta, String pathimagen) {
    String rutaimagen = ruta;
    System.out.println("RUTA DE GENERAR " + rutaimagen);
        
        try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

//path del archivo creado con el codigo del graphviz que queremos
            String fileInputPath = rutaimagen;

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz
            String fileOutputPath = pathimagen+nombre+".png";

//tipo de imagen de salida, en este caso es jpg
            String tParam = "-Tpng";

            String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas
//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

//Invocamos nuestra clase 
            Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola
            rt.exec(cmd);

        } catch (IOException ex) {
            System.out.println("fallo");
        } finally {
        }
    }

}
