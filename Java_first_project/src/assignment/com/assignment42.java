//Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.  
//Note: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.
package assignment.com;


	import java.util.Arrays;

	public class assignment42 {
	    public static void main(String[] args) {
	        int[] nums = {4, 3, 7, 2, 9, 10};
	        int count = countTriangles(nums);

	        System.out.println("Number of possible triangles: " + count);
	    }

	    public static int countTriangles(int[] nums) {
	        Arrays.sort(nums); // Sort the array to make it easier to check the triangle inequality

	        int count = 0;

	        for (int i = 0; i < nums.length - 2; i++) {
	            int k = i + 2;
	            for (int j = i + 1; j < nums.length - 1; j++) {
	                while (k < nums.length && nums[i] + nums[j] > nums[k]) {
	                    k++;
	                }
	                count += k - j - 1; // Count triangles using the current elements i and j
	            }
	        }

	        return count;
	    }
	}


