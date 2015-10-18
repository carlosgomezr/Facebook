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
public class AVLUsuario {

public AVLNode root;
public AVLNode padre;
public AVLNode r;       
public boolean flag=false;
public String evento="";
public String publicacion="";
public boolean existe=false;
    public void insert( String correo,String nombre,int contador ){
        root = insert(correo,nombre,contador,root );
    }
    //public void eliminar(int x){
    //    eliminar(root,x);
    //}
    public void buscar(String x){
        buscar(root,x);
    }
    
    public void padre(AVLNode hijo){
        padre(root,hijo);
    }
    public void balancear(){
        root=balancear(root);
    }

    public void existe(AVLNode nuevo,String x){
        flag=false;
        if(root==null){ flag=false;}
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                existe(nuevo.izquierdo,x);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                existe(nuevo.derecho,x);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
              flag = true;
        }
        
  }

public void existemod(AVLNode nuevo,String x,String password,int contador,String nuevocorreo,String nombre){

        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                existemod(nuevo.izquierdo,x,password,contador,nuevocorreo,nombre);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                existemod(nuevo.derecho,x,password,contador,nuevocorreo,nombre);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
            modificarEliminar(nuevo,x,contador,nuevocorreo,nombre);
        }
     
}

public void insertarEvento(AVLNode nuevo,String x,int id,String evento, String fecha, String direccion){

        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                insertarEvento(nuevo.izquierdo,x,id,evento,fecha,direccion);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                insertarEvento(nuevo.derecho,x,id,evento,fecha,direccion);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
               nuevo.evento.alta(id,evento, fecha, direccion, "ACTIVO");
        }
     
}

public void cancelarEvento(AVLNode nuevo,String x,int evento){

        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                cancelarEvento(nuevo.izquierdo,x,evento);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                cancelarEvento(nuevo.derecho,x,evento);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
               nuevo.evento.cancelar(evento);
        }
     
}
public String verEvento(AVLNode nuevo){
    evento="";
    mostrarEvento(nuevo);
    return evento;
}

public String verEventoAndroid(AVLNode nuevo){
    evento="";
    mostrarEventoAndroid(nuevo);
    return evento;
}

public String verPublicacion(AVLNode nuevo){
    publicacion="";
    mostrarPublicacion(nuevo);
    return publicacion;
}

public String verPublicacionAndroid(AVLNode nuevo){
    publicacion="";
    mostrarPublicacionAndroid(nuevo);
    return publicacion;
}

public String mostrarEvento(AVLNode nuevo){
            
            evento = evento+nuevo.evento.imprimir();
            if(nuevo.izquierdo!=null){
                mostrarEvento(nuevo.izquierdo);
            }
            if(nuevo.derecho!=null){
                mostrarEvento(nuevo.derecho);
            } 
            return evento;
         
}

public String mostrarEventoAndroid(AVLNode nuevo){           
            evento = evento + nuevo.evento.imprimirAndroid();
            if(nuevo.izquierdo!=null){
                mostrarEventoAndroid(nuevo.izquierdo);
            }
            if(nuevo.derecho!=null){
                mostrarEventoAndroid(nuevo.derecho);
            } 
            return evento;
}

public void insertarPublicacion(AVLNode nuevo,String x,int id,String titulo, String publicador, String texto, String imagen){
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                System.out.println("izquierda xD l"+x+""+nuevo.correo);
                insertarPublicacion(nuevo.izquierdo,x,id,titulo,publicador,texto,imagen);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                 System.out.println("derecha xD l"+x+""+nuevo.correo);
                 insertarPublicacion(nuevo.derecho,x,id,titulo,publicador,texto,imagen);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
            System.out.println("Lo encontre xD l"+x);     
            nuevo.publicacion.alta(id, titulo, publicador, texto, imagen);
                 
        }
     
}

public void eliminarPublicacion(AVLNode nuevo,String x,int id){

        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                eliminarPublicacion(nuevo.izquierdo,x,id);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                eliminarPublicacion(nuevo.derecho,x,id);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
               nuevo.publicacion.delete(id);
        }
     
}
public String mostrarPublicacion(AVLNode nuevo){
            publicacion = publicacion+nuevo.publicacion.imprimir();
            if(nuevo.izquierdo!=null){
                mostrarPublicacion(nuevo.izquierdo);
            }
            if(nuevo.derecho!=null){
                mostrarPublicacion(nuevo.derecho);
            }
            return publicacion;     
}

public String mostrarPublicacionAndroid(AVLNode nuevo){
            publicacion = publicacion+nuevo.publicacion.imprimirAndroid();
            if(nuevo.izquierdo!=null){
                mostrarPublicacionAndroid(nuevo.izquierdo);
            }
        
           if(nuevo.derecho!=null){
                mostrarPublicacionAndroid(nuevo.derecho);
            }
           return publicacion;
}

private AVLNode insert(String correo, String nombre, int contador,AVLNode t ){
        System.out.println("    t.insertar  "+t+" ");
        if( t == null )
            t = new AVLNode(correo,nombre,contador );
        else if( nombre.compareTo(t.correo)<0 ) {
            t.izquierdo = insert(correo,nombre,contador, t.izquierdo );
            if( height( t.izquierdo ) - height( t.derecho ) == 2 )
                if( nombre.compareTo(t.izquierdo.correo)<0 )
                    t = rotateWithLeftChild( t ); /* Caso 1 */
                else
                    t = doubleWithLeftChild( t ); /* Caso 2 */
        }
        else if(nombre.compareTo(t.correo)>0) {
            t.derecho = insert(correo,nombre,contador, t.derecho );
            if( height( t.derecho ) - height( t.izquierdo ) == 2 )
                if( nombre.compareTo(t.derecho.correo)>0)
                    t = rotateWithRightChild( t ); /* Caso 4 */
                else
                    t = doubleWithRightChild( t ); /* Caso 3 */
        }
        else
            ; // Duplicado; no hago nada
        t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
       // imprimir();
        return t;
    }

public AVLNode buscar(AVLNode nuevo,String x){
    try{    
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
                buscar(nuevo.izquierdo,x);
            }
          //  return null;
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                buscar(nuevo.derecho,x);
            }
            //  return null;
        }        
        if( x.compareTo(nuevo.correo)==0){
              return nuevo;
        }
    }catch(Exception ex){
    
    }
        return nuevo;
}
    
public void modificarEliminar(AVLNode nodo,String x, int contador,String nuevaclave,String nombre){
            eliminar(nodo,x);
            insert(nuevaclave,nombre,contador);
}

public void modificar(AVLNode nodo,String x, String nombre, String password){
        try{
        if (x.compareTo(nodo.correo)<0){
                modificar(nodo.izquierdo,x,nombre,password);
        }
        if (x.compareTo(nodo.correo)>0){
                modificar(nodo.derecho,x,nombre,password);
        }        
        if( x.compareTo(nodo.correo)==0){
                nodo.correo = x; 
                balancear(nodo);
        }
        }
        catch(Exception ex){
        }
}
    
private static int max( int lhs, int rhs ){
        return lhs > rhs ? lhs : rhs;
}

public  AVLNode balancear(AVLNode t){
        if((t!=null)){
                int id = height( t.izquierdo ) - height( t.derecho ) ;
                int di = height( t.derecho ) - height( t.izquierdo ) ;
                System.out.println("        ENTRO A BALANCEAR T "+t+" "+t.height);
                if( height( t.izquierdo ) - height( t.derecho ) == 2 ){
        		if(height(t.izquierdo.izquierdo) >= height(t.izquierdo.derecho))
			{
                                System.out.println("   ENTRE AL CASO 1");
                                t = rotateWithLeftChild( t ); /* Caso 1 */
			}
			else
			{
                                System.out.println("   ENTRE AL CASO 2");
                                t = doubleWithLeftChild( t ); /* Caso 2 */
			}
		}
                if(height( t.derecho ) - height( t.izquierdo ) ==2 ){
        		if(height(t.derecho.derecho) >= height(t.derecho.izquierdo))
			{
                                System.out.println("   ENTRE AL CASO 4");
        			t = rotateWithRightChild(t); /* Caso 4 */
 
                        }
			else
			{
                                System.out.println("   ENTRE AL CASO 3");
        			t = doubleWithRightChild(t); /* Caso 3 */	
			}
		}
                        t.izquierdo=balancear(t.izquierdo);
                        t.derecho=balancear(t.derecho);
     }
//        System.out.println(" TT"+t+" t.der "+t.derecho+" t.izq "+t.izquierdo);
        return t;
}
public static void actualizar_altura(AVLNode t){
    if(t!=null){
         t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
    }
}  


public void hijo(AVLNode padre, AVLNode hijo){
    System.out.println("HIJO HIJO XD "+hijo+hijo.correo+" PADRE PADRE "+padre+padre.correo);
    try{
        if(padre.izquierdo!=null){
            if(padre.izquierdo.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es izquierdo");
                padre.izquierdo = null;
            }
        }
        if(padre.derecho!=null){
            if(padre.derecho.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es derecho");
                padre.derecho = null;
            }
        }
        
    }catch(Exception ex){
    
    }
   
}

public boolean soyhijo(AVLNode padre, AVLNode hijo){
    boolean flag = false;
    System.out.println("HIJO HIJO XD "+hijo+hijo.correo+" PADRE PADRE "+padre+padre.correo);
    try{
        if(padre.izquierdo!=null){
            if(padre.izquierdo.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es izquierdo");
                flag=false;
                //padre.izquierdo = null;
            }
        }
        if(padre.derecho!=null){
            if(padre.derecho.correo.compareTo(hijo.correo)==0){
                System.out.println("    el hijo es derecho");
                flag=true;
                //padre.derecho = null;
            }
        }
        
    }catch(Exception ex){
    
    }
   return flag;
}

public AVLNode padre(AVLNode t,AVLNode hijo){
AVLNode aux = t;
if(aux!=null){
System.out.println("    aux padre "+aux);
if(aux.derecho!=null){
    
    if(hijo.correo.compareTo(aux.derecho.correo)>0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.correo.compareTo(aux.derecho.correo)<0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.correo.compareTo(aux.derecho.correo)==0){
        System.out.println("encontre al tata :D " +aux+"aux.derecho"+aux.derecho+"aux.izquierdo"+aux.izquierdo);
       // hijo(aux,hijo);
        padre = aux;
        return aux;
    }
    
}
if(aux.izquierdo!=null){
    if(hijo.correo.compareTo(aux.izquierdo.correo)>0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.derecho,hijo);
    }
    if(hijo.correo.compareTo(aux.izquierdo.correo)<0){
        System.out.println("No encontre tata :c  root " +aux+"  hijo "+hijo);
        padre(aux.izquierdo,hijo);
    }
    if(hijo.correo.compareTo(aux.izquierdo.correo)==0){
        System.out.println("encontre al tata :D " +aux+"aux.derecho"+aux.derecho+"aux.izquierdo"+aux.izquierdo);
       /// hijo(aux,hijo);
        padre = aux;
        return aux;
        }
    }
}
return  aux;
}    

public AVLNode eliminar(AVLNode t,String x){
	AVLNode aux;
        AVLNode aux2 = buscar(t,x);
        System.out.println("   eliminar  t   "+t);
        System.out.println("   eliminar aux 2 "+aux2);
        
        if(x.compareTo(t.correo)<0){
                System.out.println("t->izquierda "+t.correo);             
		eliminar(t.izquierdo,x);          
	}
	else if(x.compareTo(t.correo)>0){
		System.out.println("t->derecha "+t.correo);             
                eliminar(t.derecho,x);
	}
	else{
                if((t.izquierdo ==null) && (t.derecho==null)){
                      System.out.println("encontre esta mierda");
                      System.out.println("nodo t (hijo) "+t);
                      padre(t);
                      System.out.println("  VARIABLE PADRE STATIC "+padre);
                      hijo(padre,t);
                      System.out.println("BALANCEO PADRE "+padre+" p.izq "+padre.izquierdo+" p.der "+padre.derecho);
                      if(t==root){
                          root = null;
                      }
                      balancear();
                      //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;              
        	}
		else if(t.izquierdo==null){
                        System.out.println("Eliminar_izq");
			padre(t);
                        if(root==t){
                            root = t.derecho;
                            System.out.println("ENTRE T.IZQUIERDO = NULL xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        }else if(soyhijo(padre,t)==false){
                            aux = padre.derecho;
                            padre.izquierdo = t.derecho;
                            padre.derecho=aux;
                            balancear();
                            
                            //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }else if(soyhijo(padre,t)==true){
                            aux = padre.izquierdo;
                            padre.derecho=t.derecho;
                            padre.izquierdo=aux;
                            //hijo(padre,t);
                            balancear();
                            //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }
                        
		}
		else if(t.derecho==null){
                        System.out.println("Eliminar_der");
			padre(t);
                        if(root==t){
                            root = t.izquierdo;
                            System.out.println("ENTRE T.DERECHO = NULL xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        }
                        else if(soyhijo(padre,t)==false){
                            aux = padre.derecho;
                            padre.izquierdo = t.izquierdo;
                            padre.derecho=aux;
                            balancear();
                          //  t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }else if(soyhijo(padre,t)==true){
                            aux = padre.izquierdo;
                            padre.derecho =t.izquierdo;
                            padre.izquierdo=aux;
                            //hijo(padre,t);
                            balancear();
                        //    t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        }
		}
		else
		{
                   
                        System.out.println("Eliminar_min "+t.derecho+" "+t.derecho.correo);
                        r = t;
                        t = eliminar_min(t.derecho);
                      //  t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                        balancear();
                    
                }	
	}
               // balancear(t);
               // t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
               // padre = null;
        balancear();
                return t;
}

public AVLNode eliminar_min(AVLNode t){
	
        AVLNode auxp;
        if(t==null){
        
        }else{
            if (t.izquierdo==null)
            {
                    AVLNode auxr = r;
                    String auxid = r.correo;
                    String auxnombre = r.nombre;
                    listaEvento auxevento = r.evento;
                    listaPublicacion auxpublicacion = r.publicacion;
                    System.out.println("R :v"+r);
                    r.correo = t.correo;
                    r.nombre = t.nombre;
                    r.evento = t.evento;
                    r.publicacion = t.publicacion;
                    t.correo = auxid;
                    t.nombre = auxnombre;
                    t.evento = auxevento;
                    t.publicacion = auxpublicacion;
                    //t.height = max( height( t.izquierdo ), height( t.derecho ) ) + 1;
                    eliminar(t,auxid);
                    balancear();
                    
                return t;
                    
            }
            else
                {
                    eliminar_min(t.izquierdo);
                }
        }
        balancear();
        System.out.println(" este es el t del min "+t);
	return t;
}

private static AVLNode rotateWithLeftChild( AVLNode k2 ){
        System.out.println("ROTATE WITH LEFT CHILD");
        AVLNode k1 = k2.izquierdo;
        k2.izquierdo = k1.derecho;
        k1.derecho = k2;
        k2.height = max( height(k2.izquierdo), height(k2.derecho)) + 1;
        k1.height = max( height( k1.izquierdo ), k2.height ) + 1;
        return k1;
}


    private static AVLNode rotateWithRightChild( AVLNode k1 ){
        AVLNode k2 = k1.derecho;
        k1.derecho = k2.izquierdo;
        k2.izquierdo = k1;
        System.out.println("k2 "+k2+" k2.izq "+k2.izquierdo+" k2.der "+k2.derecho);
        k1.height = max( height(k1.izquierdo), height(k1.derecho) ) + 1;
        k2.height = max( height( k2.derecho ), k1.height ) + 1;
        return k2;
    }

    private static AVLNode doubleWithLeftChild( AVLNode k3 ){
        // izquierda derecha
        k3.izquierdo = rotateWithRightChild( k3.izquierdo );
        return rotateWithLeftChild( k3 );
    }


    private static AVLNode doubleWithRightChild( AVLNode k1 ){
        //derecha izquierda 
        k1.derecho = rotateWithLeftChild( k1.derecho );
        return rotateWithRightChild( k1 );
    }


    private static int height( AVLNode t ){
        return t == null ? -1 : t.height;
    }

    
    

public String ToDot(AVLNode node)
{
    String stream="";
    try{
   
 
    if(node.izquierdo !=null)
        {   
            stream=stream+"nodea"+node.contador+"[label=\" correo: "+node.correo+"\\n nombre: "+node.nombre+"\"];\n";
            stream=stream+"nodea"+node.izquierdo.contador+"[label=\" correo: "+node.izquierdo.correo+"\\n nombre: "+node.izquierdo.nombre+"\"];\n";
            stream=stream+"nodea"+node.contador+"->nodea"+node.izquierdo.contador+"[label=\"izq\"];\n";
            stream=stream+ToDot(node.izquierdo);
            //if(node->lista!=NULL){
            //conca+=graficarjuego(node->lista);
            //} 
                    
        }
    if(node.derecho !=null)
        {
           
            stream=stream+"nodea"+node.contador+"[label=\" correo: "+node.correo+"\\n nombre: "+node.nombre+"\"];\n";
            stream=stream+"nodea"+node.derecho.contador+"[label=\" correo: "+node.derecho.correo+"\\n nombre: "+node.derecho.nombre+"\"];\n";
            stream=stream+"nodea"+node.contador+"->nodea"+node.derecho.contador+"[label=\"der\"];\n";
            stream=stream+ToDot(node.derecho);
            
        }
    if(node!=null){
            stream=stream+"nodea"+node.contador+"[label=\" correo: "+node.correo+"\\n nombre: "+node.nombre+"\"];\n";
            //if(node->lista!=NULL){
                 //   conca+=graficarjuego(node->lista);
               // }
                //cod += graficarjuego(node->lista);
            }
    if(node==null){
    
    }
           
    }catch(Exception ex){}
     return stream;
}
    


public void GraphAVL(AVLNode node,String nombre,String ruta){
	    File f;
	    FileWriter escribir;
	    String cod="";
           
            try{
	    System.out.println(ruta);
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \" "+nombre+ "\"");
            pw.write("node [shape=record];\n");
            pw.write("subgraph g {\n");

                cod=cod+(ToDot(node));
            pw.write(cod);    
            pw.write("}\n");
            pw.write("}\n");
            
	    pw.close();
	    bw.close();
            }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }
}
    
public void PublicacionxUsuario(AVLNode nuevo,String x,String ruta, String nombre){
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
               System.out.println("p izquierda xD "+x);
               PublicacionxUsuario(nuevo.izquierdo,x,ruta,nombre);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                 System.out.println("p derecha xD "+x);
                 PublicacionxUsuario(nuevo.derecho,x,ruta,nombre);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
                 System.out.println("p Lo encontre xD "+x);
                 generarPublicaciones(nuevo.publicacion,ruta);
        }
        
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
            pw.write("label= \"LISTA DOBLE  PUBLICACIONES\"");
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

public void EventoxUsuario(AVLNode nuevo,String x,String ruta, String nombre){
        if ( x.compareTo(nuevo.correo)<0){
            if(nuevo.izquierdo!=null){
               System.out.println("p izquierda xD "+x);
               EventoxUsuario(nuevo.izquierdo,x,ruta,nombre);
            }
        }
        if ( x.compareTo(nuevo.correo)>0){
            if(nuevo.derecho!=null){
                System.out.println("p derecha xD "+x);
                EventoxUsuario(nuevo.derecho,x,ruta,nombre);
            }
        }        
        if( x.compareTo(nuevo.correo)==0){
                 System.out.println("p Lo encontre xD "+x);
                 generarEvento(nuevo.evento,ruta);
        }
   
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
            pw.write("label= \"LISTA DOBLE  EVENTOS\"");
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

