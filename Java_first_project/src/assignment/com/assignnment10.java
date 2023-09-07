//. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
package assignment.com;

class Employee8{
    private String name;
    private double salary;

    public Employee8(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class HRManager extends Employee8 {

    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + getName() + " is managing HR operations.");
    }

    public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEmployee(Employee employee) {
        System.out.println("HR Manager " + getName() + " added employee " + employee.getName());
    }

	public void addEmployee(Employee8 employee1) {
		// TODO Auto-generated method stub
		
	}
}

public class assignnment10 {
    public static void main(String[] args) {
        Employee8 employee1 = new Employee8("John", 50000);
        HRManager hrManager = new HRManager("Jane", 70000);

        employee1.work();
        System.out.println("Employee 1 Salary: $" + employee1.getSalary());

        hrManager.work();
        hrManager.addEmployee(employee1);
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
    }
}


	