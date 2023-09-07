//Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.  

//Example:
//Input:
//nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2}
//nums2 = {1, 2, -3, 4, 5, 6}
//nums3= {1, 2, -2, 3, 4, 5, 6}
//
//Output:
//Sub-arrays with 0 sum: [1, 3, -7, 3]
//Sub-arrays with 0 sum: [3, -7, 3, 2, 3, 1, -3, -2]
//
//Sub-arrays with 0 sum: [1, 2, -3]
//Sub-arrays with 0 sum: [2, -2]

package assignment.com;


	import java.util.ArrayList;
	import java.util.HashMap;

	public class assignment46 {
	    public static void main(String[] args) {
	        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
	        int[] nums2 = {1, 2, -3, 4, 5, 6};
	        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

	        printSubarraysWithZeroSum(nums1);
	        printSubarraysWithZeroSum(nums2);
	        printSubarraysWithZeroSum(nums3);
	    }

	    public static void printSubarraysWithZeroSum(int[] nums) {
	        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        int prefixSum = 0;

	        for (int i = 0; i < nums.length; i++) {
	            prefixSum += nums[i];
	            if (prefixSum == 0) {
	                ArrayList<Integer> subarray = new ArrayList<>();
	                subarray.add(0, 0);
	                subarray.add(1, i);
	                result.add(subarray);
	            }

	            if (map.containsKey(prefixSum)) {
	                ArrayList<Integer> indexes = map.get(prefixSum);
	                for (int index : indexes) {
	                    ArrayList<Integer> subarray = new ArrayList<>();
	                    subarray.add(index + 1);
	                    subarray.add(i);
	                    result.add(subarray);
	                }
	            }

	            if (!map.containsKey(prefixSum)) {
	                map.put(prefixSum, new ArrayList<>());
	            }
	            map.get(prefixSum).add(i);
	        }

	        for (ArrayList<Integer> subarray : result) {
	            System.out.print("Sub-arrays with 0 sum: ");
	            for (int i = subarray.get(0); i <= subarray.get(1); i++) {
	                System.out.print(nums[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


