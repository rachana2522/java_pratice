//Implement a program that reads data from a file and may throw a 'FileNotFoundException'.Throw this exception explicitly using the 'throw' keyword when the file is not found, and handle it using try-catch.
package practice_java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class pratice2814 {
    public static void readFromFile(String filename) throws FileNotFoundException, IOException {
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw e; 
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static void main(String[] args) {
        String filename = "nonexistent.txt";

        try {
            readFromFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}


