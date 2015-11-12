// Program simulates the dynamics of a bank line under different
//    assumptions about arrival frequency and number of tellers.
// Uses a queue to simulate the waiting line of customers; each
//    entry in the queue represents the time of arrival of a 
//    customer in the line.  

import java.io.*;
import structure.*;
import com.mw.io.*;
import java.util.*;   // for Random number generating function
import java.util.Scanner;


        
public class ProyectoFinal extends Object{

     public static void main (String args[]) {

	    int MaxTime = 500;      //  The number of one minute loops in the program. 
		int time = 0;           //  The current time [0..MaxTime] 
		float Chance = (float)-1.0;   //  prob. of entering at each minute 
		Random X = new Random();      // X is a series of random numbers with seed == 0;
        X.setSeed(0);                 // this series repeats for different program runs
       
		int[] Teller = new int[10];       //  Maximum of 10 tellers. 
	    int numTellers = 0;               //  The number of tellers on duty. 
		int MinTellerTime = 0;            //  minimum minutes per Teller 
		int MaxTellerTime = 0;            //  maximum minutes per Teller 

		Queue Line = new QueueList(); //  The line of customers. 
		float avelength = 0;          //  Average waiting time per customer. 
		int maxlength = 0;            //  Max length of waiting line. 
		Integer person;               //  Person waiting; identified by time of arrival. 

		int waittime = 0;       //  Total time spent waiting by everyone. 
		int peopleserved = 0;   //  The MacDonald's Factor. 
		int i;

    SystemInput sysIn = new SystemInput();
    ReadStream r = new ReadStream();

    //  Get probability 
		System.out.println("Enter probability of someone entering each minute: ");
		Chance = r.readFloat();
		System.out.println(Chance);
	
    //  Get the number of bank tellers 
		System.out.println("Enter the number of bank tellers: ");
		numTellers = r.readInt();
		System.out.println(numTellers);

    //  Get minimum teller minutes per customer 
		System.out.println("Enter the minimum teller time:");
		MinTellerTime = r.readInt();
		System.out.println(MinTellerTime);

    //  Get maximum teller minutes per customer 
		System.out.println("Enter the maximum teller time: ");
		MaxTellerTime = r.readInt();
		System.out.println(MaxTellerTime);

	System.out.println("Computing...");

    //  Initialize the starting time. 
	time = 0;

    //  Initialize the Teller array.  The value of each element in the Teller    
    //  array is the time when the Teller can serve the next customer.  Whenever 
    //  this equals the time counter, the Teller can help a customer at that time. 
	for (i = 0; i < numTellers; i++) 
		Teller[i] = 0;

    //  Right now, no time has been spent waiting and noone has been served. 
	waittime = 0;
	peopleserved = 0;
	avelength = 0;
	maxlength = 0;

	while (time < MaxTime) {
        //  Display the queue
   //     if (!Line.isEmpty())
   //      	System.out.println("Time = " + time + " The queue = " + Line.toString());

		if (X.nextFloat() <= Chance) {
        	//  Did someone just walk in?  If so, put the person in line.
			person = new Integer(time);
			Line.enqueue(person);
		}

        //  Someone is waiting in line, so try to serve that person. 
		if (Line.size() > 0) {  
			for (i = 0; i < numTellers; i++)  //  Check for an open Teller. 
				if (Teller[i] <= time)
				   break;
			if (i < numTellers) {             //  If so, serve next person in line 
            //  Keep track of the waiting time. 
				waittime = waittime + time - ((Integer)Line.peek()).intValue();
				Line.dequeue();               //  Remove the person from the line. 
				peopleserved++;               //  Keep track of the people served. 
            //  Occupy the Teller for a random number of minutes. 
				Teller[i] = time + MinTellerTime
					        + Math.abs(X.nextInt()) % (MaxTellerTime - MinTellerTime + 1);
			}
		}
	    //  Compute the average and maximum waiting line length. 
		avelength = (time * avelength + Line.size()) / (time + 1);
		if (Line.size() > maxlength) 
			maxlength = Line.size();
		time++;                          //  Keep track of the time. 
	} // end while loop

	System.out.println();
	System.out.println("Sample Space:         " + MaxTime + " minutes");
	System.out.println("Number of Tellers:    " + numTellers);
	System.out.println("People Served:        " + peopleserved + " people");
	if (peopleserved > 0) 
		System.out.println("Average Waiting Time: " + waittime / peopleserved + " minutes");
	System.out.println("Average Line Length:  " + Math.round(avelength) + " people");
	System.out.println("Maximum Line Length:  " + maxlength + " people");
  }
}