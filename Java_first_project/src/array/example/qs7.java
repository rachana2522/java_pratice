//Write a Java program to remove a specific element from an array.
package array.example;

import java.util.Arrays;

public class qs7 {
	public static void main(String[] args) {
	int [] my_array= {23,56,62,34};
	System.out.println("original index:" +Arrays.toString(my_array));
	int removeIndex =1;
	for(int i = removeIndex; i<my_array.length -1;i++) {
		my_array[i] = my_array[i+1];
	}
	System.out.println("After removing the second element:" + Arrays.toString(my_array));
	}
		
}
