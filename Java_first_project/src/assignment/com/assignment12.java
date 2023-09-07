//Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape
package assignment.com;
abstract class GeometricShape{
	abstract double area();
	abstract double perimeter();
} 
class triangle extends GeometricShape{
	private double base;
	private double height;
	private double side1;
	private double side2;
	private double slide3;
	
	public triangle(double base, double height, double side1,double side2,double side3)
	{
		this.base = base;
		this.height = height;
		this.side1=side1;
		this.side2=side2;
		this.slide3=slide3;
		
	}
	double area() {
		return 0.5*base*height;
	}
	double perimeter() {
		return side1+side2+slide3;
	}
}
 class square extends GeometricShape{
	 private double side;
	 public square(int i) {
		// TODO Auto-generated constructor stub
	}
	public void Square(double side) {
		 this.side = side;
	 }
	 double area() {
		 return side*side;
	 }
	 double perimeter() {
		 return 4*side;
	 }
	
}
public class assignment12 {
	public static void main(String args[]) {
		triangle triangle = new triangle(5,8,7,7,7);
		square square = new square(6);
		System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
	}

}
