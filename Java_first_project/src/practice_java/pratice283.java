//read a program which is take integer as user input when the program will throw error.
package practice_java;

import java.util.Scanner;

public class pratice283 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");

		   int userinput = sc.nextInt();
		   if(userinput<0) {
			   throw new Exception("input can't negative");
		   }
		   System.out.println("You entered:" +userinput);
	}
		
}

