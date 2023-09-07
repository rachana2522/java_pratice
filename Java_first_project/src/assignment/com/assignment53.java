//Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.

//Test Data
//Input first floating­point number: 1235
//Input second floating­point number: 2534
//Expected Output:
//
//These numbers are different.
package assignment.com;
import java.util.Scanner;
public class assignment53 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input first floating-point number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Input second floating-point number: ");
	        double num2 = scanner.nextDouble();

	        if (areAlmostEqual(num1, num2, 2)) {
	            System.out.println("These numbers are the same up to two decimal places.");
	        } else {
	            System.out.println("These numbers are different.");
	        }
	    }

	    public static boolean areAlmostEqual(double num1, double num2, int decimalPlaces) {
	        double multiplier = Math.pow(10, decimalPlaces);
	        int intNum1 = (int) (num1 * multiplier);
	        int intNum2 = (int) (num2 * multiplier);

	        return intNum1 == intNum2;
	    }
	}


