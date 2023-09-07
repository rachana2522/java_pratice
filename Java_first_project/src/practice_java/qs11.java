//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.
package practice_java;

abstract class Bird {
 abstract void fly();
 abstract void makeSound();
}


class Eagle extends Bird {
 @Override
 void fly() {
     System.out.println("Eagle soars high in the sky with its powerful wings.");
 }

 @Override
 void makeSound() {
     System.out.println("Eagle makes a piercing and majestic screech.");
 }
}


class Hawk extends Bird {
 @Override
 void fly() {
     System.out.println("Hawk glides gracefully through the air, scanning for prey.");
 }

 @Override
 void makeSound() {
     System.out.println("Hawk emits a sharp and distinctive cry.");
 }
}

public class qs11 {
 public static void main(String[] args) {
     Eagle eagle = new Eagle();
     Hawk hawk = new Hawk();

     System.out.println("Eagle's Behavior:");
     eagle.fly();
     eagle.makeSound();

     System.out.println("\nHawk's Behavior:");
     hawk.fly();
     hawk.makeSound();
 }
}
