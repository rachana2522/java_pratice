//. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title
package assignment.com;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }

	public String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public void work() {
		// TODO Auto-generated method stub
		
	}
}

public class assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("John", "Doe");
        Employee employee = new Employee("Jane", "Smith", 12345, "HR");

        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}

