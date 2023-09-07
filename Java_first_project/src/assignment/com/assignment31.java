package assignment.com;
abstract class person1{
	abstract void eat();
	abstract void exercise();
}
class Athlete extends person1{
	void eat() {
		System.out.println("an athelete eats a balanced");
	}
	void exercise() {
		System.out.println("an athelete folows a rigous");
	}
}
class Lazyperson extends person1{
	 void eat() {
	        System.out.println("A lazy person enjoys comfort food and snacks throughout the day.");
	    }

	    void exercise() {
	        System.out.println("A lazy person prefers to relax and avoids strenuous physical activities.");
	    }
	}
public class assignment31 {

	public static void main(String args[]) {
		person1 athelete = new Athlete();
		Lazyperson Lazyperson = new Lazyperson();
		System.out.println("athelete routine");
		athelete.eat();
		athelete.exercise();
		System.out.println("lazy person");
		Lazyperson.eat();
		Lazyperson.exercise();
	}
}
