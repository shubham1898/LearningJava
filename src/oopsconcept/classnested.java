package oopsconcept;

class classnested { 
//abstractobject s1=new abstractobject();      Object of abstract class cantbe created
void outerMethod()
{ 
	System.out.println("inside outerMethod"); 
} 
static class Inner { 
	public static void main(String[] args){ 
		System.out.println("inside inner class Method"); 
	} 
} 
}

