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
        NodoPr fa1 = new NodoPr(1,"arbol","arbolpass","user1",10,"masculino1","guatemala1","soltero1","foto1");
        NodoPr fa2 = new NodoPr(2,"burro","burropass","user2",20,"masculino2","guatemala1","soltero1","foto1");
        NodoPr fa3 = new NodoPr(3,"casa","casapass","user3",30,"masculino3","guatemala1","soltero1","foto1");
        NodoPr fa4 = new NodoPr(4,"dado","dadopass","user4",40,"masculino4","guatemala1","soltero1","foto1");
        NodoPr fa5 = new NodoPr(5,"elefante","elefantepass","user5",50,"masculino5","guatemala1","soltero1","foto1");
        NodoPr fa6 = new NodoPr(6,"faro","faropass","user6",60,"masculino6","guatemala1","soltero1","foto1");
        NodoPr fa7 = new NodoPr(7,"gato","gatopass","user7",70,"masculino7","guatemala1","soltero1","foto1");
        NodoPr fa8 = new NodoPr(8,"hilo","hilopass","user8",80,"masculino8","guatemala1","soltero1","foto1");
        NodoPr fa9 = new NodoPr(9,"isla","islapass","user9",90,"masculino9","guatemala1","soltero1","foto1");
        NodoPr fa10 = new NodoPr(10,"jocote","jocotepass","user10",100,"masculino10","guatemala1","soltero1","foto1");
        NodoPr fa11 = new NodoPr(11,"koala","koalapass","user11",110,"masculino11","guatemala1","soltero1","foto1");
        NodoPr fa12 = new NodoPr(12,"loco","locopass","user12",120,"masculino12","guatemala1","soltero1","foto1");
        Btree m = new
        Btree();
        m.Inserta(fa1);
        m.Inserta(fa2);
        m.Inserta(fa3);
        m.Inserta(fa4);
        m.Inserta(fa5);
        m.Inserta(fa6);
        m.Inserta(fa7);
        m.Inserta(fa8);
        m.Inserta(fa9);
        m.Inserta(fa10);
        m.Inserta(fa11);
        m.Inserta(fa12);
        m.GraficarArbolB("C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\graph.txt");
        Funcion g = new Funcion();
        m.insertarAVL("isla", "kaya0","kaya0XD", 1);
        m.insertarAVL("isla", "kaya1","kaya1XD", 2);
        m.insertarAVL("isla", "kaya2","kaya2XD", 3);
        m.graficarAVL("isla","AVLisla","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\AVLisla.txt");
        g.generarImagen("ArbolB","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\graph.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
        g.generarImagen("AVLisla","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\AVLisla.txt", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
        /*       
        Btree m=new
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
        user.insertarEvento(user.root,"arbol@gmail.com",0,"Fiesta 1","28 de agosto","zona 1");
        user.insertarEvento(user.root,"arbol@gmail.com",1,"Fiesta 2","30 de agosto","zona 2");
        user.insertarEvento(user.root,"arbol@gmail.com",2,"Fiesta 3","31 de agosto","zona 4");
        user.cancelarEvento(user.root,"arbol@gmail.com",2);
        
//      user.GraphAVL(user.root,"user","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\AVL.txt");
        Funcion f = new Funcion();
        user.PublicacionxUsuario(user.root,"arbol@gmail.com","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Publish.txt","arbol");
//      f.generarImagen("ArbolAVL","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\AVL.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
        f.generarImagen("Publish","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Publish.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
        user.EventoxUsuario(user.root,"arbol@gmail.com","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Event.txt","Evento");
        f.generarImagen("Evento","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\Event.txt","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolB\\src\\");
       }   
    
}
