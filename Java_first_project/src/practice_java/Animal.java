// Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

package practice_java;

abstract class Animalss {
abstract void sound() ;
}	
class lion extends Animalss{
	public void sound() {
		System.out.println("Lion barks");
	}
}

class Tiger extends Animalss{
	public void sound() {
		System.out.println("Tiger  hii");
	}
}
public class Animal {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	lion obj = new lion();
	Tiger obj1 = new Tiger();
	obj.sound();
	obj1.sound();

}
}


