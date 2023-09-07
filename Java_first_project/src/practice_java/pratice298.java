///Create a method that calculates the factorial of a positive integer and might throw an 'IllegalArgumentException'.
//Use the 'throws' keyword in the method signature to indicate this exception. Show how to call this method and handle the exception using a try-catch block.

package practice_java;


class factorialcalculater{
	public static  int calculatefactorial(int n )throws IllegalArgumentException{
		if(n<0) {
			throw new IllegalArgumentException("input must be positive interger");}
	if(n==0|| n==1) {
		return 1;
	}
	return  n* calculatefactorial(n-1);
	
	}
}

public class pratice298 {
	public static void main(String[] args) {
		try {
			int number = 5;
			int factorial = factorialcalculater.calculatefactorial(number);
		System.out.println("factorial of" + number +"is:"+factorial);
		
		}
		catch
			(IllegalArgumentException e) {
			System.out.println("Exception caught:"+e.getMessage());
		
	
		}

                try {
	             int number = -3;
	             int factorial = factorialcalculater.calculatefactorial(number);
                  System.out.println("factorial of" + number +"is:"+factorial);

                   }
                       catch
	           (IllegalArgumentException e) {
	             System.out.println("Exception caught:"+e.getMessage());

}
}
}



	
