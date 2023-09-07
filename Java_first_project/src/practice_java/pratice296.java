//Create a custom exception class called 'InvalidInputException'. Write a method that accepts a number as input and throws 'InvalidInputException' if the number is negative. Use the 'throws' keyword to declare this custom exception in the method signature.Justify how to use this method and catch the custom exception.
package practice_java;

	
	class InvalidInputException extends Exception {
	    public InvalidInputException(String message) {
	        super(message);
	    }
	}


public class pratice296 {
	    public static void validateNumber(int number) throws InvalidInputException {
	        if (number < 0) {
	            throw new InvalidInputException("Number cannot be negative");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            int userInput = -5;
	            validateNumber(userInput);
	            System.out.println("Number is valid: " + userInput);
	        } catch (InvalidInputException e) {
	            System.out.println("Custom Exception caught: " + e.getMessage());
	        }
	        
	        try {
	            int userInput = 90;
	            validateNumber(userInput);
	            System.out.println("Number is valid: " + userInput);
	        } catch (InvalidInputException e) {
	            System.out.println("Custom Exception caught: " + e.getMessage());
	        }
	    }
	}


