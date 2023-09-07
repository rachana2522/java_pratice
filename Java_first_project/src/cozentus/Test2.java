package cozentus;
// static member in java 
// static can be declared in inner class, variable , method 
// static member can be accessed by the class name instead of object 

public class Test2 {
       static int a = 56;
       void display() {
    	   a = 5;
    	   System.out.println(a);
       }
	public static void main(String[] args) {
		Test2 obj = new Test2();
		a=6;
		obj.display();

		System.out.println(a);

	}

}
