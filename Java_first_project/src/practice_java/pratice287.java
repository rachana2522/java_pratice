//create a program to create a file throe exception if file is not found in java
package practice_java;
import java.io.File;
import java.io.IOException;

public class pratice287 {
public static void main(String args[]) throws IOException {
	String fileName = "example.txt";
	File file = new File(fileName);
	if (!file.exists()) {
		if(file.createNewFile()) {
			System.out.println("File created:"+file.getName());
		}
		else {
			throw new IOException("Unable to create the file");
		}
	}
		else {
			System.out.println("File is already exits:"+file.getName());
		}
	}
}
