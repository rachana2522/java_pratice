//create a program to design a calculator using anomus class where is addition, substraction, multification, division.
package practice_java;

import java.util.Scanner;

interface CalculatorOperation {
    double perform(double num1, double num2);
}

public class pratice307 {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);

		        CalculatorOperation addition = new CalculatorOperation() {
		            
		            public double perform(double num1, double num2) {
		                return num1 + num2;
		            }
		        };

		        CalculatorOperation subtraction = new CalculatorOperation() {
		           
		            public double perform(double num1, double num2) {
		                return num1 - num2;
		            }
		        };
		        

		        CalculatorOperation multiplication = new CalculatorOperation() {
		       
		            public double perform(double num1, double num2) {
		                return num1 * num2;
		            }
		        };

		        CalculatorOperation division = new CalculatorOperation() {
		        
		            public double perform(double num1, double num2) {
		                if (num2 != 0) {
		                    return num1 / num2;
		                } else {
		                    throw new IllegalArgumentException("Division by zero is not allowed.");
		                }
		            }
		        };
		        
		        
		        
		        System.out.println("Enter opertion(add/sub/div/mul):");
		        String opertion = scanner.nextLine();

		        System.out.print("Enter first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter second number: ");
		        double num2 = scanner.nextDouble();

		        double result;

		        switch (opertion) {
		            case "add":
		                result = addition.perform(num1, num2);
		                break;
		            case "sub":
		                result = subtraction.perform(num1, num2);
		                break;
		            case "mul":
		                result = multiplication.perform(num1, num2);
		                break;
		            case "div":
		                result = division.perform(num1, num2);
		                break;
		            default:
		                System.out.println("Invalid operation.");
		                return;
		        }

		        System.out.println("Result: " + result);

		        scanner.close();
		    }
		}
