//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title
package assignment.com;
class Pers{
    private String firstName;
    private String lastName;

    public Pers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Empp extends Pers {
    private int employeeId;
    private String jobTitle;

    public Empp(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    int getEmployeeId() {
        return employeeId;
    }

    @Override
	public
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}


public class assignment32 {


    public static void main(String[] args) {
        Pers person = new Pers("John", "Doe");
        Empp employee = new Empp("Jane", "Smith", 101, "Software Engineer");

        System.out.println("Person:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        System.out.println("\nEmployee:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name with Job Title: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}



