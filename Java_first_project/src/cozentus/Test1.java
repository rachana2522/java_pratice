package cozentus;

abstract class abclass{
	abclass(int a , int b){
		System.out.println("Hello world");
	}
	
	abstract public void fun();
}
class child extends abclass{
	child (int a, int b){
	super(a,b);
}
public void fun2() {
	System.out.println("Hii Shriram");
}
@Override
public void fun() {
	// TODO Auto-generated method stub
	
}
}
public class Test1 {

	public static void main(String[] args) {
		child obj = new child(1, 2);
		obj.fun();
		obj.fun2();
	}
}

