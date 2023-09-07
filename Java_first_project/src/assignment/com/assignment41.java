//Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
//Sample array: [1, -2, 0, 5, -1, -4]
//Target value: 2.

package assignment.com;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class assignment41 {
	    public static void main(String[] args) {
	        int[] nums = {1, -2, 0, 5, -1, -4};
	        int target = 2;

	        List<List<Integer>> result = findTriplets(nums, target);

	        System.out.println("Distinct triplets with sum " + target + ":");
	        for (List<Integer> triplet : result) {
	            System.out.println(triplet);
	        }
	    }

	    public static List<List<Integer>> findTriplets(int[] nums, int target) {
	        Arrays.sort(nums); // Sorting the array is important to handle duplicates

	        List<List<Integer>> triplets = new ArrayList<>();
	        
	        for (int i = 0; i < nums.length - 2; i++) {
	            if (i > 0 && nums[i] == nums[i - 1]) {
	                continue; // Skip duplicates
	            }

	            int left = i + 1;
	            int right = nums.length - 1;

	            while (left < right) {
	                int sum = nums[i] + nums[left] + nums[right];
	                
	                if (sum == target) {
	                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));

	                    // Skip duplicates
	                    while (left < right && nums[left] == nums[left + 1]) {
	                        left++;
	                    }
	                    while (left < right && nums[right] == nums[right - 1]) {
	                        right--;
	                    }

	                    left++;
	                    right--;
	                } else if (sum < target) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	        }

	        return triplets;
	    }
	}


