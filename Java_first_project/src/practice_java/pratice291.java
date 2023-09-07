// create a program which will take two string and ckeck  if the second string is the rotation of other.
package practice_java;

import java.util.Scanner;

public class pratice291 {

public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first string:");
	        String str1 = scanner.nextLine();

	        System.out.println("Enter the second string:");
	        String str2 = scanner.nextLine();

	        boolean isRotation = checkRotation(str1, str2);

	        if (isRotation) {
	            System.out.println("The second string is a rotation of the first string.");
	        } else {
	            System.out.println("The second string is not a rotation of the first string.");
	        }

	        scanner.close();
	    }

	    public static boolean checkRotation(String str1, String str2) {
	        // Check if both strings have the same length and are not empty
	        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
	            return false;
	        }

	        // Use StringBuilder or StringBuffer to perform rotation check
	        StringBuilder concatenated = new StringBuilder(str1).append(str1);
	        // StringBuffer concatenated = new StringBuffer(str1).append(str1);

	        // Check if the second string is equal to the reversed concatenated string
	        return concatenated.toString().equals(new StringBuilder(str2).reverse().toString());
	    }
	}
