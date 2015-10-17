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
public class NodosLista{
Bnodo datos;
String letra;
int indice;
NodosLista siguiente;
NodosLista(Bnodo valor,int ind){
datos=valor;
indice=ind;
siguiente=null;
}
NodosLista (Bnodo valor,NodosLista signodo,int ind){
datos=valor;
indice=ind;
siguiente=signodo;
//letra=valor;
siguiente=null;
}
NodosLista (String valor,NodosLista signodo){
letra=valor;
siguiente=signodo;
}

NodosLista (String valor){
letra=valor;
}
}

