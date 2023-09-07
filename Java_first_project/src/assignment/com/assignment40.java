//Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.

//Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
//The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.

package assignment.com;


	import java.util.HashSet;
	public class assignment40 {
	    public static void main(String[] args) {
	        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
	        int longestSequenceLength = longestConsecutive(nums);
	        
	        System.out.println("Length of the longest consecutive sequence: " + longestSequenceLength);
	    }

	    public static int longestConsecutive(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }

	        HashSet<Integer> numSet = new HashSet<>();
	        for (int num : nums) {
	            numSet.add(num);
	        }

	        int longestSequence = 0;

	        for (int num : nums) {
	            if (!numSet.contains(num - 1)) {
	                int currentNum = num;
	                int currentStreak = 1;

	                while (numSet.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }

	                longestSequence = Math.max(longestSequence, currentStreak);
	            }
	        }

	        return longestSequence;
	    }
	}

