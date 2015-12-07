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
public class cola {
// 

    nodo primero, ultimo;

    public cola() {
        primero = null;
        ultimo = null;

    }

    public void insertar(int d) {
        // Inserta El Dato Al Nodo
        nodo nuevo = new nodo(d);
        // Si El Primero Esta vacio Ingrasa El Dato 
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public int sacar() {
        // Saca El Dato Que Esta En El Primer Nodo
        int x;
        x = primero.dato;
        primero = primero.siguiente;
        return x;
    }

    public boolean vacia() {
        // Booleano Que Verifica Si Esta Vacia 
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        // Si El Nodo No Esta Vacio Imprime ElTotal De Los Clientes Atendidos
        nodo n = primero;
        while (n != null) {
            System.out.print(n.dato );
            if (n.siguiente != null) {
                System.out.print("*<");
            }
            // Pasa Al Siguiente 
            n = n.siguiente;

        }
        System.out.print("\n");
    }

}
