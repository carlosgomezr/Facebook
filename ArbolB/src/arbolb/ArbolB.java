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
    }
    
}
