package cozentus;


abstract class parent{
abstract void message();
}
class firstsubxclass extends parent{
	void message() {
	System.out.println("This is first subclass");
}
}

class secondsubxclass extends parent{
	void message() {
		System.out.println("This is second subclass");
	}
}
public class Test3 {

	public static void main(String ... args) {
		
		firstsubxclass firstobj=new firstsubxclass ();
		secondsubxclass secondobj= new secondsubxclass();
		firstobj.message();
		secondobj.message();
	
//1.Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
		
		
	   }

}
