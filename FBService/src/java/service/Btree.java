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
import javax.swing.*;
import java.io.*;
//Arboles Btree
public class Btree{
Bnodo p=new Bnodo();
Bnodo Xder = new Bnodo();
Bnodo Xizq = new Bnodo();
NodoPr X;
Bnodo Xr;
String salida="",imps="";
boolean EmpA = false,Esta=false;
String publicacion="";
String evento="";
String auxnombre="";
String auxedad="";
String auxgenero="";
String auxpais="";
String auxestado="";
String auxfoto="";
boolean bandera=false;
boolean banderalog=false;
//***************************************
//*****Inserta un nodo en un arbol b*****
//***************************************
void Inserta(NodoPr clave){
Insertaa(clave,p);
}
//auxiliar de inserta nodo
public void Insertaa(NodoPr clave, Bnodo raiz){
Empujar(clave,raiz);
if(EmpA){
p=new Bnodo();
p.Cuentas= 1;
p.Claves[0]=X;
p.Ramas[0]=raiz;
p.Ramas[1]=Xr;
}
JOptionPane.showMessageDialog(null,"Insercion Completa");
}
//Empuja los elementos del arbol
public void Empujar(NodoPr clave, Bnodo raiz){
int k=0;
Esta=false;
if(Vacio(raiz)){
EmpA=true;
X=clave;
Xr=null;
}
else{
k=BuscarNodo(clave, raiz);
if(Esta){
JOptionPane.showMessageDialog(null,"No hay claves repetidas");
EmpA=false;
}
else{
Empujar(clave, raiz.Ramas[k]);
if(EmpA){
if(raiz.Cuentas < 4){
EmpA = false;
MeterHoja(X, raiz, k);
}
else{
EmpA = true;
DividirN(X, raiz, k);
}
}
}
}
}
//Meter hoja
public void MeterHoja(NodoPr clave, Bnodo raiz, int k){
int i = raiz.Cuentas;
while (i != k){
raiz.Claves[i] = raiz.Claves[i-1];
raiz.Ramas[i+1] = raiz.Ramas[i];
--i;
}
raiz.Claves[k] = clave;
raiz.Ramas[k+1] = Xr;
raiz.Cuentas = ++raiz.Cuentas;
}
//Dividir nodo
public void DividirN(NodoPr Clave, Bnodo Raiz, int k){
int pos=0;
int Posmda=0;
if (k <= 2)
Posmda = 2;
else{
Posmda = 3;
}
Bnodo Mder = new Bnodo();
pos = Posmda+1;
while (pos != 5){
Mder.Claves [(pos - Posmda)-1] = Raiz.Claves[pos-1];
Mder.Ramas [pos - Posmda] = Raiz.Ramas[pos];
++pos;
}
Mder.Cuentas = 4 - Posmda;
Raiz.Cuentas = Posmda;
if (k <= 2)
MeterHoja(Clave, Raiz, k);
else{
MeterHoja(Clave, Mder, (k - Posmda));
}
X = Raiz.Claves[Raiz.Cuentas-1];
Mder.Ramas[0] = Raiz.Ramas[Raiz.Cuentas];
Raiz.Cuentas = --Raiz.Cuentas;
Xr=Mder;
}
//****************************************
//*****Borrar un elemento del arbol b*****
//****************************************
void Eliminar(NodoPr clave){
if(Vacio(p)){
JOptionPane.showMessageDialog(null,"No hay elementos");
}
else
Eliminara(p,clave);
}
public void Eliminara(Bnodo Raiz, NodoPr clave){
try{
EliminarRegistro(Raiz, clave);
}
catch(Exception e){
Esta=false;
}
if (!Esta)
JOptionPane.showMessageDialog(null,"No se encontro el elemento");
else{
if (Raiz.Cuentas == 0)
Raiz = Raiz.Ramas[0];
p=Raiz;
JOptionPane.showMessageDialog(null,"Eliminacion completa");
}
}
//Elimina el registro
public void EliminarRegistro(Bnodo raiz, NodoPr c){
int pos = 0;
NodoPr sucesor;
if (Vacio(raiz))
Esta = false;
else{
pos = BuscarNodo(c, raiz);
if (Esta){
if (Vacio(raiz.Ramas[pos-1]))
Quitar(raiz, pos);
else{
Sucesor(raiz, pos);
EliminarRegistro (raiz.Ramas[pos], raiz.Claves[pos-1]);
}
}
else{
EliminarRegistro(raiz.Ramas[pos], c);
if ((raiz.Ramas[pos] != null) && (raiz.Ramas[pos].Cuentas < 2))
Restablecer(raiz, pos);
}
}
}
//Busca el sucesor
public void Sucesor (Bnodo raiz, int k){
Bnodo q=raiz.Ramas[k];
while(!Vacio(q.Ramas[0]))
q=q.Ramas[0];
raiz.Claves[k-1]=q.Claves[0];
}
//Combina para formar un nodo
public void Combina(Bnodo raiz, int pos){
int j;
Xder = raiz.Ramas[pos];
Xizq = raiz.Ramas[pos-1];
Xizq.Cuentas++;
Xizq.Claves[Xizq.Cuentas-1] = raiz.Claves[pos-1];
Xizq.Ramas[Xizq.Cuentas] = Xder.Ramas[0];
j = 1;
while (j != Xder.Cuentas+1){
Xizq.Cuentas++;
Xizq.Claves[Xizq.Cuentas-1] = Xder.Claves[j-1];
Xizq.Ramas[Xizq.Cuentas] = Xder.Ramas[j];
j++;
}
Quitar(raiz, pos);
}
//Mueve a la derecha
public void MoverDer(Bnodo raiz, int pos){
int i = raiz.Ramas[pos].Cuentas;
while (i != 0){
raiz.Ramas[pos].Claves[i] = raiz.Ramas[pos].Claves[i-1];
raiz.Ramas[pos].Ramas[i+1] = raiz.Ramas[pos].Ramas[i];
--i;
}
raiz.Ramas[pos].Cuentas++;
raiz.Ramas[pos].Ramas[1] = raiz.Ramas[pos].Ramas[0];
raiz.Ramas[pos].Claves[0] = raiz.Claves[pos-1];
raiz.Claves[pos-1] = raiz.Ramas[pos-1].Claves[raiz.Ramas[pos-1].Cuentas-1];
raiz.Ramas[pos].Ramas[0] = raiz.Ramas[pos-1].Ramas[raiz.Ramas[pos-1].Cuentas];
raiz.Ramas[pos-1].Cuentas--;
}
//Mover a la izquierda
public void MoverIzq(Bnodo raiz, int pos){
int i;
raiz.Ramas[pos-1].Cuentas++;
raiz.Ramas[pos-1].Claves[raiz.Ramas[pos-1].Cuentas-1] = raiz.Claves[pos-1];
raiz.Ramas[pos-1].Ramas[raiz.Ramas[pos-1].Cuentas] = raiz.Ramas[pos].Ramas[0];
raiz.Claves[pos-1] = raiz.Ramas[pos].Claves[0];
raiz.Ramas[pos].Ramas[0] = raiz.Ramas[pos].Ramas[1];
raiz.Ramas[pos].Cuentas--;
i = 1;
while (i != raiz.Ramas[pos].Cuentas+1){
raiz.Ramas[pos].Claves[i-1] = raiz.Ramas[pos].Claves[i];
raiz.Ramas[pos].Ramas[i] = raiz.Ramas[pos].Ramas[i+1];
i++;
}
}
//Quita el elemento
public void Quitar (Bnodo raiz, int pos){
int j = pos + 1;
while (j != raiz.Cuentas+1){
raiz.Claves [j-2] = raiz.Claves[j-1];
raiz.Ramas [j-1] = raiz.Ramas[j];
j++;
}
raiz.Cuentas--;
}
//Restablece el nodo
public void Restablecer(Bnodo raiz, int pos){
if (pos>0){
if (raiz.Ramas[pos-1].Cuentas > 2)
MoverDer(raiz, pos);
else
Combina(raiz, pos);
}
else{
if (raiz.Ramas[1].Cuentas > 2)
MoverIzq(raiz, 1);
else
Combina(raiz, 1);
}
}
//***************************
//*****Metodos Generales*****
//***************************
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//muestra los temas por estudiante
//public void temasestudiante(ListaSimpleB idents,Bnodo Raiz){
//NodosLista m=idents.PrimerNodo;
//imps="";
//while(m!=null){ 
//imps=imps+"IDENTIFICACION: "+m.indice;
//temasestudianteaux(m.indice,Raiz);
//imps=imps+"";
//m=m.siguiente;
//}
//}
//public void temasestudianteaux(int id,Bnodo Raiz){
//int i;
//if(!Vacio(Raiz)){
//temasestudianteaux(id,Raiz.Ramas[0]);
//i=1;
//while (i != Raiz.Cuentas+1){
//if(id==Raiz.Claves[i-1].ident){
//imps=imps+"  Tema: "+Raiz.Claves[i-1].codtem+" *****"+"-Num Prestamo: "+Raiz.Claves[i-1].nump+"-Libro: "+Raiz.Claves[i-1].codlib+"-Cod Autor: "+Raiz.Claves[i-1].codaut+"-Fecha/Hora: "+Raiz.Claves[i-1].fecha;
//}
//temasestudianteaux(id,Raiz.Ramas[i]);
//++i;
//}
//}
//}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//Retorna true si el arbol esta vacio
public boolean Vacio(Bnodo raiz){
return (raiz==null || raiz.Cuentas==0);
}
//Buscar retorna true si lo encuentra y la posicion
public int BuscarNodo(NodoPr clave, Bnodo raiz){
int j=0;
//if(clave.nump < raiz.Claves[0].nump){
if(clave.correo.compareTo(raiz.Claves[0].correo)<0){
Esta = false;
j=0;
}
else{
j = raiz.Cuentas;
//while (clave.nump < raiz.Claves[j-1].nump && j>1)
while(clave.correo.compareTo(raiz.Claves[j-1].correo)<0 && j>1)
--j;
//Esta = (clave.nump == raiz.Claves[j-1].nump);
Esta = (clave.correo.compareTo(raiz.Claves[j-1].correo)==0);
}
return j;
}

//miembro
public boolean Miembro(NodoPr clave, Bnodo raiz){
boolean si=false;
int j=0;
if(!Vacio(p)){
//if(clave.nump < raiz.Claves[0].nump){
if(clave.correo.compareTo(raiz.Claves[0].correo)<0){
si = false;
j=0;
}
else{
j = raiz.Cuentas;
//while (clave.nump < raiz.Claves[j-1].nump && j>1)
while(clave.correo.compareTo(raiz.Claves[j-1].correo)<0 && j>1)
--j;
si = (clave.correo.compareTo(raiz.Claves[j-1].correo)==0);
//si = (clave.nump == raiz.Claves[j-1].nump);
}
}
return si;
}
//Recorrido InOrden Iterativo
void InordenIT(){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
//salida=salida+"Num Prestamo: "+nodo.Claves[i-1].nump+"-Id: "+nodo.Claves[i-1].ident;
//salida=salida+"\n-Cod Tema: "+nodo.Claves[i-1].codtem+"\n-Cod Libro: "+nodo.Claves[i-1].codlib+"\n-Cod Autor: "+nodo.Claves[i-1].codaut+"\n-Fecha/hora: "+nodo.Claves[i-1].fecha+"";
salida=salida+"\n-------------------------------\n";
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Modifica los datos de genero, pais, edad, pais del arbol B
void modificarDatos(String x,String password, int edad, String genero, String pais, String estado){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].password = password;
        nodo.Claves[i-1].edad = edad;
        nodo.Claves[i-1].genero = genero;
        nodo.Claves[i-1].pais = pais;
        nodo.Claves[i-1].estado = estado;
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Modifica la foto
void modificarFoto(String x,String foto){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].foto = foto;
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}



//Da los valores del nodo del arbol B
void darDatosB(String x){
int i=0;
Bnodo nodo=p;
auxnombre="";
auxedad="";
auxgenero="";
auxpais="";
auxestado="";
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        auxnombre=nodo.Claves[i-1].user;
        auxedad=nodo.Claves[i-1].edad+"";
        auxgenero=nodo.Claves[i-1].genero;
        auxpais=nodo.Claves[i-1].pais;
        auxestado=nodo.Claves[i-1].estado;
        auxfoto=nodo.Claves[i-1].foto;
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


void darPhotoB(String x){
int i=0;
Bnodo nodo=p;
auxfoto="";
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        auxfoto=nodo.Claves[i-1].foto;
    }
    else{
        auxfoto="hombre.png";
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Inserta en el AVL del arbol B
void insertarAVL(String x,String correo,String nombre,int id){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.insert(correo, nombre, id);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

void eliminarAVL(String x,String correo){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.eliminar(nodo.Claves[i-1].usuarios.root, correo);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Inserta en la lista de publicaciones del AVL del arbol B
void insertarAVLPublicacion(String x,String correo,int id,String titulo,String publicador,String texto,String imagen){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0||nodo.Claves[i-1].user.compareTo(x)==0){
        if(x.compareTo(correo)==0){
            nodo.Claves[i-1].publicacion.alta(id, titulo, publicador, texto, imagen);
        }
        else{
            nodo.Claves[i-1].usuarios.insertarPublicacion(nodo.Claves[i-1].usuarios.root, correo, id, titulo, publicador, texto, imagen);
        }
               
    }
    
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Inserta en la lista de eventos del AVL del arbol B
void insertarAVLEvento(String x,String correo,int id,String evento,String fecha,String direccion){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0||nodo.Claves[i-1].user.compareTo(x)==0){
        if(x.compareTo(correo)==0){
            nodo.Claves[i-1].evento.alta(id, evento, fecha, direccion,"ACTIVO");
        }
        else{
            nodo.Claves[i-1].usuarios.insertarEvento(nodo.Claves[i-1].usuarios.root, correo, id, evento, fecha, direccion);
        }
               
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

void eliminarAVLPublicacion(String x,String correo,int id){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0||nodo.Claves[i-1].user.compareTo(x)==0){
        if(x.compareTo(correo)==0){
        nodo.Claves[i-1].publicacion.delete(id);
        }
    }
    else{
        nodo.Claves[i-1].usuarios.eliminarPublicacion(nodo.Claves[i-1].usuarios.root, correo, id);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


void cancelarAVLEvento(String x,String correo,int id){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0||nodo.Claves[i-1].user.compareTo(x)==0){
        if(x.compareTo(correo)==0){
        nodo.Claves[i-1].evento.cancelar(id);
        }
    }
    else{
        nodo.Claves[i-1].usuarios.cancelarEvento(nodo.Claves[i-1].usuarios.root, correo, id);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

void graficarAVL(String x,String nombre,String ruta){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.GraphAVL(nodo.Claves[i-1].usuarios.root, nombre,ruta);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


void graficarAVLPublicacion(String x,String correo,String ruta,String nombre){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.PublicacionxUsuario(nodo.Claves[i-1].usuarios.root, correo, ruta, nombre);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


void graficarAVLEvento(String x,String correo,String ruta,String nombre){
int i=0;
Bnodo nodo=p;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.EventoxUsuario(nodo.Claves[i-1].usuarios.root, correo, ruta, nombre);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Da los valores del nodo del arbol B
void verificarUser(String x){
int i=0;
Bnodo nodo=p;
bandera = false;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].user.compareTo(x)==0){
        bandera = true;
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}

//Da los valores del nodo del arbol B
void Login(String x,String password){
int i=0;
Bnodo nodo=p;
banderalog = false;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        if(nodo.Claves[i-1].password.compareTo(password)==0){
            banderalog = true;
        }
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


//Da los valores del nodo del arbol B
void mostrarPublicacion(String x){
int i=0;
Bnodo nodo=p;
banderalog = false;
publicacion="";
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.verPublicacion(nodo.Claves[i-1].usuarios.root);
        publicacion = nodo.Claves[i-1].usuarios.publicacion+nodo.Claves[i-1].publicacion.imprimir(); 
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


//Da los valores del nodo del arbol B
void mostrarPublicacionAndroid(String x){
int i=0;
Bnodo nodo=p;
banderalog = false;
publicacion="";
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.verPublicacionAndroid(nodo.Claves[i-1].usuarios.root);
        publicacion = nodo.Claves[i-1].usuarios.publicacion+nodo.Claves[i-1].publicacion.imprimirAndroid();
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}



void mostrarEvento(String x){
int i=0;
Bnodo nodo=p;
banderalog = false;
evento = "";
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.verEvento(nodo.Claves[i-1].usuarios.root);
        evento = nodo.Claves[i-1].usuarios.evento+nodo.Claves[i-1].evento.imprimir();
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


void mostrarEventoAndroid(String x){
int i=0;
Bnodo nodo=p;
evento="";
banderalog = false;
ListaSimpleB Pila = new ListaSimpleB();
do{
i=0;
while (!Vacio(nodo)){
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
if (!Pila.VaciaLista()){
i=Pila.UltimoNodo.indice;
nodo=Pila.UltimoNodo.datos;
Pila.EliminaFinal();
i++;
if (i <= nodo.Cuentas){
    if(nodo.Claves[i-1].correo.compareTo(x)==0 || nodo.Claves[i-1].user.compareTo(x)==0){
        nodo.Claves[i-1].usuarios.verEventoAndroid(nodo.Claves[i-1].usuarios.root);
        //System.out.println("evento antes "+evento);
        evento =nodo.Claves[i-1].usuarios.evento+nodo.Claves[i-1].evento.imprimirAndroid();
        //System.out.println("evento despues "+evento);
    }
if (i < nodo.Cuentas)
Pila.InsertaFinal(nodo, i);
nodo=nodo.Ramas[i];
}
}
}
while (!Pila.VaciaLista() || !Vacio(nodo));
}


public void GraficarArbolB(String ruta){
            Bnodo arbol = p;
            String codigo="";
            File f;
            FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \"ARBOL B\"");
            pw.write("node [shape=record];\n");
	    pw.write("rankdir=TD; \n"); 
            codigo = codigo + GetDeclNodo(arbol);
            codigo = codigo + GetDeclaraciones(arbol,codigo);
            codigo = codigo + GetEnlaces(arbol,codigo);
            pw.write(codigo);
            pw.write("}\n");
	    pw.close();
	    bw.close();
	    }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}

public String GetDeclNodo(Bnodo actual)
{
    String codigo="";
    try{
               if (actual!=null)
               {
                   String s;
                   System.out.println(      " cuentas "+actual.Cuentas);
                   
                   s=actual.Claves[0].nump+"";
                   codigo+="\"node"+s+"\" [ label= \" <r0> |";
                   for (int i=0;i<=actual.Cuentas-1;i++)
                   {
                       System.out.println(      "       "+actual.Claves[i].nump); 
                       String v;
                       v=i+1+"";
                       if (i==actual.Cuentas-1)
                       {
                               codigo+="<f"+v+">";
                               String clave;
                               clave=actual.Claves[i].nump+"";
                               //codigo+=clave.str();
                               //codigo+="ID: "+clave+" \\n Titulo: "+actual.Claves[i].nump;
                               codigo+=" Correo: "+actual.Claves[i].correo+"\\n Nickname: "+actual.Claves[i].user+"\\n Password: "+actual.Claves[i].password+"\\n Edad: "+actual.Claves[i].edad+"\\n Genero: "+actual.Claves[i].genero+"\\n Estado: "+actual.Claves[i].estado+"\\n Pais: "+actual.Claves[i].pais;
                              
                               String v1;
                               v1=i+1+"";
                               codigo+="| <r"+v +"> ";
                       }
                       else
                       {
                               codigo+=" <f"+v+">";
                               if (i<actual.Cuentas)
                               {
                                   String clave;
                                   clave=actual.Claves[i].nump+"";

                                   //codigo+=clave.str();
                                  //codigo+="ID: "+clave+" \\n Titulo: "+actual.Claves[i].nump;
                                   codigo+=" Correo: "+actual.Claves[i].correo+"\\n Nickname: "+actual.Claves[i].user+"\\n Password: "+actual.Claves[i].password+"\\n Edad: "+actual.Claves[i].edad+"\\n Genero: "+actual.Claves[i].genero+"\\n Estado: "+actual.Claves[i].estado+"\\n Pais: "+actual.Claves[i].pais;
                               }
                               String v1;
                               v1=i+1+"";
                               codigo+="| <r"+v+"> |";
                       }

                   }
                   codigo+="\" ]; \n";
                    //cout<<"Retorno codigo"<<codigo<<endl;
               }
    }
    catch(Exception ex){
    
    }
    return codigo;
}


public String GetDeclaraciones(Bnodo actual,String codigo)
        
        
{
    if (actual!=null)
    {
        for (int i=0; i<=actual.Cuentas; i++){
            codigo+=GetDeclNodo(actual.Ramas[i]);
        }
        codigo=GetDeclaraciones(actual.Ramas[0],codigo);
        codigo=GetDeclaraciones(actual.Ramas[1],codigo);
        codigo=GetDeclaraciones(actual.Ramas[2],codigo);
        codigo=GetDeclaraciones(actual.Ramas[3],codigo);
        codigo=GetDeclaraciones(actual.Ramas[4],codigo);

        
    }
    return codigo;
}



public String Enlazar(Bnodo hijo,Bnodo padre,String codigo,int pos)
{
    try{
        if (hijo!=null && padre!=null)
               {
                   String codpadre;
                   String codhijo;
                   String posicion;
                   codpadre=padre.Claves[0].nump+"";
                   codhijo=hijo.Claves[0].nump+"";
                   posicion=pos+"";
                   codigo+="\"node"+codpadre+"\":r"+posicion+"->\"node"+codhijo+"\":f2; \n";
                   //cout<<"Enlace "<<codigo<<endl;
               }
    }
    catch(Exception ex){}
  
               return codigo;
}

public String GetEnlaces(Bnodo actual,String codigo)
           {
               if (actual!=null)
               {
                   for (int i=0; i<=actual.Cuentas; i++)
                   codigo+=Enlazar(actual.Ramas[i],actual,"",i);
                   for (int i=0; i<=actual.Cuentas; i++)
                   codigo=GetEnlaces(actual.Ramas[i],codigo);

               }
               return codigo;
}

}
