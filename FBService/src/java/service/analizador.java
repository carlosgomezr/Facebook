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
public class analizador {

public void analizar(listanombre lista,String cadena){
String auxiliar = cadena +"#";
int tama = auxiliar.length();
int estado = 0;
String concatenar ="";
for(int i=0;i<tama;i++){
    String letra = String.valueOf(auxiliar.charAt(i));
    if(estado==0){
        if(letra.compareTo(";")!=0){
            concatenar = concatenar + letra;
            estado = 0;
        }else if(letra.compareTo("#")==0){
            lista.alta(concatenar);
            concatenar="";
        }
        else{
            lista.alta(concatenar);
            concatenar="";
            estado = 1;
        }
    }
    if(estado==1){
        if(letra.compareTo(";")!=0){
            concatenar = concatenar +letra;
            estado = 0;
        }
    }
}
}    
    
    
}
