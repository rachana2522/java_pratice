//palingrom
package practice_java;
import java.util.Scanner;
public class pratice292 {
	

	
	    public static boolean isPalindrome(String input) {
	        
	        String cleanedInput = input.replaceAll(" ", "").toLowerCase();
	        
	        
	        return cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();
	        scanner.close();

	        if (isPalindrome(userInput)) {
	            System.out.println("The input string is a palindrome.");
	        } else {
	            System.out.println("The input string is not a palindrome.");
	        }
	    }
	}

	

