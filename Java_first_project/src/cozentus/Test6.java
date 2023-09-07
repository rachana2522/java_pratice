package cozentus;
abstract class Rachana{
	Rachana(){
		System.out.println("This is constructor");
	}
	public abstract  void a_method();
	public void non_abstract_method() {
		System.out.println("This is normal method of abstract class");
		
	}
}

class child1 extends Rachana{
	public void a_method() {
		System.out.println("This is abstract method");
	}
}



public class Test6 {

	public static void main(String[] args) {
	    child1 obj = new child1();
	    obj.a_method();
	    obj.non_abstract_method();
	}
		
}
