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
public class nodotime {
        // Declaracion De Las Variables 
    	int cajero;
	int time1;

	nodotime next;  
	
	public nodotime(int c, int t1) 
	{
		cajero=c;
		time1=t1;
		next=null;
	}
}
