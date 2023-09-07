//create a program it will take string as input and use assertion is that string is polindrom or not
package practice_java;

import java.util.Scanner;

public class pratice305 {
           public static void main(String args[]) {
        	   Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a string ");
        	String str = sc.nextLine();
        	StringBuffer sb = new StringBuffer(str);
        	String str1 = sb.reverse().toString();
        	try {
        		
        		assert str.equals(str1):"Not a polindrome";
        		
        	}catch(AssertionError e) {
        		System.out.println(e.getMessage());
        	}
        		System.out.println("string "+str);
        	
        }

        }

