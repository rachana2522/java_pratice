//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance travelled, and maximum speed

package assignment.com;
class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
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

    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }

    public double calculateDistanceTraveled(double fuelConsumed, double fuelEfficiency) {
        return fuelConsumed * fuelEfficiency;
    }

    public double calculateMaxSpeed() {
        return 0; 
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateMaxSpeed() {
        return 100; 
    }
}

class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateMaxSpeed() {
        return 150; 
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 180; 
    }
}       

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = {
	            new Truck("Ford", "F-150", 2022, "Diesel", 2000),
	            new Car("Toyota", "Camry", 2022, "Gasoline", 5),
	            new Motorcycle("Davidson", "Sportster", 2022, "Gasoline")
	        };

	        for (Vehicle vehicle : vehicles) {
	            System.out.println("Vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
	            System.out.println("Max Speed: " + vehicle.calculateMaxSpeed() + " km/h");
	            System.out.println("-----------------------------");
	        }
	    }
	
	}
