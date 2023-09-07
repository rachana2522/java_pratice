//using recusion find out the factorial if 20.
package practice_java;

public class pratice128 {

	
	public static long factorial(int n) {
		if (n==0 || n ==1) {
		return 1;
	}else{
		return n *factorial(n-1);
	}
		
	}
	
	 public static void main(String[] args) {
		        int number = 20;
		        long result = factorial(number);
		        System.out.println("Factorial of " + number + ": " + result);
		    }
		}


	









