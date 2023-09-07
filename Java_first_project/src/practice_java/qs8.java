//Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.

package practice_java;
//Abstract Person class
abstract class Person {
 abstract void eat();
 abstract void exercise();
}

//Subclass Athlete
class Athlete extends Person {
 @Override
 void eat() {
     System.out.println("Athlete eats a balanced diet to fuel their training.");
 }

 @Override
 void exercise() {
     System.out.println("Athlete engages in rigorous training and exercises regularly.");
 }
}

//Subclass LazyPerson
class LazyPerson extends Person {
 @Override
 void eat() {
     System.out.println("Lazy person enjoys comfort food and snacks.");
 }

 @Override
 void exercise() {
     System.out.println("Lazy person prefers to relax and rarely exercises.");
 }
}

public class qs8 {
 public static void main(String[] args) {
     Athlete athlete = new Athlete();
     LazyPerson lazyPerson = new LazyPerson();

     System.out.println("Athlete's Routine:");
     athlete.eat();
     athlete.exercise();

     System.out.println("\nLazy Person's Routine:");
     lazyPerson.eat();
     lazyPerson.exercise();
 }
}





	