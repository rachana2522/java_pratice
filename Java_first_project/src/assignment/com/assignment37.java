//Write a Java recursive method to count the number of occurrences of a specific element in an array.

package assignment.com;

public class assignment37 {
	public static void main(String[] args) {
        int[] array = {2, 4, 6, 4, 8, 4, 10};
        int target = 4;

        int count = countOccurrences(array, target, 0);
        System.out.println("Number of occurrences of " + target + ": " + count);
    }

    public static int countOccurrences(int[] arr, int target, int index) {
        // Base case: if the index goes out of bounds, return 0
        if (index >= arr.length) {
            return 0;
        }

        // Recursive case:
        // Increment count by 1 if the current element matches the target
        int count = (arr[index] == target) ? 1 : 0;

        // Recur for the rest of the array and add up the counts
        return count + countOccurrences(arr, target, index + 1);
    }
}