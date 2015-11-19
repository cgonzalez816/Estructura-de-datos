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
public class cola {
    
	nodo primero, ultimo;
	
	public cola()
	{
		primero=null;
		ultimo=null;
		
	}
	
	public void insertar(int d)
	{
		nodo nuevo=new nodo(d);
		
		if(primero==null)
		{
			primero=nuevo;
			ultimo=nuevo;
		}
		else
		{
			ultimo.siguiente=nuevo;
			ultimo=nuevo;
		}
	}
	
	public int sacar()
	{
		int x;
		x=primero.dato;
	    primero=primero.siguiente;
	    return x;
	}
	
	public boolean vacia()
	{
		if(primero==null)
			return true;
		else
			return false;
	}
	
	public void print()
	{
		nodo n=primero;
		while(n!=null)
		{
			System.out.print(n.dato);
			if (n.siguiente!=null)
			{
				System.out.print("*<");
			}
		  n=n.siguiente;
		  
		}
		System.out.print("\n");
	}
	
}
