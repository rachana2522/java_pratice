//Write a Java program to remove duplicate elements from a given array and return the updated array length.

//Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements, the program should return 4 as the new length of the array.

package assignment.com;

	import java.util.Arrays;
	public class assignment39 {
		
		    public static void main(String[] args) {
		        int[] nums = {20, 20, 30, 40, 50, 50, 50};
		        int newLength = removeDuplicates(nums);
		        
		        System.out.println("Updated array length: " + newLength);
		    }

		    public static int removeDuplicates(int[] nums) {
		        if (nums.length <= 1) {
		            return nums.length;
		        }

		        int newIndex = 1;
		        for (int i = 1; i < nums.length; i++) {
		            if (nums[i] != nums[newIndex - 1]) {
		                nums[newIndex] = nums[i];
		                newIndex++;
		            }
		        }

		        return newIndex;
		    }
		}
