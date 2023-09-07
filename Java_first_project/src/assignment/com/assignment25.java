//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

package assignment.com;
class Employee3 {
    private String name;
    private double salary;

    public Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager3 extends Employee3 {
    public HRManager3(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	public void HRManager(String name, double salary) {
    }

    @Override
    void work() {
        System.out.println(getName() + " is managing HR tasks.");
    }

    private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	void addEmployee(String employeeName, double employeeSalary) {
        System.out.println("New employee added: " + employeeName);
    }
}

public class assignment25 {

    public static void main(String[] args) {
        Employee3 employee = new Employee3("John Doe", 50000);
        HRManager3 hrManager = new HRManager3(null, 0);

        employee.work();
        System.out.println("Employee Salary: $" + employee.getSalary());

        System.out.println();

        hrManager.work();
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        hrManager.addEmployee("Alice Brown", 60000);
    }
}

