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
public class time {
        // Cima Del Nodo
    	nodotime top;
	public time()
	{
            // 
	 	top=null;
	}	
	public void instime(int c,int t1)
	{       // Inicia El Tiempo 
		nodotime nuevo=new nodotime(c,t1); 
	  	nodotime aux=null;
	  	aux=top;
		  	if (top==null)
		  	{
		  	   top=nuevo;	
		  	}
		  	else
		  	{
		  		while (aux.next!=null)
		  	 	{	
		  	 		aux=aux.next;
		  	 	}
		  	 	aux.next=nuevo;
		    }	
		  
	}	
	        public int busca(int i)
	{       //Asigna El Tiempo Al Cajero
		nodotime aux= null;
 		aux=top;
 		int acum=0;
 		
 		do
 		{
 			if(aux.cajero==i)
 			{
 				acum=acum+aux.time1;	
 			}
 			aux=aux.next;
 		}while(aux.next!=null);
 		return (acum);
	}
}
