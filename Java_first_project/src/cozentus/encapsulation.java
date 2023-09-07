package cozentus;
import java.util.Scanner;
public class encapsulation {
	
//	public class encapsulationex{
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			encapsulationex ee = new encapsulationex();
			System.out.println(". A password must have at least eight characters:");
			ee.setId(sc.nextInt());
			System.out.println(" A password consists of only letters and digits:");
			ee.setName(sc.next());
			System.out.println("valid: abcd1234:");
			
			ee.setPassword(sc.next());
			System.out.println("id:"+ee.getId());
			System.out.println("Name:"+ee.getName());
			System.out.println("Password:"+ee.getPassword());
			
		}
	}

