//Write a Java program to find the maximum product of two integers in a given array of integers.  

//Example:
//Input:
//nums = {2, 3, 5, 7, -7, 5, 8, -5 }
//Output:
//Pair is (7, 8), Maximum Product: 56

package assignment.com;

public class assignment49 {

	    public static void main(String[] args) {
	        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
	        int[] result = findMaxProductPair(nums);

	        System.out.println("Pair is (" + result[0] + ", " + result[1] + "), Maximum Product: " + (result[0] * result[1]));
	    }

	    public static int[] findMaxProductPair(int[] nums) {
	        if (nums.length < 2) {
	            throw new IllegalArgumentException("Array should have at least two elements");
	        }

	        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
	        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

	        for (int num : nums) {
	            if (num > max1) {
	                max2 = max1;
	                max1 = num;
	            } else if (num > max2) {
	                max2 = num;
	            }

	            if (num < min1) {
	                min2 = min1;
	                min1 = num;
	            } else if (num < min2) {
	                min2 = num;
	            }
	        }

	        // Compare the products of the two largest positives and the two smallest negatives
	        if ((max1 * max2) > (min1 * min2)) {
	            return new int[]{max1, max2};
	        } else {
	            return new int[]{min1, min2};
	        }
	    }
	}

	

