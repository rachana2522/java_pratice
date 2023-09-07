//Define a method that reads an integer from the user and throws a 'NumberFormatException' if the input is not a valid integer.Use try-catch to handle the exception and prompt the user for input again.
package practice_java;
import java.util.Scanner;

public class pratice2815 {
    public static int readIntegerFromUser() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();

            try {
                int num = Integer.parseInt(input);
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void main(String[] args) {
        int userInteger = readIntegerFromUser();
        System.out.println("You entered: " + userInteger);
    }
}


