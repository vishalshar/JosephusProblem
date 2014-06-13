//NAME : Vishal Sharma
//A01789836

import java.util.*;
public class Josephus
{
	/*
	 * Program to implement Josephus problem using Linked implemented QUEUE
	 * 
	 */
    public static void main(String[] args) 
    {
    	// Queue to store the value
    	Queue<Integer> myQueue = new LinkedList<Integer>();
    	Scanner input= new Scanner(System.in);
	    int i=0,j=0;
	    
	    try
	    {
	    
	    	// taking the number of cases
	       int iter = input.nextInt();
	       
	       for(int z=0;z<iter;z++)
	       {
	       
	    	   // Taking the number of people and number of skips
	    	   int numOfPeople = input.nextInt();
	    	   int numOfSkips =  input.nextInt();
	    	   
	    	   // adding values from 1 to N (number of people)to Queue
	    	   for(i=1; i<=numOfPeople;i++)
	    	        myQueue.add(i);
	    	        
	    	   for(i=0;myQueue.size()!=0;i++)
	    	   {
	    	   
	    		   // dequeue then enqueue the value before the skipping element
	    		   for (j = 0; j<numOfSkips; j++)
	    		   {
	    			   myQueue.add(myQueue.remove());
	    		   }
	    		   
	    		   // if it is the last element to dequeue print it and dequeue
	    		   if( myQueue.getSize() == 1)
	    		   {
	    			   System.out.println(myQueue.remove());
	    			   break;
	    		   }
	    		   
	    		   // dequeue the element on skip position
	    		   myQueue.dequeue();
	    	   }
	    	   
	    	   // reinitialize the queue
	    	   myQueue = new LinketList<Integer>();
	       }
	    }
	    
	    catch(Exception e)
	    {
	      System.out.println(e.toString());
	      System.out.println("Unhandled input...");
	    }
	    finally
	    {
	     input.close();
	    }
    }
}
