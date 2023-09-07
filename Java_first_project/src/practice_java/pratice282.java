// write a program to create having password having 8 character , no space, alleast one uppercase. atleast one number, passwors proving message using try, catch 
package practice_java;
import java.util.Scanner;
public class pratice282 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc= new Scanner(System.in);
            try {
            	System.out.println("Enter password");
            	String password = sc.nextLine();
            	if
            		(password.length()<8){
            			throw  new Exception("The password having atleast 8 charecter");
            		}
            		if(password.matches("*.[A-Z].*")) {
            			throw new Exception("pASSWORD MOST CONTAIN ATLEAST UPPER CASH LETTER");
            		}
            		if(password.matches("*\\d.*")) {
            			throw new Exception("password most contain one dogit");
            		}
            			
            		if(password.matches("")) {
            			throw new Exception("password can tcontain  spaces");
            		}
            
            System.out.println("Password is valid: " + password);
        } catch (Exception e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
