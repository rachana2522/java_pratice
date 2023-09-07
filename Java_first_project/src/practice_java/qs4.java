//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
package practice_java;

abstract class Animals{
	public abstract  void eat();
	public abstract void sleep();
}
class Lion1 extends Animals{
	public void eat() {
		System.out.println("lion okay");
		
	}
		public void sleep() {
			System.out.println("Hiii lion please sleep");
		}
		
}
		
class Tiger1 extends Animals{
			public void eat() {
				System.out.println("HII eat");
				
			}
			public void sleep() {
				System.out.println("Hii sleep then eat");
			}
			
		}
			
 class Deer1 extends Animals{
				public void eat() {
					System.out.println("HIII DEER");
				}
				public void sleep() {
					System.out.println("Hii please sleep deer");
				}
				
				
			
			
	}

public class qs4 {
	
	public static void main(String args[]) {
		Lion1 obj = new Lion1();
    	Tiger1 obj1 = new Tiger1();
		Deer1  obj2 = new Deer1();
		obj.eat();
		obj.sleep();
		System.out.println();
		obj1.eat();
		obj1.sleep();
		System.out.println();
		obj2.eat();
		obj2.sleep();
		System.out.println();
	}
	

}


