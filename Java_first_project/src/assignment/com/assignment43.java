//Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.

package assignment.com;


	import java.util.Arrays;

	public class assignment43 {
	    public static void main(String[] args) {
	        int[] nums = {5, 2, 9, 1, 5, 6};
	        int[] result = sortMinMax(nums);

	        System.out.println("Sorted array with alternating max-min values:");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }

	    public static int[] sortMinMax(int[] nums) {
	        Arrays.sort(nums);
	        int n = nums.length;
	        int[] result = new int[n];

	        int left = 0, right = n - 1;
	        for (int i = 0; i < n; i++) {
	            if (i % 2 == 0) {
	                result[i] = nums[right--]; // Put the max values
	            } else {
	                result[i] = nums[left++];  // Put the min values
	            }
	        }

	        return result;
	    }
	}


