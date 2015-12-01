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
public class colaca {
    	nodoca pri,ult;
	{
		pri=null;
		ult=null;
	}
	
	public void inscolcaj(int i,int da)
		 {
		 	nodoca nuevo=new nodoca(i,da); 
		  	nodoca aux=null;
		  	aux=pri;
		  	if (pri==null)
		  	{
		  	   pri=nuevo;	
		  	}
		  	else
		  	{
		  		while (aux.sig!=null)
		  	 	{	
		  	 		aux=aux.sig;
		  	 	}
		  	 	aux.sig=nuevo;
		    }
		     
		 } 
	public void impca()
	{
		nodoca n=pri;
		do
		{
			System.out.print("-- Cajero>>>("+n.cajero+") "+"Cliente >> "+n.dato1);
			System.out.print("\n");
		
			if (n.sig!=null)
			{
				System.out.print("");
			}
		  n=n.sig;
		  
		}while(n!=null);
		System.out.print("\n");
	}
	public int busca(int i)
	{
		nodoca aux= null;
 		aux=pri;
 		int cont=0;
 		
 		do
 		{
 			if(aux.cajero==i)
 			{
 				cont++;	
 			}
 			aux=aux.sig;
 		}while(aux.sig!=null);
 		return (cont);
	}
	public void usca(int i)
	{
		nodoca n=pri;
		while(n!=null)
		{
			
		
			if(n.cajero==i)
 			{
 			 System.out.print(n.dato1);		
	 			if(n.sig!=null)
	 			{
	 				System.out.print(",");
	 			}
 			}
 		
		  n=n.sig;
		  
		}
		System.out.print("\n");
	}
}
