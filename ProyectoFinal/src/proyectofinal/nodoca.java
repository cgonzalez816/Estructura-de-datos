/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Cesar Gonzalez e ivan Arroyo
 */
public class nodoca {

    // Variables Dato1 y Cajero
    int dato1;
    int cajero;

    nodoca sig;

    public nodoca(int i, int da) {
        // Asigna El Valor de i a cajero, dato1 o Pasa a Siguiente
        cajero = i;
        dato1 = da;
        sig = null;
    }
}
