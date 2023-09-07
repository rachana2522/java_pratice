//Write a Java program to print the following grid.
package array.example;

public class qs4 {
	public static void main(String args[]) {
		
		int[] numbers = new int[] {5,8,62,18
	};
		int sum = 0;
		for(int i = 0;i<numbers.length;i++) {
			sum = sum+numbers[i];
			double average = sum/numbers.length;
			System.out.println("Average value of the array elements:" + average);
		}

}
}
