package oopsconcept;

//Concept of super method
class A {
	void fun (){
		System.out.println("In A");
	}
}

 class Base extends A  {
	void fun(){
		super.fun();
		System.out.println("Base fun() called");
	}
}

class Derived extends Base {
	void fun(){
		super.fun();
		System.out.println("Derived fun() called");
	}
}

class conceptsuperclass {
	public static void main(String args[]) {
		Base b = new Derived();
	   // A a = new Base();
		//a.fun();
		b.fun();
	}
}
