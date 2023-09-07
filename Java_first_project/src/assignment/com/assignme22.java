//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

package assignment.com;
class Shape4 {
    double getPerimeter() {
        return 0.0;
    }

    double getArea() {
        return 0.0;
    }
}

class Circle4 extends Shape4 {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class assignme22 {

    public static void main(String[] args) {
        Circle4 circle = new Circle4(5);

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}


