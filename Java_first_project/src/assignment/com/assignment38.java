//Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.

package assignment.com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class assignment38 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }
            
            reader.close();
            System.out.println("No positive numbers found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}


