//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

package assignment.com;
abstract class Vehicle9 {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car4 extends Vehicle9 {
    @Override
    void startEngine() {
        System.out.println("Starting the Car's engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Car's engine");
    }
}

class Motorcycle4 extends Vehicle9 {
    @Override
    void startEngine() {
        System.out.println("Starting the Motorcycle's engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Motorcycle's engine");
    }
}

public class assignment15 {
    public static void main(String[] args) {
        Vehicle9 car = new Car4();
        Vehicle9 motorcycle = new Motorcycle4();
        
        car.startEngine();
        car.stopEngine();
        
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

