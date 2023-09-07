package array.example;

public class main {
   public static  void main(String[] args) {
	     // Create an instance of Person
		   empdetils person = new empdetils();

	     // Set values using setter methods
	     person.setName("Arthfael Viktorija");
	     person.setAge(25);
	     person.setAddress("india");
	     person.setCountry("USA");

	     // Get values using getter methods
	     String name = person.getName();
	     int age = person.getAge();
	     String address = person.getAddress();
	     String country = person.getCountry();

	     // Print the values
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Adress:"+address);
	     System.out.println("Country: " + country);
	   }
	 }


