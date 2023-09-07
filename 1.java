
import java.util.Scanner;

public class 1 {
	
//	public class encapsulationex{
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			2 ee = new 2();
			System.out.println("Enter your id:");
			ee.setId(sc.nextInt());
			System.out.println("Enter your name:");
			ee.setName(sc.next());
			System.out.println("Enter your password:");
			ee.setPassword(sc.next());
			System.out.println("id:"+ee.getId());
			System.out.println("Name:"+ee.getName());
			System.out.println("Password:"+ee.getPassword());
			
		}
	}

