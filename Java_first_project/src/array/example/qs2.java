// Write a Java program to sum values of an array.
package array.example;

public class qs2 {

public static void main(String args[]) {
	int my_array[] = {1,3,26,78,34,68};
	int sum = 0;
	for(int i:my_array)
		sum+=i;
	System.out.println("This is sum:"+sum);
	
}
}
