//write a method that calculates division of two integers and might throw an arithemtic exception. use the throw keyword in the method to indicate that the exception is thrown demonstartae how to call this method within a try catch block to handke tyhe exception
package practice_java;

public class pratice288 {
           public static int divide(int dividend , int divisor) throws ArithmeticException{
        	   if(divisor ==0) {
        		   throw new ArithmeticException("cant be divided by zero");
        	   }
        	   return dividend/divisor;
           }


    public static void main(String[] args) {
    	
    	
    	try {
    		int dividend = 10;
    		int divisor = 0;
    		int result = divide(dividend, divisor);
    		System.out.println("Result:"+result);
    	}
    	catch(ArithmeticException e) {
    		System.out.println("Error:"+e.getMessage());
        }
    }
}

