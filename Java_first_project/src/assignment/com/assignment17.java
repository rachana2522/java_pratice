//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder
package assignment.com;
abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Cylinder");
    }

    @Override
    double calculateArea() {
        double baseArea = super.calculateArea();
        double lateralSurfaceArea = 2 * Math.PI * getRadius() * height;
        double topAndBottomArea = 2 * super.calculateArea();

        return lateralSurfaceArea + topAndBottomArea;
    }

	private int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class assignment17 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(3, 7);

        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());

        System.out.println();

        cylinder.draw();
        System.out.println("Cylinder Surface Area: " + cylinder.calculateArea());
    }
}


