//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role

package assignment.com;
abstract class Employee0 {
    private String name;
    private int employeeId;
    
    public Employee0(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    abstract double calculateSalary();
    abstract void displayInfo();
    
    public String getName() {
        return name;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
}

class Manager extends Employee0 {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee0 {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

public class assignment16 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 101, 50000.0, 10000.0);
        Programmer programmer = new Programmer("Jane Smith", 102, 30.0, 160);

        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}

