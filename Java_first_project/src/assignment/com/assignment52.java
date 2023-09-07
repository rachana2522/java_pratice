//Write a Java program to replace each element of the array with the product of every other element in a given array of integers.  

//Example:
//Input:
//nums1 = {1, 2, 3, 4, 5, 6, 7}
//nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
//Output:
//Array with product of every other element:
//[5040, 2520, 1680, 1260, 1008, 840, 720]
//
//Array with product of every other element:
//[5040, 0, 0, 0, 0, 0, 0, 0]

package assignment.com;

public class assignment52 {

	
	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
	        int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};

	        replaceWithProduct(nums1);
	        replaceWithProduct(nums2);

	        System.out.println("Array with product of every other element:");
	        printArray(nums1);

	        System.out.println("\nArray with product of every other element:");
	        printArray(nums2);
	    }

	    public static void replaceWithProduct(int[] nums) {
	        int n = nums.length;

	        // Calculate the product of all elements
	        int totalProduct = 1;
	        int zeroCount = 0; // Count of zeros in the array

	        for (int num : nums) {
	            if (num != 0) {
	                totalProduct *= num;
	            } else {
	                zeroCount++;
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            if (zeroCount > 1) {
	                nums[i] = 0;
	            } else if (zeroCount == 1) {
	                nums[i] = nums[i] == 0 ? totalProduct : 0;
	            } else {
	                nums[i] = totalProduct / nums[i];
	            }
	        }
	    }

	    public static void printArray(int[] arr) {
	        System.out.print("[");
	        for (int num : arr) {
	            System.out.print(num + ", ");
	        }
	        System.out.println("]");
	    }
	}

