//create a class that reads conatins from a fila and might throw a file not found extension. declare the appropriate exception and demonstrate how to use this class to use this within a try catch block.
package practice_java;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderExample{
    private String filename;

    
    public FileReaderExample(String filePath) {
        this.filename = filePath;
    }

    public String readContent() throws FileNotFoundException, IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}


public class pratice289 {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Replace with the actual file path

        try {
        	
        	FileReaderExample fileReader = new FileReaderExample(filename);
        	String content = fileReader.readContent();
            System.out.println("File content:\n" + content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
