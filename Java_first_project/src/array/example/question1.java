//Write a Java program to sort a numeric array and a string array
package array.example;
import java.util.Arrays;
public class question1 {
	
public static void main(String[]args) {
	int[] my_array1= { 2001,1967,7812,2002,1987,9001,3002,1976};
	
	String[] my_array2= {"java","python","c","go"};
	System.out.println("original numeric array:" +Arrays.toString(my_array1
		));
	Arrays.sort(my_array1);
	System.out.println("Sorted array:"+Arrays.toString(my_array1));
	System.out.println("original numeric array:" +Arrays.toString(my_array2));
	Arrays.sort(my_array2);
	System.out.println("Sorted array:"+Arrays.toString(my_array2));
}
}
