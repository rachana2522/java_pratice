//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
package practice_java;
import java.util.Scanner;

abstract class Shape{
	abstract public double area();
	abstract public double perimeter();
	Scanner sc = new Scanner(System.in);
}

class Triangle extends Shape{
	public double area() {
		
		double b , h, a;
		System.out.println("Enter b of Triangle: ");
		b = sc.nextDouble();
		System.out.println("Enter h of Triangle ");
        h = sc.nextDouble();
        
        a = (0.5 * b * h);
		return a;		
	}
	public double perimeter() {
		double a, b ,c , p;
		System.out.println("Enter one side of Triangle: ");
		a = sc.nextDouble();
		System.out.println("Enter second side of TriangleL ");
        b = sc.nextDouble();
        System.out.println("Enter third side of TriangleL ");
        c = sc.nextDouble();
        
        p = a+b+c;
        return p;
		
	}
}

class Circle extends Shape{
	public double area() {
		double r , a;
		System.out.println("Enter radius of circle ");
		r = sc.nextDouble();
		a = 3.14 * r * r;
		return a;
	}
	public double perimeter() {
		double r,p;
		System.out.println("Enter radius of circle");
		r = sc.nextDouble();
		p = 2 * 3.14 * r;
		return p;
		
	}
}

public class qs2 {

	public static void main(String[] args) {
		System.out.println("Enter 1 for triangle and 2 for circle and 3 for Stop");
		Scanner sc = new Scanner(System.in);
		Triangle tl = new Triangle();
		Circle cr = new Circle();
		int choice = sc.nextInt();
		while(true) {
		switch(choice) {
		
		case 1:
			while(true) {
			System.out.println("Enter 1.1 for area and 1.2 for perimeter of triangle and 1.3 for exit");
			String choice_triangle = sc.next();
			switch(choice_triangle) {
			case "1.1":
				System.out.println("Area of Triangle: "+tl.area());
				
			    break;
			case "1.2":
				System.out.println("Perimeter of Triangle: "+tl.perimeter());
				
				break;
					
			case "1.3":
				System.out.println("Exited from triangle");
				System.out.println("Enter 1 for triangle and 2 for circle and 3 for Stop");
				choice = sc.nextInt();
				break;
			}
			if(choice_triangle.equals("1.3")) {
				break;
			}
		}
		break;
		case 2:
			while(true) {
			System.out.println("Enter 2.1 for area and 2.2 for perimeter of circle and 2.3 for exit");
			String choice_circle = sc.next();
			switch(choice_circle) {
			case "2.1":
				System.out.println("Area of circle: "+cr.area());
				
				break;
				
			case "2.2":
				System.out.println("Perimeter of circle: "+cr.perimeter());
				
				break;
			case "2.3":
				System.out.println("Exited from circle");
				System.out.println("Enter 1 for triangle and 2 for circle and 3 for Stop");
				choice = sc.nextInt();
				break;
			 }
			if(choice_circle.equals("2.3")) {
				break;
			}
		  }
		break;	
		case 3:
			System.out.println("Exited from whole program");
			break;
 		
		}
		if(choice==3) {
			System.out.println("Exited from whole program");
			break;
		}
	}
	}

}



