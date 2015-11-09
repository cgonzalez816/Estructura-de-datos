/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author treznor
 */

import java.util.Scanner
        
public class ProyectoFinal extends Object{

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner S = new Scanner(System.in);
    
    int X;
    String[] nombre = new String[10];
    
    nombre[0] = "Ándres";
     nombre[1] = "Allan";
      nombre[2] = "Melissa";
       nombre[3] = "Cristina";
        nombre[4] = "Diego";
         nombre[5] = "María";
          nombre[6] = "Olger";
           nombre[7] = "Pablo";
            nombre[8] = "Juan";
             nombre[9] = "Estefani";

             
             
    System.out.println(" Digite El Numero de Cajeros ");
    System.out.println(" Mayor Que Cero y Menor a Cinco ")
    X=S.nextInt();
  
    if (X>=5){
        System.out.println(" Supera el numero de cajeros autorizados ");    
      
    }
    if (X<=0){
        System.out.println(" El numero de cajeros es inferior al autorizados ")
    }
    
       
        
    
    }
    
        
}
