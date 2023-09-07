package cozentus;
abstract class Marks{
	public abstract double getMarks();
}
class A extends Marks{
	int a, b,c;
  A(int a , int b ,int c){
	  this.a=a;
	  this.b=b;
	  this.c=c;
  }
  public double getMarks() {
	  int res = a+b+c;
	  double per = (res/300.0)*100;
	  return per;
	 
  }
}
class B extends Marks{
	
	int a , b , c ,d;
	B(int a , int b ,int c , int d){
		 this.a=a;
		  this.b=b;
		  this.c=c;
		  this.d=d;
		  
	  }
	public double getMarks() {
		  int res = a+b+c+d;
		 double per = (res/400.0)*100;
		return per;
	  }
	
}
public class Test5 {

	public static void main(String[] args) {
		A obj1 = new A(10,20,30);
		B obj2 = new B(20,3,50,89);
		
		System.out.println("A student marks: "+obj1.getMarks()+"%"); 
		System.out.println("B student marks: "+obj2.getMarks()+"%"); 

	}

}
