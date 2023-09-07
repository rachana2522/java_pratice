//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
package practice_java;
	abstract class Employee {
	    protected String name;
	    protected int employeeId;
	    
	    public Employee(String name, int employeeId) {
	        this.name = name;
	        this.employeeId = employeeId;
	    }
	    
	    // Abstract method to calculate salary
	    public abstract double calculateSalary();
	    
	    // Abstract method to display employee information
	    public abstract void displayInfo();
	}

	class Manager extends Employee {
	    private double baseSalary;
	    private double bonus;

	    public Manager(String name, int employeeId, double baseSalary, double bonus) {
	        super(name, employeeId);
	        this.baseSalary = baseSalary;
	        this.bonus = bonus;
	    }

	    @Override
	    public double calculateSalary() {
	        return baseSalary + bonus;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Manager Information:");
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Base Salary: $" + baseSalary);
	        System.out.println("Bonus: $" + bonus);
	        System.out.println("Total Salary: $" + calculateSalary());
	    }
	}

	class Programmer extends Employee {
	    private double hourlyRate;
	    private int hoursWorked;

	    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
	        super(name, employeeId);
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
	    }

	    @Override
	    public double calculateSalary() {
	        return hourlyRate * hoursWorked;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Programmer Information:");
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Hourly Rate: $" + hourlyRate);
	        System.out.println("Hours Worked: " + hoursWorked);
	        System.out.println("Total Salary: $" + calculateSalary());
	    }
	}

	public class qs5 {
	    public static void main(String[] args) {
	        Manager manager = new Manager("John Doe", 1001, 50000, 10000);
	        manager.displayInfo();
	        
	        System.out.println();
	        
	        Programmer programmer = new Programmer("Jane Smith", 2001, 50, 160);
	        programmer.displayInfo();
	    }
	}

