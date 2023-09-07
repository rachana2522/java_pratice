package practice_java;

public class interitance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        interitance singleton1 = interitance.getInstance();  
		        interitance singleton2 = interitance.getInstance();  
		        if (singleton1 == singleton2) {  
		            System.out.println("Both objects are the same instance.");  
		        }  
		    }

	private static interitance getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void makeSound() {
		// TODO Auto-generated method stub
		
	}  
	
	}

