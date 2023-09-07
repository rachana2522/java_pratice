//create a program using string class to given input string  check wheather the string is reversed or not
package practice_java;
import java.util.Scanner;
public class pratice293 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	        boolean isReversed = checkIfReversed(inputString);

	        if (isReversed) {
	            System.out.println("The string is reversed.");
	        } else {
	            System.out.println("The string is not reversed.");
	        }

	        scanner.close();
	    }

	    public static boolean checkIfReversed(String str) {
	        // Create a new StringBuilder and reverse the input string
	        String reversed = new StringBuilder(str).reverse().toString();

	        // Compare the reversed string with the input string
	        return reversed.equals(str);
	    }
	}

