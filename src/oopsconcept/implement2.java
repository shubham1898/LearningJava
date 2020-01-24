package oopsconcept;

import java.io.IOException;

//An example to show that interfaces can 
//have methods from JDK 1.8 onwards 
interface In2 
{ 
	final int a = 10; 
	 static void display() 
	{ 
		System.out.println("hello"); 
	} 
} 

//A class that implements the interface. 
class implement2 implements In2 
{ 
	// Driver Code 
	public static void main (String[] args) throws IOException
	{ 
		In2.display(); 
	} 
} 
