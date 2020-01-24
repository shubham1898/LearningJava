
package oopsconcept;

// An abstract class with a final method
class A2 {
	void fun2 (){
		System.out.println("In A");
	}
}

abstract class Base2 extends A2 {
	void fun2(){
		System.out.println("Base fun() called");
	}
}

class Derived2 extends Base2 {
	void fun3(){
		//super.fun2();
		System.out.println("Derived fun() called");
	}
}

class abstractclassmethodcall {
	public static void main(String args[]) {
		//Base2 b2 = new Derived2();
		A2 a2 = new A2();
		Derived2 b2=new Derived2();
		a2.fun2();
		b2.fun2();           //Abstract class method called refrencing through its subclass
		//b2.fun3();
	}
}
