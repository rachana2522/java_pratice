//Design a class representing a network connection that might throw an 'IOException'.Define methods to open, read, and close the connection, and use the 'throws' keyword to indicate potential exceptions.Demonstrate how to handle exceptions when using these methods.
package practice_java;
import java.io.IOException;


	class NetworkConnection implements AutoCloseable {
	    
	    public void openConnection() throws IOException {
	       
        boolean isConnected = "/* Some condition indicating successful connection */" != null;
	        if (!isConnected) {
	            throw new IOException("Failed to open connection");
	        }
	        System.out.println("Connection opened successfully");
	    }
             public  void readData() throws IOException{
	         boolean dataAvailable = "/* Some condition indicating data availability */"!= null;
             
	          if(!dataAvailable) {
	    	  throw new IOException("Failed to read data");
	    
	         }
	         System.out.println("Data read successfully");
	           }
	
	    @Override
	    public void close() throws IOException {
	       
	        boolean isClosed = "/* Some condition indicating successful closing */" != null;
	        if (!isClosed) {
	            throw new IOException("Failed to close connection");
	        }
	        System.out.println("Connection closed successfully");
	    }
	}

	public class pratice297 {
	    public static void main(String[] args) {
	        try (NetworkConnection connection = new NetworkConnection()) {
	            connection.openConnection();
	            connection.readData();
	        } catch (IOException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}

	
	   

