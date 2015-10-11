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
public class Bnodo{
Bnodo[]Ramas = new Bnodo[5];
NodoPr[]Claves = new NodoPr[4];
int Cuentas = 0;
Bnodo(NodoPr clave){
Claves[0] = clave;
}
Bnodo(){
}
}
