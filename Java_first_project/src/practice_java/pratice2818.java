//Define a method that calculates the square root of a non-negative number and throws an 'ArithmeticException' if the input is negative.Implement a try-catch block to handle the exception and provide appropriate user feedback.
package practice_java;
import java.util.Scanner;

public class pratice2818 {

    public static double calculateSquareRoot(double number) throws ArithmeticException {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }

        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        double inputNumber = scanner.nextDouble();

        try {
            double result = calculateSquareRoot(inputNumber);
            System.out.println("Square root of " + inputNumber + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}


