package cozentus;
abstract class Animals{
	abstract public void cat();
	abstract public void dog();
}
  class Cat extends Animals{
	public void cat() {
		System.out.println("Cat meow");
	}

	@Override
	public void dog() {
		// TODO Auto-generated method stub
		
	}
}
class Dog extends Animals{
	public void dog() {
		System.out.println("Dog Bark");
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		
	}
}

public class Test7 {

	public static void main(String[] args) {

		
		Cat obj = new Cat();
		Dog obj1 = new Dog();
		obj.cat();
		obj1.dog();
	}

}
