//Write a Java program to check if a given array contains a subarray with 0 sum.  

//Example:
//Input:
//nums1= {1, 2, -2, 3, 4, 5, 6 }
//nums2 = {1, 2, 3, 4, 5, 6 }
//nums3 = {1, 2, -3, 4, 5, 6 }
//Output:
//Does the said array contain a subarray with 0 sum: true
//Does the said array contain a subarray with 0 sum: false
//Does the said array contain a subarray with 0 sum: true

package assignment.com;

	import java.util.HashSet;

	public class assignment45 {
	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, -2, 3, 4, 5, 6};
	        int[] nums2 = {1, 2, 3, 4, 5, 6};
	        int[] nums3 = {1, 2, -3, 4, 5, 6};

	        System.out.println("Does the array contain a subarray with 0 sum: " + hasSubarrayWithZeroSum(nums1));
	        System.out.println("Does the array contain a subarray with 0 sum: " + hasSubarrayWithZeroSum(nums2));
	        System.out.println("Does the array contain a subarray with 0 sum: " + hasSubarrayWithZeroSum(nums3));
	    }

	    public static boolean hasSubarrayWithZeroSum(int[] nums) {
	        HashSet<Integer> prefixSums = new HashSet<>();
	        int prefixSum = 0;

	        for (int num : nums) {
	            prefixSum += num;
	            if (prefixSum == 0 || prefixSums.contains(prefixSum)) {
	                return true;
	            }
	            prefixSums.add(prefixSum);
	        }

	        return false;
	    }
	}

