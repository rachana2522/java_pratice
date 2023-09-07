//Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.
package practice_java;

abstract class GeometricShape {
 abstract double area();
 abstract double perimeter();
}


class Triangle2 extends GeometricShape {
 private double base, height, side1, side2, side3;

 public Triangle2(double base, double height, double side1, double side2, double side3) {
     this.base = base;
     this.height = height;
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 @Override
 double area() {
     return 0.5 * base * height;
 }

 @Override
 double perimeter() {
     return side1 + side2 + side3;
 }
}


class Square extends GeometricShape {
 private double side;

 public Square(double side) {
     this.side = side;
 }

 @Override
 double area() {
     return side * side;
 }

 @Override
 double perimeter() {
     return 4 * side;
 }
}

public class qs12 {
 private static GeometricShape triangle1;

public static void main(String[] args) {
     Triangle2 triangle = new Triangle2(10, 8, 7, 7, 7);
     Square square = new Square(5);

     System.out.println("Triangle's Area and Perimeter:");
     System.out.println("Area: " + triangle.area());
     System.out.println("Perimeter: " + triangle.perimeter());

     System.out.println("\nSquare's Area and Perimeter:");
     System.out.println("Area: " + square.area());
     System.out.println("Perimeter: " + square.perimeter());
 }
}



