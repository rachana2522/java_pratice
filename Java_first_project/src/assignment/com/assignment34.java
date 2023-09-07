//Write a Java program that accepts two floating­point numbers and     checks whether they are the same up to two decimal places.

//Test Data
//Input first floating­point number: 1235
//Input second floating­point number: 2534
//Expected Output:
//
//These numbers are different.

package assignment.com;
import java.util.Scanner;
public class assignment34 {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Input first floating number: ");
	        double number1 = scanner.nextDouble();
	        
	        System.out.print("Input second floating number: ");
	        double number2 = scanner.nextDouble();
	        
	        if (areAlmostEqual(number1, number2)) {
	            System.out.println("These numbers are the same up to two decimal places.");
	        } else {
	            System.out.println("These numbers are different.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean areAlmostEqual(double num1, double num2) {
	        // Multiply both numbers by 100 and convert to integers to compare up to two decimal places
	        int scaledNum1 = (int) (num1 * 100);
	        int scaledNum2 = (int) (num2 * 100);
	        
	        return scaledNum1 == scaledNum2;
	    }
	}

	


