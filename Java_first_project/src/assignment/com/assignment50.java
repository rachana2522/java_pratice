//Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.  

//Example:
//Input:
//nums= {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14}
//Output:
//Array with every second element is greater than its left and right elements:
//[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]

package assignment.com;

public class assignment50 {
	
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
	        rearrangeArray(nums);

	        System.out.print("Array with every second element is greater than its left and right elements:\n[");
	        for (int num : nums) {
	            System.out.print(num + ", ");
	        }
	        System.out.println("]");
	    }

	    public static void rearrangeArray(int[] nums) {
	        int n = nums.length;

	        for (int i = 1; i < n - 1; i += 2) {
	            if (nums[i] < nums[i - 1]) {
	                swap(nums, i, i - 1);
	            }
	            if (nums[i] < nums[i + 1]) {
	                swap(nums, i, i + 1);
	            }
	        }
	    }

	    public static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	}
