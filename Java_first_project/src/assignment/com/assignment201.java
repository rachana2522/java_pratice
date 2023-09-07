//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

package assignment.com;
class Vehicle5 {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle5(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck5 extends Vehicle5 {
    private double fuelEfficiency; // miles per gallon

    public Truck5(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
    }

    public double calculateDistance(double fuel) {
        return fuelEfficiency * fuel;
    }

    public double getMaxSpeed() {
        return 70; // Example maximum speed for a truck
    }
}

class Car5 extends Vehicle5 {
    private double fuelEfficiency; // miles per gallon

    public Car5(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
    }

    public double calculateDistance(double fuel) {
        return fuelEfficiency * fuel;
    }

    public double getMaxSpeed() {
        return 120; // Example maximum speed for a car
    }
}

class Motorcycle5 extends Vehicle5 {
    private double fuelEfficiency; // miles per gallon

    public Motorcycle5(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
    }

    public double calculateDistance(double fuel) {
        return fuelEfficiency * fuel;
    }

    public double getMaxSpeed() {
        return 160; // Example maximum speed for a motorcycle
    }
}

public class assignment201 {

    public static void main(String[] args) {
        Truck5 truck = new Truck5("Ford", "F-150", 2022, "Diesel", 15.5);
        Car5 car = new Car5("Toyota", "Corolla", 2022, "Gasoline", 30.0);
        Motorcycle5 motorcycle = new Motorcycle5("Harley-Davidson", "Sportster", 2022, "Gasoline", 45.0);

        System.out.println("Truck Info:");
        truck.displayInfo();
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph");
        System.out.println("Distance Traveled on 10 gallons of fuel: " + truck.calculateDistance(10) + " miles\n");

        System.out.println("Car Info:");
        car.displayInfo();
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph");
        System.out.println("Distance Traveled on 5 gallons of fuel: " + car.calculateDistance(5) + " miles\n");

        System.out.println("Motorcycle Info:");
        motorcycle.displayInfo();
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
        System.out.println("Distance Traveled on 3 gallons of fuel: " + motorcycle.calculateDistance(3) + " miles");
    }
}

