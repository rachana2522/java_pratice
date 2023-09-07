//Create a method that calculates the factorial of a positive integer.If the input is negative, throw an 'IllegalArgumentException' with a message "Negative input not allowed".Implement the method and handle the exception using a try-catch block.

package practice_java;


	class NegativeInputException extends IllegalArgumentException {
	    public NegativeInputException(String message) {
	        super(message);
	    }
	}

	public class pratice2813 {
	    public static int calculateFactorial(int n) throws NegativeInputException {
	        if (n < 0) {
	            throw new NegativeInputException("Negative input not allowed");
	        }

	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        int factorial = 1;
	        for (int i = 2; i <= n; i++) {
	            factorial *= i;
	        }

	        return factorial;
	    }

	    public static void main(String[] args) {
	        try {
	            int result = calculateFactorial(5);
	            System.out.println("Factorial: " + result);

	            int negativeResult = calculateFactorial(-3); 
	            System.out.println("Factorial: " + negativeResult);
	        } catch (NegativeInputException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}

