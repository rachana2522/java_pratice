//Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.
package practice_java;

abstract class Shape2D {
 abstract void draw();
 abstract void resize(double factor);
}

class Rectangle extends Shape2D {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 void draw() {
     System.out.println("Drawing a rectangle with width " + width + " and height " + height);
 }

 @Override
 void resize(double factor) {
     width *= factor;
     height *= factor;
     System.out.println("Resized rectangle to width " + width + " and height " + height);
 }
}

class Circle1 extends Shape2D {
 private double radius;

 public Circle1(double radius) {
     this.radius = radius;
 }

 @Override
 void draw() {
     System.out.println("Drawing a circle with radius " + radius);
 }

 @Override
 void resize(double factor) {
     radius *= factor;
     System.out.println("Resized circle to radius " + radius);
 }
}

public class qs10 {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(5, 3);
     Circle1 circle = new Circle1(4);

     System.out.println("Drawing and Resizing Rectangle:");
     rectangle.draw();
     rectangle.resize(1.5);

     System.out.println("\nDrawing and Resizing Circle:");
     circle.draw();
     circle.resize(2);
 }
}




