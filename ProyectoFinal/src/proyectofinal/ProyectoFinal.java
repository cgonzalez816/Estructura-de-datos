
// Program simulates the dynamics of a bank line under different
//    assumptions about arrival frequency and number of tellers.
// Uses a queue to simulate the waiting line of customers; each
//    entry in the queue represents the time of arrival of a 
//    customer in the line.  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*; //Llama a todos los métodos de la librería javax.swing
/**
 *
 * @author Cesar Gonzalez Y Pablo Marin
 */
public class ProyectoFinal {

//
    /**
     * @param args the command line arguments
     */
    
       	

public static void print(String x)
    {
    	System.out.print(x);
    } 
    public static int LeerEntero()
    {
    	String línea= new String(""); 
	 	try
	 	{ 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			línea = br.readLine(); 
		}catch(Exception e){ e.printStackTrace();} 
     	int ne=0;
	 	try {ne=Integer.parseInt(línea);
		}catch  (Exception e) {};
     	return(ne);		
     }
    public static String LeerCadena()
	  	{
	    String línea= new String(""); 
		try{ 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			línea = br.readLine(); 
			}catch(Exception e){ e.printStackTrace();} 
	    double ne=0;
		return(línea);		
		}
	
	public static void main (String args[])
	throws IOException
	{   String op="";
		int num,num1=15987, x=1;
		double su,su1;
		int f=0,i=1,t,c,w=0,aux=0;
		int nus=0,nca=1,ca=0,prom=0,tius;
		long t1,t2,tc1,tc2,dt;
		long r1,r2,r0;
		int s,seg,seg0,tc,act=0,promt=0;
		float min;
	
		
	do
	{   time ctime=new time ();
	    colaca cajeros=new colaca();
	    cola eterna= new cola();
		i=1;
		nca=1;
		nus=0;
		prom=0;
	     
	    print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+"\n");
	    print("$...............................................................$"+"\n");
		print("$...... SIMULACION DEL PROCESO DE ATENCION A CLIENTES POR ......$"+"\n");
		print("$........... MEDIO DE CAJEROS EN EL BANCO MONEY-FAST ...........$"+"\n");
		print("$...............................................................$"+"\n");
		print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JM$$"+"\n");
		print(">>> Digite el numero de cajeros disponibles (2-8) > ");
			
		c=LeerEntero();
		print("\n");
			do
			{	
				if ((c>=2)&&(c<=8))
					aux=1;
				else
				{	aux=0;
					print(">>> Digite una cantidad de cajeros entre 2 y 8 > ");
					c=LeerEntero();
					print("\n");
				}              
			}while (aux==0);
		
		
		  
			print(">>> Digite el tiempo (minutos) que durara la jornada de atencion a clientes > ");
			t=LeerEntero();
			print("\n");
			tius=t*60;
			
			do
			{
			  
			  eterna.insertar(i);	
			  i++; 
			}while(i<=(c+6));
			
			print("0-0-0----( ");
			eterna.print();
			print("\n");
		
		 	t1=System.currentTimeMillis();
		 	r1=(t1/1000);
		 	s=(int)r1;
		 	min=r1/60;
		 	
			do
			{
				su=(Math.random()*10000000);
				num=(int)(su);
				f=eterna.sacar();
				cajeros.inscolcaj(nca,f);
				nca++;
				nus++;
			}while(nca<=c);
			
			
			cajeros.impca();
		
			
			do
			{
				
				eterna.insertar(i);
				i++;
				
				do
				{
				  
				  tc1=System.currentTimeMillis();
				  r1=(tc1/1000);
				  seg=(int)r1;
				  
				  x=1;
				 	do
					{	su=(Math.random()*10000000);
				  		num=(int)(su);
							
					  if (num==num1)
				      {
				      	if(!eterna.vacia())
				      	{
				      	   	nus++;
				      	   	tc2=System.currentTimeMillis();
							r0=(tc2/1000);
							seg0=(int)r0;
						
							
				      	   	f=eterna.sacar();
					      	cajeros.inscolcaj(x,f);
					      	
					      	tc=(seg0-(seg-s));
					      	ctime.instime(x,tc);
					      	System.out.print("-- Cajero>>>("+x+") "+"Cliente >> "+f+"   ");
					       	print("0-0-0----( ");
					      	eterna.print();
					      	print("\n");
					      	eterna.insertar(i);
							i++;
							
					     }
				      }
					 x++;		
					}while (x<=c);	
					
				t2=System.currentTimeMillis();	
				dt=t2-t1;
		  		r2=(dt/1000);
		  		s=(int)r2;
		  		min=r2/60;
					
				}while ((s<=tius)&&(!eterna.vacia()));
			
			
			
				t2=System.currentTimeMillis();	
				dt=t2-t1;
		  		r2=(dt/1000);
		  		s=(int)r2;
		  		min=r2/60;
			}while(s<=tius);  
			
			if(s>=tius)
			{
				print("*************** | Fin de la jornada, el banco ha cerrado | **************"+"\n");
			}
			print("\n");
			
			do
			{
				x=1;
				 	do
					{	su=(Math.random()*10000000);
				  		num=(int)(su);
							
					 
				      if (num==num1)
				      {
				      	if(!eterna.vacia())
				      	{
				      	   	nus++;
				      	   	f=eterna.sacar();
					      	cajeros.inscolcaj(x,f);
					      	print("-- Cajero>>>("+x+") "+"Cliente >> "+f+"  ");
					      	print("0-0-0----( ");
					      	eterna.print();
					      	print("\n");
					      	
					     }
				      }
					 x++;		
					}while (x<=c);
		
		   }while (!eterna.vacia());
		 
		  print("\n");
		  prom=nus/c;
		  print("\n");
		  print("$$$$$$$$$$$$$$$$$$$$$- BANCO MONEY-FAST: R E P O R T E -$$$$$$$$$$$$$$$$$$$$$"+"\n");
		  print("\n");
		 
		  System.out.print("Se atendio a "+nus+" usuarios"+"\n");
		  print("\n");
		  print("=============================================================================================");
		  print("\n");
		  for(i=1;i<=c;i++)
		  {
		  	act=ctime.busca(i);
		  	ca=cajeros.busca(i);
		  	promt=(act/(ca+2));
		  		  	
		  	System.out.print("El cajero "+i+" atendio a "+ca+" usuarios, los cuales tuvieron los turnos ");
		  	cajeros.usca(i);
		  	print("\n");
		  	System.out.print("En promedio se demoro "+promt+" segundos con cada cliente" );
		  	print("\n");
		  	print("=============================================================================================");
		  	print("\n");
		  	print("\n");
		  }
		  	  
		  
		  System.out.print("El promedio de usuarios por cajero fue de: "+prom+"\n");
		  print("\n");
		    
		  print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$JM$$"+"\n");
		  print("\n");
		  
	    print("Desea simular de nuevo el proceso? S/N");
	    op=LeerCadena();
	    print("\n");
	    
	  }while (op.equals("S")||op.equals("s"));
	  
  }
        
        
     
        
  }
  
