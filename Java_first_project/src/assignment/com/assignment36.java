//Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

//Test Data
//Input a number: -2534
//Expected Output: Negative

package assignment.com;

import java.util.Scanner;

public class assignment36 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input a number: ");
	        double number = scanner.nextDouble();

	        if (number == 0) {
	            System.out.println("Zero");
	        } else if (number > 0) {
	            System.out.print("Positive ");
	        } else {
	            System.out.print("Negative ");
	        }

	        if (Math.abs(number) < 1) {
	            System.out.println("Small");
	        } else if (Math.abs(number) > 1000000) {
	            System.out.println("Large");
	        }

	        scanner.close();
	    }
	}
