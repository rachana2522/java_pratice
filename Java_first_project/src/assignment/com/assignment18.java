//Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.

package assignment.com;
class Vehicle6 {
    void startEngine() {
        System.out.println("Starting the engine of the vehicle");
    }

    void stopEngine() {
        System.out.println("Stopping the engine of the vehicle");
    }
}

class Car9 extends Vehicle6 {
    @Override
    void startEngine() {
        System.out.println("Starting the car's engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car's engine");
    }
}

class Motorcycle9 extends Vehicle6 {
    @Override
    void startEngine() {
        System.out.println("Starting the motorcycle's engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the motorcycle's engine");
    }
}

public class assignment18 {


    public static void main(String[] args) {
        Vehicle6 vehicle = new Vehicle6();
        Car9 car = new Car9();
        Motorcycle9 motorcycle = new Motorcycle9();
        
        vehicle.startEngine();
        vehicle.stopEngine();
        
        System.out.println();
        
        car.startEngine();
        car.stopEngine();
        
        System.out.println();
        
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

