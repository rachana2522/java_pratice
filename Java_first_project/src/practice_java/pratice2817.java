//Write a program that takes two numbers as input and calculates their division.If the denominator is zero, throw an 'ArithmeticException'. Use try-catch to handle the exception.
package practice_java;



	import java.util.Scanner;

	public class pratice2817 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the numerator: ");
	        int numerator = scanner.nextInt();

	        System.out.print("Enter the denominator: ");
	        int denominator = scanner.nextInt();

	        try {
	            double result = divideNumbers(numerator, denominator);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
	        }
	    }

	    public static double divideNumbers(int numerator, int denominator) throws ArithmeticException {
	        if (denominator == 0) {
	            throw new ArithmeticException("Denominator cannot be zero.");
	        }

	        return (double) numerator / denominator;
	    }
	}


