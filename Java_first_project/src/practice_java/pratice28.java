//create a program if a person age limit <18 the he/she is not eligible for learner license.
package practice_java;
import java.util.Scanner;
public class pratice28 {
		    public static void main(String[] args) {
		    	
		    	Scanner sc = new Scanner(System.in);
		    	System.out.print("Enter your age:");
		    	int age = sc.nextInt();
		    	Eligibility(age);
		    	
		}

			private static void Eligibility(int age) {
				// TODO Auto-generated method stub
				
				try{
					
				if(age<18) {
					throw new Exception("Age limmit for licences");
				}else {
						System.out.println("you are eligible");
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				}
			}

