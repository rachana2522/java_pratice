package cozentus;
abstract class Area{
	abstract public double area();
}
class Rectangle extends Area{
    double length = 0;
    double width = 0;
    double area;
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	public double area() {
		area = length*width;
		return area;
	}
	
}
class Square extends Area{
    double length = 0;
    
    double area;
	Square(int length){
		this.length=length;
		
	}
	public double area() {
		area = length*length;
		return area;
	}
	
}
class Circle extends Area{
    double length = 0;
    
    double area;
	Circle(int length){
		this.length=length;
		
	}
	public double area() {
		double square = length * length;
		area = (3.14)*square;
		return area;
	}
	
}


public class Test8 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(4,5);
		Square obj1 = new Square(5);
		Circle obj2 = new Circle(6);
		
		System.out.println("Area of Rectangle: "+obj.area());
		System.out.println("Area of Square: "+obj1.area());
		System.out.println("Area of Circle: "+obj2.area());
		
		
		
	}

}
