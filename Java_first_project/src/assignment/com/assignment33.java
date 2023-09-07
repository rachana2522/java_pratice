//Write a Java program to create a class called Employee with methods called work () and getSalary (). Create a subclass called HRManager that overrides the work () method and adds a new method called addEmployee ()
package assignment.com;
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManagero extends Employee {
    public HRManagero(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class assignment33 {

    public static void main(String[] args) {
        Employee emp = new Employee(50000.0);
        HRManagero hrManager = new HRManagero(70000.0);

        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
    }
}


