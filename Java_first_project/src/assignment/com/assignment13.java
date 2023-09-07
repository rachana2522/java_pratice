//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.
package assignment.com;

abstract class Bird{
	abstract void fly();
	abstract void makeSound();
	
}
abstract class Eagle1 extends Bird{
void fly() {
	System.out.println("Hii this is eagle");
}
void makeSound() {
	System.out.println("Hii welcome");
}
	
abstract class Hawk1 extends Bird{
	void fly() {
		System.out.println("Hii this is hawk");
	}
	void makeSound() {
		System.out.println("Hii welcome");
	}
	
}
}
public class assignment13 {

	public static <Hawk> void main(String[] args) {
		// TODO Auto-generated method stub

		 Eagle1 eagle = new Eagle1();
	     Hawk1 hawk = new Hawk1();

	     System.out.println("Eagle's Behavior:");
	     eagle.fly();
	     eagle.makeSound();

	     System.out.println("\nHawk's Behavior:");
	     hawk.fly();
	     hawk.makeSound();
}
}