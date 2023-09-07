//.Write a Java program to create an abstract class Shape2D with abstract methods draw () and resize (). Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.

package assignment.com;
abstract class Shape2D {
    abstract void draw();
    abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }

    @Override
    void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Resized Rectangle by a factor of " + factor);
    }
}

class Circle4 extends Shape2D {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println("Resized Circle by a factor of " + factor);
    }
}

public class assignment30 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle4 circle = new Circle4(4);

        rectangle.draw();
        rectangle.resize(1.5);
        
        circle.draw();
        circle.resize(2);
    }
}


