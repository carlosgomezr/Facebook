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
public class ArbolB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola desu");
/*        Btree m=new
        Btree();
        NodoPr fa;
        for(int i=0;i<14;i++){
        fa=new NodoPr(i);
        m.Inserta(fa);
        }
        System.out.println("inserte desu xD");
        fa=new NodoPr(4);
        m.Eliminar(fa);
        m.InordenIT();
        System.out.println(m.salida);
        m.GraficarArbolB("C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\graph.txt");
        Funcion f = new Funcion();

        f.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\graph.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
*/    
        AVLUsuario user = new AVLUsuario();
        user.insert("arbol@gmail.com","arbol",1);
        user.insert("burro@gmail.com","burro",2);
        user.insert("casa@gmail.com","casa",3);
        user.insert("dado@gmail.com","dado",4);
        user.insert("elefante@gmail.com","elefante",5);
        user.insert("foco@gmail.com","foco",6);
        user.insert("gato@gmail.com","gato",7);
        user.insertarPublicacion(user.root, "arbol@gmail.com",1, "Titulo 1", " YO 1", "Texto 1", "Imagen 1");
        user.insertarPublicacion(user.root, "arbol@gmail.com",2, "Titulo 2", " YO 2", "Texto 2", "Imagen 2");
        user.insertarPublicacion(user.root, "arbol@gmail.com",3, "Titulo 3", " OTRO 3", "Texto 3", "Imagen 3");
        user.insertarPublicacion(user.root, "arbol@gmail.com",4, "Titulo 4", " OTRO 4", "Texto 4", "Imagen 4");
        user.insertarEvento(user.root,"arbol@gmail.com","Fiesta 1","28 de agosto","zona 1");
        user.insertarEvento(user.root,"arbol@gmail.com","Fiesta 2","30 de agosto","zona 2");
        user.insertarEvento(user.root,"arbol@gmail.com","Fiesta 3","31 de agosto","zona 4");
        user.cancelarEvento(user.root,"arbol@gmail.com","Fiesta 3");
   
//      user.GraphAVL(user.root,"user","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\AVL.txt");
        Funcion f = new Funcion();
        user.PublicacionxUsuario(user.root,"arbol@gmail.com","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Publish.txt","arbol");
//      f.generarImagen("ArbolAVL","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\AVL.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
        f.generarImagen("Publish","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Publish.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
        user.EventoxUsuario(user.root,"arbol@gmail.com","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Event.txt","Evento");
        f.generarImagen("Evento","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Event.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
       }   
    
}
