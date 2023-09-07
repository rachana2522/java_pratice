//create a program that reads a paragharf of text and uses stringbuilder to reverse the string aand convert into  upper case
package practice_java;
import java.util.Scanner;
public class pratice29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String inputtext = sc.nextLine();
          StringBuilder reversetext = new StringBuilder(inputtext);
		   reversetext.reverse();
		       String reverseUppercasetext = reversetext.toString().toUpperCase();
		        
		   System.out.println("Reversed and upper case");
		        System.out.println(reverseUppercasetext);
		        
		       
		    }
		


	}


