//Create a method that accepts an age as input and throws an 'IllegalArgumentException' if the age is negative.Write a program to call this method and handle the exception using a try-catch block.
package practice_java;
class AgeValidator {
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}

public class pratice2819 {
    public static void main(String[] args) {
        int age = -5; // You can change this to test different ages
        
        try {
            AgeValidator.validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}


