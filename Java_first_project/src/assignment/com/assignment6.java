package assignment.com;

import java.util.Scanner;

public class assignment6 {

	private static int num1;
	private static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first floating number: ");
        double number1 = sc.nextDouble();
	     System.out.print("Input secdd floating number: ");
          double number2 = sc.nextDouble();
          if(numberalso(number1, number2)) {
        	  System.out.println("deciml number");
          }
          else {
        	  System.out.println("OKAY NUM");
          }
          }
	private static boolean numberalso(double number1, double number2) {
		// TODO Auto-generated method stub
		int scaledNum1 = (int) (num1 * 100);
        int scaledNum2 = (int) (num2 * 100);
        
        return scaledNum1 == scaledNum2;

	}
}

