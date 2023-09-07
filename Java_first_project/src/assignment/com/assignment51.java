//Write a Java program to find equilibrium indices in a given array of integers.  

//Example:
//Input:
//nums = {-7, 1, 5, 2, -4, 3, 0}
//Output:
//Equilibrium indices found at: 3
//Equilibrium indices found at: 6.

package assignment.com;

public class assignment51 {
	
	    public static void main(String[] args) {
	        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
	        findEquilibriumIndices(nums);
	    }

	    public static void findEquilibriumIndices(int[] nums) {
	        int n = nums.length;
	        int[] prefixSum = new int[n];
	        int[] suffixSum = new int[n];

	        prefixSum[0] = nums[0];
	        for (int i = 1; i < n; i++) {
	            prefixSum[i] = prefixSum[i - 1] + nums[i];
	        }

	        suffixSum[n - 1] = nums[n - 1];
	        for (int i = n - 2; i >= 0; i--) {
	            suffixSum[i] = suffixSum[i + 1] + nums[i];
	        }

	        for (int i = 0; i < n; i++) {
	            if (i == 0 && suffixSum[i + 1] == 0) {
	                System.out.println("Equilibrium indices found at: " + i);
	            } else if (i == n - 1 && prefixSum[i - 1] == 0) {
	                System.out.println("Equilibrium indices found at: " + i);
	            } else if (i > 0 && i < n - 1 && prefixSum[i - 1] == suffixSum[i + 1]) {
	                System.out.println("Equilibrium indices found at: " + i);
	            }
	        }
	    }
	}

