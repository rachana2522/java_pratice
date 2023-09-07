////read a program which is take integer as user input  throe expection if user input duplicate when the program will throw error.
package practice_java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pratice284 {

	
	    public static void main(String[] args) {
	        Set<Integer> numSet = new HashSet<>(); // Set to store unique numbers
	        Scanner scanner = new Scanner(System.in);

	        try {
	            while (true) {
	                System.out.print("Enter an number: ");
	                int userInput = scanner.nextInt();
	                if (numSet.contains(userInput)) {
	                    throw new IllegalArgumentException("Duplicate input detected!");
	                }
	                numSet.add(userInput);
	            }
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Invalid input. Please enter an integer.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
