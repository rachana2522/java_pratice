//create a program that claculate the factorial of given positive integer use assertion to verify factorial calculation is correct.
package practice_java;

import java.util.Scanner;

public class pratice303 {
	        if (n < 0) {
	            throw new IllegalArgumentException("Input must be a positive integer");
	        }

	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        long factorial = 1;
	        for (int i = 2; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    public static void main(String[] args) {
	        try {
	            int input = 5; // Replace with your desired input
	            long calculatedFactorial = calculateFactorial(input);
	            
	            // Verify the calculation using assertion
	            assert calculatedFactorial == 120 : "Factorial calculation is incorrect";

	            System.out.println("Factorial of " + input + " is: " + calculatedFactorial);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

		private static long calculateFactorial(int input) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	
	}
	}
	
	
	