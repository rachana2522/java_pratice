//create a program to read a file throw exception if file is empty
package practice_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pratice286 {
    	    public static void main(String[] args) {
    	        try {
    	            String fileName = "input.txt"; // Replace with your file name
    	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
    	            
    	            if (reader.readLine() == null) {
    	                reader.close();
    	                throw new IOException("File is empty");
    	            }
    	            
    	            reader.close();
    	            System.out.println("File is not empty.");
    	        } catch (IOException e) {
    	            System.out.println("Error: " + e.getMessage());
    	        }
    	    }
    	}
