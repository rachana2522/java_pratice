//create a program that takes string input.that will throe exceptoon if the string doesnot contain vowel.
package practice_java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pratice285 {
	
	public static boolean containsVowel(String s) {
        String vowels = "AEIOUaeiou";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            if (!containsVowel(inputString)) {
                throw new IllegalArgumentException("String must contain at least one vowel");
            }
            
            try {
                FileWriter fileWriter = new FileWriter("output.txt");
                fileWriter.write("Input string: " + inputString + "\n");
                fileWriter.write("String contains a vowel.\n");
                fileWriter.close();
                System.out.println("String contains a vowel. Details written to 'output.txt'");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}