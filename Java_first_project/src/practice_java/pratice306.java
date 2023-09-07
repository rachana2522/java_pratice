//write a program that uses annomus class to short an array of integer in ascnding order.
package practice_java;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

abstract class sortarr{
	abstract public void sort();
	
}

public class pratice306 {

	public static void main(String[] args) {
	    sortarr obj = new sortarr() {
	    	public void sort() {
	    		Scanner sc = new Scanner(System.in);
	    		System.out.println("Enter the length of the array");
	    		int len = sc.nextInt();
	    		int arr[] = new int[len];
	    		for(int i= 0;i<arr.length;i++) {
	    			arr[i] = sc.nextInt();
	    		}
	    		System.out.println("array is "+Arrays.toString(arr));
	    		Arrays.sort(arr);
	    		System.out.println("array afer sorting"+ Arrays.toString(arr));
	    	}
	    }
	    ;
	    obj.sort();
	    	}
}
	    	
	    
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	